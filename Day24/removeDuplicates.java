import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{

    public static Node removeDuplicates(Node head) {
      //Write your code here
      if (head == null) {
            return head;
        }
        Node dummy = new Node(0);
        Node pre = dummy;
        dummy.next = head;
        Node cur = head;
        while (cur != null && cur.next != null) {
            if (cur.data == cur.next.data) {
                cur = cur.next;
                while (cur.next != null && cur.data == cur.next.data) { 
                        cur = cur.next;}
                pre.next = cur;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return dummy.next;
    }

	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }