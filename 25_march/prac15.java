import java.util.Scanner;;
public class prac15 {
    public static void main(String[] args) {
        int a,b,temp;
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the value of 1st num !");
        a = sc.nextInt();
        System.out.println("Enter the value of 2st num !");
        b = sc.nextInt();
        System.out.println("The before swapping is :"+a+", "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("The after  swapping is :"+a+", "+b);
    }
}
