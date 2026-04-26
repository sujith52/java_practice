import java.util.Scanner;
public class prac13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle :");
        double num1 = sc.nextInt();
        System.out.println("Enter the breadth of rectangle :");
        double num2 = sc.nextInt();
        double area = num1 * num2;
        double perimeter = 2 *(num1 + num2);
        System.out.println("The area is "+area);
        System.out.println("Perimeter is :"+perimeter);
    }    
}