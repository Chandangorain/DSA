//  Implementation of stack using  Linkedlist



import java.lang.Thread.State;
import java.util.ArrayList;

public class Second {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class Stack{
        static Node head=null;
        public static boolean isEmpty(){
            return head==null;
        }

        //push
        public static void push(int data){
            Node newNode=new Node(data);
             if(isEmpty()){     //if stack is empty then head is the top
                head=newNode;
                return;
             }

             newNode.next=head;   //head replacement .noe=w new head is the top
             head=newNode;

        }

        //pop
        public static int pop(){
            if(isEmpty()){     //if stack is empty then nothing to pop , return -1
                return -1;
             }
             //else
            int top=head.data;
             head=head.next;   //assign head to the next node
             return top; 


        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top= head.data;
            return top; 
        }

    }

    public static void main(String[]args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        
        }
       
    }
    
}
