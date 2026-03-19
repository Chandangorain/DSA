

public class DoubleLinked {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
     public void addFirst(int data){
        Node newNode=new Node(data);
         size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;  //foreward connection
        head.prev=newNode;  //backward connection
        head=newNode;      //head update
       

     }
      public void removefirst(){
        if(head == null){
            System.out.println("dll is empty");
            return;
        }

        if(size == 1){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
     public void reverse(){   //reverselist
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next; //just this change from single linked list
            prev=curr;
            curr=next;

        }
        head=prev;
       

    }

     

     public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
      
     }


    public static void main(String[]args){
        DoubleLinked dll=new DoubleLinked();
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(7);
        dll.print();
        dll.print();
         dll.removefirst();
         dll.reverse();
            dll.print();

    

        
    }
}
