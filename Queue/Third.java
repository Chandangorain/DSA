// implementation using two stacks
package Queue;

import java.util.Stack;

public class Third {
    static class Queue{
        static Stack<Integer>s1=new Stack<>();
        static Stack<Integer>s2=new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        
        //add                                           // time complexity :0(n), becz two while loops are there
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop()); // push the popped elements of s1 to s2

            }
            s1.push(data);  // push the new element in s1

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //remove                                // time complexity:0(1) , no depenedency 
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            return s1.pop();  // simple pop
        }

        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return s1.peek();
        }

        public static void main(String[]args){
            Queue q=new Queue();
            q.add(2);
            q.add(5);
            q.add(7);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }

        }
    }
}
