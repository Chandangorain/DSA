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

        //remove
        public int  remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            
            int front=head.data;  // store front data before removing
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next; // update head pointer to next node
            }
            return front;

        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); //10
    }
}
