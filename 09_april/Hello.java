public class Hello {
    public static void main(String[] args) {
        int num = 2;
        int result = num%2==0 ? 10 : 20;
        System.err.println(result);

        int num2 = 2;
        switch (num2) {
            case 1:
                System.out.println("this was num 1 man !");
                break;
            case 2:
                System.out.println("this was 2nd short bro");
                break;
            default:
                System.err.println("All is well for you if you believe that something is gonna happen!");
                break;
        }

        int day = 6;
        switch (day) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thrusday");
                break;
            case 6:
                System.out.println("friday");
                break;
            default:
                System.out.println("The day was nothing !");
                break;
        }

//loops starting 

        for(int i = 1; i <=5; i ++){
            System.out.println("Sujith kumar gavathakatla"+i);
            System.out.println("latha who values friendship!");
            System.out.println("Sreeja whose beauty is unmatched.");
        }
        int i = 1;
        while (i <= 5) {
            System.out.println("This is begining man !");
            i++;
        }
        System.out.println("the result num is "+i);

    }
}
