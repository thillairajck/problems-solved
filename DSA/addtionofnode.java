class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class addtionofnode {
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
    void sum(){
        int sum=0;
        Node temp=head;
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        System.out.println("Addition of Nodes:"+sum);
    }
    public static void main(String[] args) {
        addtionofnode an=new addtionofnode();
        an.insert(10);
        an.insert(20);
        an.insert(30);
        an.insert(40);
        an.insert(100);
        an.sum();
    }
}
