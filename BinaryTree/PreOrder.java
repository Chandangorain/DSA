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

    static class Solution{
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

        //inorder traversal
        public static void inorder(Node root){  //left->root->right
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+"");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root==null){
                return ;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

        // level order traversal
        public static void levelorder(Node root){
            if(root==null){
                return ;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){

                Node currnode=q.remove();   // pop out the first

                if(currnode==null){         //if it is null then nextline
                    System.out.println();
                    if(q.isEmpty()){        // is q empty means all are done then break
                        break ;
                    }else{
                        q.add(null);  // else add null in queue becz null helps to put in next line 
                    }

                }else{
                    System.out.println(currnode.data+" "); // if currnode !=null then print it

                    if(currnode.left!=null){        // check if left subtree not null then add in queue 
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
               
            }
            
        }

        
    }

    public static void main(String[]args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Solution tree= new Solution();      // BinaryTree=datatype , tree= variable , BinaryTree()  = constructor , we declare as a class

        Node root=tree.buildTree(nodes);
       // System.out.println(root.data);    //this is for print root data

         tree.preorder(root);  // preorder traversal : 1 2 4 5 3 6

        tree.inorder(root);  //inorder TRversL : 425136
        
        tree.postorder(root);  // postorder

        tree.levelorder(root);
    }
    
}