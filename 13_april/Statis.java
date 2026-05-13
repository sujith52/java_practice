public class Statis {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Oppo5A4";
        obj1.price = 20000;
        obj1.name = "smart phone ";

        Mobile obj2 = new Mobile();
        obj2.brand = "iphone ";
        obj2.price = 80000;
        obj2.name = "Rich phone";

        obj1.show();
        obj2.show();
    }
}

class Mobile {
    String brand;
    int price;
    String name ;

    public void show(){
        System.out.println(brand + ": "+ price+" : "+name+ " .");
    }
}
