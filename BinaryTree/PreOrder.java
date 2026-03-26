import java.util.*;
public class PreOrder{

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
            static int idx = -1;
        public static Node buildTree(int nodes[]){      // node creation function
            idx++;
            if (nodes[idx]== -1) {  //-1= no child
                return null;
    }
            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);    //recursive call of node creation
            newNode.right = buildTree(nodes);   // recursive call
            return newNode;
        }

        // only for traversal
        public static void preorder(Node root){
            if(root==null){
                return ;
            }
            System.out.println(root.data+" ");  // preint root->left->right
            preorder(root.left);    // if root= 1, then 1.left .
            preorder(root.right);
        }
    }

    public static void main(String[]args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root=tree.buildTree(nodes);
        // System.out.println(root.data);   this is for print root data

        tree.preorder(root);  // preorder traversal : 1 2 4 5 3 6

        

    }
    
}