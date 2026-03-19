// first we have to add some data then search. Add-> ItrSearch.


public class IterativeSearch {
    static class Node {
        int data;      
        Node next;     

        
        Node(int data) {
            this.data = data;
            this.next = null;   
        }
    }
     public static Node head = null;    
    public static Node tail = null; 
    public static int size=0;

     public void addLast(int data){  // logic for add in last
        Node mewNode=new Node(data);
        size++;
        if(head==null){
            head=tail=mewNode;

        }
        tail.next=mewNode;
        tail=mewNode;

    } 

    public int itrSearch(int key){  //logic for itrsearch] 
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return-1;
    }

    public static void main(String[]args){
        IterativeSearch ll=new IterativeSearch();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);

        System.out.println(ll.itrSearch(30));
    }
    
}
