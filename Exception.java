import java.util.Scanner;
 
public class Test2 {
 
	public static void main(String[] args) {

		try {

		int a[]=new int[5];

		a[6]=500;

		System.out.println(a[4]);

		System.out.println("Hello all!!!");

		}

		catch(Exception e) {

			e.printStackTrace();

		}

		System.out.println("Hi");

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter no1:");
 
		int no1=sc.nextInt();

		System.out.println("Enter no2:");
 
		int no2=sc.nextInt();

		System.out.println("Addition:"+(no1+no2));

	}
 
}

 