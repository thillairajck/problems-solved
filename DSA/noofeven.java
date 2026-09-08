class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class noofeven {
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
    void NumberOfEvenNode(){
        Node temp=head;
        int l=0;
        while(temp!=null){
            if(temp.data%2==0)
                l++;
            temp=temp.next;
        }
        System.out.println("Number of Even Nodes="+l);
    }
    public static void main(String[] args) {
        noofeven ne=new noofeven();
        ne.insert(10);
        ne.insert(11);
        ne.insert(12);
        ne.insert(13);
        ne.insert(14);
        ne.NumberOfEvenNode();
    }

}
