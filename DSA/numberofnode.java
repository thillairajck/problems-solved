class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class numberofnode {
    Node head=null;
    void insert(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void numberofNode(){
        Node temp=head;
        int l=0;
        while(temp!=null){
            l++;
            temp=temp.next;
        }
        System.out.println("length="+l);
    }
    public static void main(String[] args) {
        numberofnode n=new numberofnode();
        n.insert(10);
        n.insert(20);
        n.insert(30);
        n.insert(40);
        n.numberofNode();
    }
}
