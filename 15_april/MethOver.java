
class A{
    public int add(int a, int b){
        return a +b;
    }
}

class B extends A{
    public int add(int a, int b){
        return a + b+ 1;
    }
}


public class MethOver {
    public static void main(String[] args) {
        B bs = new B();
        int r1 = bs.add(5, 5);
        System.out.println(r1);
        System.out.println("This is the output of the method overriding man !");
    }
}
