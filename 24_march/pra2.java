import java.util.Scanner;;
public class pra2 {
    public static void main(String[] args) {
        // System.out.println("hello session 2 man ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first num man! :");
        int num1 = in.nextInt();
        System.out.println("Enter the second num !:");
        int num2 = in.nextInt();
        System.out.println("The output of num1 "+num1+"num2"+num2+" is "+(num1+num2));
        System.out.println("The subtraction of num1 "+num1+"num2"+num2+" is "+(num1 - num2));
        System.out.println("The multiplication of num1 "+num1+"num2"+num2+" is "+(num1 * num2));
        System.out.println("The division of num1 "+num1+"num2"+num2+" is "+(num1 / num2));
        System.out.println("The modular of num1 "+num1+"num2"+num2+" is "+(num1 % num2));
       
    }
}
