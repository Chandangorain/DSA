
import java.util.*;

public class Heightcalc {
    static class Node{
        int data;
        Node left, right;
        
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    // height calculation

    public static int height(Node root){
        if(root==null){
            return 0;
        }

        int lh=height(root.left);  //2
        int rh=height(root.right);  //2
        int result=Math.max(lh,rh)+1;  // 2+1=3, so +1 is imp
        return result;
    }


    // count of nodes 
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=count(root.left);
        int rightcount=count(root.right);
        int result=(leftcount+rightcount)+1;

        return result ;

    }
    public static void main(String[]args){
        /*
        
        1
       / \
      2   3
     / \ / \
    4  5 6  7

        */

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.println(height(root));

        System.out.println(count(root));
    }
}
