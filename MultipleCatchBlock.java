/*we can add multiple catch block with single try but

* we can exceute only one catch block at time

* 

* */

public class Test3 {
 
	public static void main(String[] args) {

		try {

		String name=null;

		System.out.println(name.length());

		int a[]=new int[5];

		a[5]=100/0;


		}

		catch(NullPointerException e) {

			e.printStackTrace();

		}

		catch(ArithmeticException e) {

			e.printStackTrace();

		}

		System.out.println("rest of code");

	}

}
 