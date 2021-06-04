import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms you want to print the series ");
        int n=sc.nextInt();
        int a = 0,b = 0,c = 1;
        int d = a+b+c;
        System.out.println("The series is  ");
        System.out.print(a+" "+b+" "+c);

        for(int i=4;i<=n;i++)
        {
            System.out.print(" "+d);
            a=b;
            b=c;
            c=d;
            d=a+b+c;
        }

        System.out.println();
	}

}
