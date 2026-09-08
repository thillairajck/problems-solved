class Node{
    int data;
    Node next;
    Node(int d){
        this.data=d;
        this.next=null;
    }
}
public class countnumberodnode {
    //count the number of particular node
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
    void count(int k){
        int c=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==k){
                c++;
            }
            temp=temp.next;
        }
        System.out.println(k+" appears "+c+'.');
    }
    public static void main(String[] args) {
        countnumberodnode cn=new countnumberodnode();
        cn.insert(10);
        cn.insert(20);
        cn.insert(20);
        cn.insert(40);
        cn.insert(20);
        cn.count(20);
    }
}
