import java.util.Scanner;
import java.lang.Math;

public class JavaCalculatorCharNCE {
   public static void main ( String[] args ) {
      double num1, num2, finishedValue=0;
      char operat = ' ';
      
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("INSTRUCTIONS");
      
      System.out.print("Num1");
      num1 = kb.nextInt();
      System.out.println();
      
      
      System.out.print("Num2");
      num2 = kb.nextInt();
      System.out.println();
      
      System.out.print(" 1 is +, 2 is -, 3 is *, 4 is /, 5 is %, 6 is ^ \n Please enter your operator: " );
      operat = kb.next().charAt(0);
      System.out.println();
      
      if ( num1 < 0 || num1 > 9 || num2 < 0 || num2 > 9 ) {
         System.out.println("That is not within the scope of this program" );
         System.exit(0);  
      }
      
      if ( operat == '+' ) {
         finishedValue = num1 + num2;
      }
      else if ( operat == '-' ) {
         finishedValue = num1 - num2;
      }
      else if ( operat == '*' ) {
         finishedValue = num1 * num2;
      }
      else if ( operat == '/' ) {
         finishedValue = num1 / num2;
      }
      else if ( operat == '%' ) {
         finishedValue = num1 % num2;
      }
      else if ( operat == '^' ) {
         finishedValue = Math.pow(num1, num2);
      }
      else {
         System.out.println("Invalid entry");
         System.exit(0);
      }
      System.out.println(finishedValue);
   }
}
