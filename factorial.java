import java.util.*; 
import java.io.*;

class Main {
  /**
  @author jairo monassa
   Factorial from num

  */
  public static int FirstFactorial(int num) {
    return (num ==1) ? 1 : FirstFactorial(num-1) * num;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}