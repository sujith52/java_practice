import java.util.Scanner;;
public class prac12 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter num 1 :");
        // int num1 = in.nextInt();
        // System.out.println("Enter num 2 :");
        // int num2 = in.nextInt();
        // System.out.println("Enter num 2 :");
        // int num3 = in.nextInt();
        // int avg = (num1 + num2 + num3) / 3;
        // System.out.println("The average of "+num1+" "+num2+" "+num3+" :"+avg);

        double num = 0;
        double x = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers that you give input:");
        int n = sc.nextInt();

        while (x <= n) {
            System.out.println("Input number "+ "("+(int) x +")"+ ":");
            num += sc.nextInt();
            x += 1;

        }
        double avg = (num/n);
        System.out.println("The output is "+avg);
    }
}

// this was gettig diffucult.