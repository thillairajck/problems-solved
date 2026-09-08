class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class maximumnode {
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
    void max(){
        int max=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data>max)
                max=temp.data;
            temp=temp.next;
        }
        System.out.println("Maximum value:"+max);
    }
    public static void main(String[] args) {
        maximumnode mn=new maximumnode();
        mn.insert(101);
        mn.insert(202);
        mn.insert(30);
        mn.insert(40);
        mn.insert(1001);
        mn.max();
    }
}
