import java.util.*;
class Sorting{	
	public void insertionSort(int[] a1){
		int m=a1.length;
		for(int i=1;i<m;i++){
			int k=a1[i];
			int j=i-1;
			while(j>=0 && a1[j]>k ){
				a1[j+1]=a1[j];
				j=j-1;
				display(a1);
			}
			a1[j+1]=k;
		}
	}
	
	public void display(int[] a1){
		for(int i=0;i<a1.length;i++){
			System.out.print(a1[i]+" ");
		} 
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Sorting s=new Sorting();
		System.out.print("Enter size od Array: ");
		int n=sc.nextInt();
		System.out.println();
		int[] a1=new int[n];
		for(int i=0;i<n;i++){
			System.out.print("Element at the index "+i+" : ");
			a1[i]=sc.nextInt();
			System.out.println();
		}
		s.insertionSort(a1);
		s.display(a1);
	}
}