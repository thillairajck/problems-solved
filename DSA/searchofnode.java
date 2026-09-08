class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class searchofnode {
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
    public static void main(String[] args) {
        searchofnode sn=new searchofnode();
        sn.insert(10);
        sn.insert(20);
        sn.insert(30);
        sn.insert(40);
        sn.Search(30);
    }

}
