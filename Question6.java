import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 number to check among 3");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		if (x>y && x>z)
			System.out.println(x+" is the largest amoung "+y+" "+z);
		else if(y>x && y>z)
			System.out.println(y+" is the largest amoung "+x+" "+z);
		else
			System.out.println(z+" is the largest amoung "+x+" "+y);
		
	}

}
