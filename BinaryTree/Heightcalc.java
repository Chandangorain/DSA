
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

    // sum of nodes 

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sum(root.left); // sum of all left subtree
        int rightsum=sum(root.right); // sum of all right subtree
        int treesum=leftsum+rightsum+root.data;  //left+right subtree + root value

        return treesum;

    }

    //diamater   Approach:1  
    public static int diameter(Node root){   // 0(N^2)
        if(root==null){
            return 0;
        }
        int leftDiam=diameter(root.left);   // calc left diam of left tree =3(2,4,5)
        int leftheight=height(root.left);  //leftheight=2
        int rightDiam=diameter(root.right);  // rightdiam=3(3,6,7)
        int rightheight=height(root.right);   //rightheight=2

        int selfdiam=leftheight+rightheight+1;  // 5(2+2+1)
        
        int result=Math.max(selfdiam,Math.max(leftDiam,rightDiam)); // max(5,max(3,3)) =5
        return result;


    }

    //approach2 :optimal  0(n)
    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
        this.diam=diam;
        this.ht=ht;
        }
    }
    public static Info diameter(Node root){ //calculating diameter and height at the same time
        if(root==null){
            return new Info(0,0);
        }
        Info leftinfo=diameter(root.left);      //leftdiam ,leftht calc at same time
        Info righInfo=diameter(root.right);

       int diam=Math.max(Math.max(leftinfo.diam,righInfo.diam), leftinfo.ht+righInfo.ht+1);  // max of left diam, right diam and self diam
       int ht=Math.max(leftinfo.ht,righInfo.ht)+1;
       return new Info(diam, ht);
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
        System.out.println(sum(root));
        System.out.println(diameter(root));
    }
}
