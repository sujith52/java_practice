public class Demo {
    public static void main(String[] args) {
        System.out.println("this was object creation and linkin to the reference va");
        new A().show();
        new A().show();
    }
}

class A{
    public void show(){
        System.out.println("This is showing man !!😅");
    }
}
