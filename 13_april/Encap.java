public class Encap {
    public static void main(String[] args) {
        Human hn = new Human();
        hn.setAge(22);
        hn.setName("Sujith_latha_sreejs");
        System.out.println("name is "+ hn.getName()+ " age is "+ hn.getAge());
    }
}

class Human {
    private int age ;
    private String name ;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String na){
        name = na;
    }
}
