class A{
    public A(){
        System.out.println("This is calss A ");
    }
    public A(int a){
        
        System.out.println("this is an "+a);
    }
}

class B extends A{
    public B(){
        System.out.println("This is class B");
    }
    public B(int a){
        super(a);
        System.out.println("this is an "+a);
    }
}

public class Inherit {
    public static void main(String[] args) {
        B al = new B(5);
    }
}