import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the error");
		int n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			x[i]=sc.nextInt();
		System.out.print("Array elements are:- ");
		for(int i=0;i<n;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		int exc=n/2;
		int count=0;
		for(int i=0;i<exc;i++)
		{
			int temp=x[i];
			x[i]=x[n-i-1];
			x[n-i-1]=temp;
			count++;
		}
		System.out.print("the array elements are:-");
		for(int i=0; i<n;i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("The steps are ="+count);

	}

}
