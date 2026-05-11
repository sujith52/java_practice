


public class Hello {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(num1 +" "+ num2 + "redsult "+result);
    }
}

class Calculator{
    int a ;

    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}

public class Hello {
    public static void main(String[] args) {
        MethodMin meth = new MethodMin();
        meth.playAMusic();
        String str = meth.returnAPen(10);
        System.out.println(str);
    }
    
}

class MethodMin {
    public void playAMusic(){
        System.out.println("The music is bloody playing bro !");
    }
    public String returnAPen(int cost){
        return "Pen";
    }
}
