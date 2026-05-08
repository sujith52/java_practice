package something;
import java.util.Scanner;
public class april06 {

	public static void main(String[] args) {
		// question 1
		
		int val = 56;
		float chating = 5.1f;
		double num3 = 6.389;
		char num4 = '$';
		boolean num5 = true;
		long num6 = 563953;
		byte num7 = 126;
		short num9 = 5;
		System.out.println(val);
		System.out.println(chating);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num9);
		
		// question 2
		
		final double PI = 3.14159 ;
		int radius = 5;
		System.out.println("The raius of the circle is "+ PI * radius);
		
		
		// question 3
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num 1 :");
		num1 = sc.nextInt();
		System.out.println("Enter the num 2 :");
		num2 = sc.nextInt();
		System.out.println("the sum "+ (num1 + num2));
		System.out.println("the sub "+ (num1 - num2));
		System.out.println("the mul "+ (num1 * num2));
		System.out.println("the div "+ (num1 / num2));
		
		// question 4
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num bro! ");
		num = sc.nextInt();
		if(num == 0) {
			System.out.println("It is zero");
		}else 
		if(num < 0) {
			System.out.println("This is positive1");
		}else if(num > 0) {
			System.out.println("It is negitive ");
		}else if(num % 2 == 0) {
			System.out.println("It is even ");
		}else {
			System.out.println("It is odd");
		}
		//q 5
		// thinking about continuing the further concepts !
	}

}
