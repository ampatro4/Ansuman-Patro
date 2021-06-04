import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for automorphic");
		int n=sc.nextInt();
		int square_n=n*n;
		if(square_n%10==n%10)
			System.out.println(n+" is a Automorphic number");
		else
			System.out.println(n+" is not a automorphic number");

	}

}
