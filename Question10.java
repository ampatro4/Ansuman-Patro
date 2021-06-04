import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int m= (n+ ((n*10)+n) + ((n*100)+(n*10)+n));
		System.out.println("Result= "+m);
	}

}
