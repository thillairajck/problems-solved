import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }

}
public class SinglyLinkedList {
    Node head=null;
    void InsertAtEnd(int data){
        Node newnode=new Node(data);
        if(head==null)
            head=newnode;
        else{
            Node temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=newnode;
        }
    }
    void InsertAtBegin(int data){
        Node newnode=new Node(data);
        if(head==null)
            head=newnode;
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    void DeleteAtBegin(){
        if(head==null)
            System.out.println("Empty list");
        else
            head=head.next;
    }
    void DeleteAtEnd(){
        if(head==null)
            System.out.println("Empty list");
        else{
            if(head.next==null)
                head=null;
            else{
                Node temp=head;
                Node prvs =null;
                while(temp.next!=null){
                    prvs=temp;
                    temp=temp.next;
                }
                prvs.next=null;
            }
        }
    }
    void Traverse(){
        if(head==null)
            System.out.println("list is empty");
        else{
            Node temp=head;
            int  i=1;
            while (temp.next!=null) { 
                System.out.println("Node "+i+" is "+temp.data);
                temp=temp.next;
                i++;
            }
            System.out.println("Node "+i+" is "+temp.data);
            System.out.print("\n");
        }
    }
    void InsertAtSpcificPosition(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the position:");
        int n=sc.nextInt();
        System.out.print("Enter the value to insert:");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        if(head==null)
            head=newnode;
        else{
            Node temp=head;
            Node prvs=null;
            
            for(int i=1;i<n;i++){
                prvs=temp;
                temp=temp.next;
                if(prvs.next==null){
                    prvs.next=newnode;
                    break;
                }
            }
            prvs.next=newnode;
            newnode.next=temp;
        }
    }
    void Search(int key){
        if(head==null)
            System.out.println("List is Empty");
        else{
            Node temp=head;
            int i=1;
            while(temp.next!=null){
                if(temp.data==key){
                    System.out.println("The value "+key+" found at position "+i+'.');
                    break;
                }
                temp=temp.next;
                i++;
            }
        }
    }
    void DeleteSpecificValue(){
        Scanner sc=new Scanner(System.in);
        if(head==null)
            System.out.println("List is empty.");
        else{
            Node temp=head;
            Node prvs=null;
            System.out.print("Enter the value to delete:");
            int val=sc.nextInt();
            while(temp.next!=null){
                prvs=temp;
                temp=temp.next;
                if(temp.data==val | prvs.data==val){
                    if(prvs==head){
                        head=head.next;
                        break;
                    }
                    else{
                        prvs.next=temp.next;
                        temp.next=null;
                        break;
                    }
                }
               
            }
        }
    }
    void Update(){
        if(head==null)
            System.out.println("List is empty");
        else{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the position to update:");
            int pos=sc.nextInt();
            System.out.print("Enter the value to update:");
            int d=sc.nextInt();
            Node temp=head;
            if(pos==1)
                head.data=d;
            else{
            for(int i=1;i<pos;i++){
                if(temp.next==null){
                    temp.next.data=d;
                    break;
                }
                temp=temp.next;
            }
            temp.data=d;
        }
        }
    }
    void reverse(){
        Node current=head;
        Node pres=null;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=pres;
            pres=current;
            current=next;
        }
        head=pres;
    }
    void NumberOfNode(){
        Node temp=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        System.out.print("Number of node:"+l);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SinglyLinkedList sl=new SinglyLinkedList();
        int d;
        do {
            System.out.print("Enter yout choice(Type 'exit' to stop):");
             String C=sc.next();
            C=C.toLowerCase();
            switch(C){
                case "insertatend":
                    System.out.print("Enter the value to insert at end:");
                    d=sc.nextInt();
                    sl.InsertAtEnd(d);
                    break;
                case "insertatbegin":
                     System.out.print("Enter the value to insert at beginning:");
                    d=sc.nextInt();
                    sl.InsertAtBegin(d);
                    break;
                case "deleteatend":
                    sl.DeleteAtEnd();
                    break;
                case "deleteatbegin":
                    sl.DeleteAtBegin();
                    break;
                case "insertatspecific":
                    sl.InsertAtSpcificPosition();
                    break;
                case "traverse":
                    sl.Traverse();
                    break;
                case "deleteatspecific":
                    sl.DeleteSpecificValue();
                    break;
                case "search":
                    System.out.print("Enter the value to search:");
                    d=sc.nextInt();
                    sl.Search(d);
                    break;
                case "update":
                    sl.Update();
                    break;
                case "reverse":
                    sl.reverse();
                    break;
                case "Numberofnode":
                    sl.NumberOfNode();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("!!! Invalid Input !!!");
            }
            
        if(C.equals("exit"))
            break;
            
        } while (true);
        
    }
    
}
