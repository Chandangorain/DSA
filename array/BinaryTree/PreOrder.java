
package BinaryTree;
import java.util.*;

public class PreOrder {
    static class Node{
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
        static int idx=-1;
        public static Node buildTree(int nodes[]){
                idx++;
                if(nodes[idx]==-1){
                    return null ;
                }

                Node newNode=new Node(nodes[idx]);
                newNode.left=buildTree(nodes);      //left subtree create
                newNode.right=buildTree(nodes);     // right subtree create

                return newNode;
        }
    }
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int nodes[] = new int[n];

        System.out.println("Enter elements (-1 for NULL node):");

        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
        }

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("Root node value: " + root.data);
    }
    
}
