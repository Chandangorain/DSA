// queue implementation using linkedlist 

package Queue;

public class Second {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;

        public  boolean isEmpty(){
            if(head==null && tail==null){
                return true;
            }else{
                return false;
            }
        }

        // add
        public void add(int data){
            Node newNode=new Node(data);

            if(head==null){ // if queue is empty
                head=tail=newNode;
                return;
            }
            tail.next=newNode;  // attach new node at end
            tail=newNode;     // update tail pointer

        }

    }
    
}
