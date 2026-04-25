import java.util.Scanner;
class Main{
  public static void main(String[] args){
    System.out.println("Enter the number bro!");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int i =1; i < 10; i++){
      System.out.println(num+" X "+(i + 1)+" = "+(num * (i + 1)));
    }
  }
}