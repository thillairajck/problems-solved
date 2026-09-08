import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prve;
    Node(int d){
        this.data=d;
        this.next=null;
        this.prve=null;
        
    }
}
public class doublyLinkedList {
    Node head=null;
    Node tail=null;
    void insertatbegin(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head.prve=newnode;
            head=newnode;
            
        }
    }
    void insertatend(int data){
        Node newnode=new Node(data);
        if(head==null)
            head=newnode;
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;
            newnode.prve=temp;
        }
    }
    void deleteatbegin(){
        if(head==null){
            System.out.println("Empty List");
        }
        else{
            head=head.next;
            head.prve=null;
        }
    }
    void deleteatend(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        if(head.next==null)
            head=null;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prve.next=null;
        }
    }
    void traverse(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }
        System.out.print("\n");
    }
    void search(int key){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==key){
                System.out.println("The value "+key+" is found");
                return;
            }
        }
        System.out.println("The value "+key+" is not found");
    }
    public static void main(String[] args) {
        doublyLinkedList dl=new doublyLinkedList();
        Scanner sc=new Scanner(System.in);
        String C;
        int data;
        do {
            System.out.print("Enter Your Choice(enter 'exit' to stop):"); 
            C=sc.next();
            C=C.toLowerCase();
            switch (C) {
                case "insertatbegin":
                    System.out.print("Enter the value:");
                    data=sc.nextInt();
                    dl.insertatbegin(data);
                    break;
                case "insertatend":
                     System.out.print("Enter the value:");
                    data=sc.nextInt();
                    dl.insertatend(data);
                    break;
                case "deleteatbegin":
                    dl.deleteatbegin();
                    break;
                case "deleteatend":
                    dl.deleteatend();
                    break;
                case "search":
                    System.out.print("Enter the value to search:");
                    data=sc.nextInt();
                    dl.search(data);
                    break;
                case "traverse":
                    dl.traverse();
                    break;
                case "exit":
                    break;
                default:
                    System.err.println("!!! Invaild input !!!");
            }
        if(C.equals("exit")){
            System.out.println("Thank for using Doubly Linked List");
            break;
        }

        } while (true);
    }
}
