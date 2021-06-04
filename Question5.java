import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array sizw");
		int n=sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	     int count =0;
	     for(int i=0;i<n-1;i++) {
	    	 for(int j=i+1;j<n;j++) {
	    		 if(arr[i]>arr[j]) {
	    			 System.out.print("{"+arr[i]+" , "+arr[j]+"}  ");
	    			 count++;
	    		 }
	    		 else {
	    			 System.out.print(0+"  ");
	    		 }
	    	 }
	     }
	     System.out.println();
	     System.out.println("Number of inversion count: "+count);
		}
	}


