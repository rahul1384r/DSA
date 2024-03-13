public class LinkedList_1 {
    // Class Node.
    class Node{
        int data;
        Node next;
    }

    int size;
    Node head;
    Node tail;

    public void addFirst(int val){
        // object Node is created
        Node nn=new Node();
        nn.data=val;

        if(size==0){
            head=nn;
            tail=nn;
            nn.next=null;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
    }

    public void display(){
        System.out.print("head"+"--->");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LinkedList_1 ll=new LinkedList_1();
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.display();
    }
}
