public class Demo {
    public static void main(String[] args) {
        // String name = new String("Sujith Kumar");
        // System.out.println("Hello "+ name);
        // System.out.println(name.concat(" Yadav"));

        StringBuffer sb = new StringBuffer("Sujith");
        sb.append("Kumar");
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
    }
}
