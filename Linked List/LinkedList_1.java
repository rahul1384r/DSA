import java.util.LinkedList;

public class LinkedList_1 {
    // Class Node.
    class Node{
        int data;
        Node next;
    }

    int size;
    Node head;
    Node tail;


    // function to add the element in the linked list at the first position of the linked list
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

    // finction to add the element in the linked list at the last position
    public void addLast(int val){
        Node nn=new Node();
        nn.data=val;

        if(size==0){
            tail=nn;
            head=nn;
            nn.next=null;
        }
        else{
            tail.next=nn;
            nn=tail;
        }
        size++;
    }

    // function to add the element at the kth position of the linked list
    public void addKthPosition(int val,int k) throws Exception{
        if(k<0 || k>size){
            throw new Exception("Index not found");
        }
        Node nn=new Node();
        nn.data=val;
        
        Node kth=getNode(k);

        Node temp=kth.next;
        kth.next=nn;
        nn.next=temp;
    }


    private Node getNode(int k){
        Node temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        return temp;
    }

    // function to access the first element of the linked list
    public int getFirst(){
        return head.data;
    }

    // function to access the last element of the linked list
    public int getLast(){
        return tail.data;
    }

    // function to access the kth positioned element of the linked list
    public int getKth(int k){
        return getNode(k).data;
    }

    public void removeFirst(){
        
        Node temp= new Node();
        temp=head;
        // if(size==0){
        //     head=null;
        //     tail=null;
        // }
            head=temp.next;
            temp.next=null;
        size--;
    }

    
    public void removeLast(){
        Node temp=new Node();
        temp=getNode(size-1);
        temp.next=null;
        tail=temp;
        size--;
        
    }

    public void removeKth(int k){
        Node temp=getNode(k-1);
        Node temp2=temp.next;
        temp.next=temp.next.next;
        temp2.next=null;
        size--;
    }

    public void print(LinkedList ll){
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
    }

    public void createCycle(){
        tail.next=head.next;
    }
    public void isCycle(){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                fast.next=head;
                slow=slow.next;
            }
        }
    }

    public Node removeCycle(){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==null || fast.next==null){
            return null;
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
            return slow;
        }
        return fast;

    }
    public void display(){
        System.out.print("head"+"--->");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) throws Exception{
        LinkedList_1 ll=new LinkedList_1();
        ll.addFirst(50);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(10);
        // ll.addLast(50);
        // ll.addKthPosition(72, 30);
        // ll.display();
        // System.out.println(ll.getFirst());
        // System.out.println(ll.getLast());
        // System.out.println(ll.getKth(2));
        // ll.removeFirst();
        // ll.removeLast();
        // ll.removeKth(2);
        // ll.display();
        // ll.createCycle();
        // System.out.println(ll.isCycle());
        ll.removeCycle();
    }
}
