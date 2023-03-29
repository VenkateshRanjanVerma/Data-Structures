import java.util.*;

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
	}
}
public class LinkedList {
    public static void main(String[] str)
    {
    	Scanner sc=new Scanner(System.in);
    	
    	
    	//@SuppressWarnings("unused")
    	
    	int n=sc.nextInt();
		Node head =new Node(10);
    	head.next = new Node(20);
    	head.next.next = new Node(30);
    	head.next.next.next = new Node(40);
    	
    	display(head);
    	int key=sc.nextInt();
    	
    	int val= search(head,key);
    	System.out.println(val);
    	
    	
    	
    }
    
    public static void display(Node head) {
    	Node curr=head;
    	while(curr!=null) {
    		System.out.print(curr.data+"->");
    		curr=curr.next;
    	}
    }
    
    public static int search(Node head,int key) {
//    	int pos=1;
//    	Node curr=head;
//    	while(curr.next!=null) {
//    		if(curr.data == key) {
//    			//return pos;
//    			break;
//    		}
//    		else {
//    			pos++;
//    			curr=curr.next;
//    		}
//    	}
//    	return pos;
    	
    	
    	
    	//Recursive Approach
    	if(head==null) {
    		return -1;
    	}
    	
    	
		    	if(head.data == key)
		    	{
		    		return 1;
		    	}
		    	else {
		    		int pos=search(head.next,key);  // vase ham position variable bhej sakte the, but agr fun. predefined ho like in hackerrank, then we hame back track karte samye(stack se lautte waqt) hi pos=1 banana padega
			    	
			    	if(pos==-1) {
			    		return -1;
			    	}
			    	else {
			    		return (pos+1);
			    	}
		    	}
		    	
		    	
    	
    	
    	
    	
    	
    }
}
