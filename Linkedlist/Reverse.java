import java.util.*;      // addLast->reverse->print()
public class Reverse {
    static class Node{
        int data;
         Node next;
         Node(int data){
            this.data=data;
            this.next=null;
         }
    }
    public static Node head=null;
    public static Node tail=null;
   

    public void addLast(int data){  //addlast
        Node newnode=new Node(data);
    
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;

    }
      public void print() {  //printlist
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void reverse(){   //reverselist
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
       

    }
      public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Reverse ll=new Reverse();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            ll.addLast(sc.nextInt());
        }
        ll.reverse();
        ll.print();
        sc.close();

      


      }
    
}
