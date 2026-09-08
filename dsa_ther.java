class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class dsa_ther {
    Node head=null;
    Node insert(Node head,int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newnode;
        return head;
    }
    Node merge(Node l1,Node l2){
        Node temp=l1;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=l2;
        return temp;
    }
    void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        dsa_ther ml=new dsa_ther();
        Node l1=null;
        Node l2=null;
        l1=ml.insert(l1,10);
        l1=ml.insert(l1,20);
        l1=ml.insert(l1,30);
        l2=ml.insert(l2,40);
        l2=ml.insert(l2,50);
        ml.traverse(l1);
        ml.traverse(l2);
        ml.merge(l1,l2);
        ml.traverse(l1);
    }

}
