public class Hello {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello constructor class method that loads every new object !");
        Mobile ml = new Mobile();
        Mobile mm = new Mobile();
        Class.forName("Mobile");

    }
}

class Mobile{
    public Mobile(){
        System.out.println("This was constructor !");
    }
    static{
        System.out.println("This was static method that runs only after it is defoned !");
    }
}

// the constructor and the static was 2 different things so we need to carefull man !