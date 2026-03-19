public class AddFirstLinkedList {

    // Node class represents a single element of the linked list
    static class Node {
        int data;      // value stored in the node
        Node next;     // reference to the next node

        // Constructor to create a new node
        Node(int data) {
            this.data = data;
            this.next = null;   // initially next is null
        }
    }

    public static Node head = null;    // points to first node
    public static Node tail = null;    // points to last node (optional)
    public static int size=0;

    // logicto add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);   // Step 1: Create a new node
        size++;

        // Step 2: If list is empty, head and tail both point to new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 3: Link new node to current head
        newNode.next = head;

        // Step 4: Move head to new node
        head = newNode;
    }
    public void addLast(int data){  // logic for add in last
        Node mewNode=new Node(data);
        size++;
        if(head==null){
            head=tail=mewNode;

        }
        tail.next=mewNode;
        tail=mewNode;

    }   

    public void print(){   //logic for print
          // create a temporary node reference called temp
        Node temp=head;    // it starts from head (first node of the list)
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;  //update temp
        }
        System.out.println();

    }
    // add in middle
    public void Addinmiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;

        }
        Node newnode=new Node(data);  //creae a temp node
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    //remove first node
   public void removefirst(){
        if(head == null){
            System.out.println("dll is empty");
            return;
        }

        if(size == 1){
            head = tail = null;
        } else {
            head = head.next;
            
        }
        size--;
    }
    //remove last node
    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
             int val=head.data;
            head=tail=null;
            size=0;  // as it was one node before delte
            return val;

        }
        // find 2nd last node prev : i=size-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data; //store data
        tail=null;
        tail=prev;  //update tail
        size--;
        return val;
         
    }

     public static void main(String[] args) {
        AddFirstLinkedList ll=new AddFirstLinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();

        ll.addLast(4);
        ll.print();
        ll.addLast(5);  
        ll.print();
        ll.Addinmiddle(2, 8);
        ll.print(); 
        ll.removefirst();  // remove first node
        ll.print();

 

        
    }
}
