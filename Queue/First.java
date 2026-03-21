// queue implementation using array
package Queue;

public class First {

    static class Queue {

        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        // add
        public static void add(int data){
            if(rear == size - 1){
                System.out.println("queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public static int remove(){

            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front =arr[0];      //front is in 0th index
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];    //element of i+1 index stored in i index . so 1st index element is removed
            }
            rear=rear-1;        // after remove rear is shifted
            return front; 

           
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0]; // peak always the 0th index
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q.remove()); // 10
        System.out.println(q.remove()); // 20
    }
}