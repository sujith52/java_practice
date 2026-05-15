public class Demo1 {

    public static void main(String[] args) {
        AdvCalc cl = new AdvCalc();
        int r1 = cl.add(5, 6);
        int r2 = cl.sub(5, 9);
        int r3 = cl.mul(5, 52);
        int r4 = cl.div(54, 2);
        System.out.println(r1 + "     the difference        "+ r2+ "     "+ r3+ "    "+ r4);
    }
}