import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
      //Write your code here
      List<Integer> res = new LinkedList<Integer>();
      Queue<Node> queue = new LinkedList<Node>();

      queue.offer(root);
      res.add(root.data);
      while(!queue.isEmpty()){
        int size = queue.size();
        //List<Integer> temp = new LinkedList<Integer>();
        for(int i=0;i<size;i++){
           root = queue.poll();
           if(root.left!=null){
              queue.offer(root.left);
              res.add(root.left.data);
           }
           if(root.right!=null){
              queue.offer(root.right);
              res.add(root.right.data);
           }
        }
      }
      for(int i=0;i<res.size();i++){
         System.out.print(res.get(i)+" ");
      }
    }

public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}