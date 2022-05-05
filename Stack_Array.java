import java.util.*;
class Stack_Array{
	Scanner sc=new Scanner(System.in);
	int top=-1;
	int n=15;
	int[] arr=new int[n];
	
	public boolean isEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	public boolean isFull(){
		if(top==n-1)
			return true;
		return false;
	}
	
	void push(int data){
		if(isFull()){
			System.out.println("OverFlow");
		}
		else{
			top=top+1;
			arr[top]=data;
		}
	}
	
	void pop(int stack){
		if(isEmpty()){
			System.out.println("UnderFlow");
		}
		else{
			int element=arr[top];
			top--;
			System.out.println("Popped element from stack"+stack+" is "+element);
		}
	}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Stack_Array s1=new Stack_Array();
		Stack_Array s2=new Stack_Array();
		System.out.print("Enter number of testcases: ");   // As per the Note Given : added testcase
		int t=sc.nextInt();                                 
		System.out.println();
		for(int i=0;i<t;i++){
			s1.push(5);
			s2.push(10);
			s2.push(15);
			s1.push(11);
			s2.push(7);
			s2.push(40);
			
			s1.pop(1);
			s2.pop(2);
		}
	}
}