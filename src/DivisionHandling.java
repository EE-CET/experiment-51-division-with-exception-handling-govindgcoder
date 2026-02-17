import java.util.Scanner;

public class DivisionHandling {
    public static void main(String[] args){
        //Read two integers a and b
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
        //Enclose the division in a try block
      try {
        int res = a/b;
        System.out.print(res);
      } catch (ArithmeticException e) {
        System.out.print("Divide by zero error");
      }
        //to Catch ArithmeticException
    }
}
