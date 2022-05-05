import java.util.*;
class Question2{
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	
	public void addLast(int data){
		
		Node new_Node=new Node(data);
		if(head==null){
			head=new_Node;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new_Node;
		}	
	}
	
	public void reverse(){
		if(head==null){
			System.out.println("List is Empty");
			return;
		}
		else{
			Node current=head;
			Node previous=null;
			Node nextOne=null;
			
			while(current!=null){
				nextOne=current.next;
				current.next=previous;
				previous=current;
				current=nextOne;
			}
			head=previous;
			display();
		}
	}
	
	
	
	public void display(){
		if(head==null){
			System.out.println("List is Empty");
		}
		else{
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Question2 q=new Question2();
		System.out.print("Enter number of testcases: ");
		int t=sc.nextInt();
		System.out.println();
		for(int i=0;i<t;i++){
			System.out.print("Enter number of elements: ");
			int n=sc.nextInt();
			System.out.println();
			for(int j=0;j<n;j++){
				System.out.print("Enter element "+j+" : ");
				int k=sc.nextInt();
				System.out.println();
				
				q.addLast(k);
			}
				q.display();
				q.reverse();
				q.head=null;
		}
	}
}