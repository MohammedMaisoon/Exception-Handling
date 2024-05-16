import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        int num1,num2,calc;
        System.out.print("Write a First number to divide:");
        try{
          Scanner input = new Scanner(System.in);
          num1=input.nextInt();
          System.out.print("Write a Second number to divide:");
          num2=input.nextInt();
          calc=num1/num2;
          System.out.println(calc);
        }
        catch (ArithmeticException ae) {
            System.out.println("The Number Cannot Be Divided By Zero");
        }
    }
}
