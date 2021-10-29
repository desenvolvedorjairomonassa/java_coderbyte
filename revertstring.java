import java.util.*; 
import java.io.*;

class Main {

  public static String FirstReverse(String str) {
  /**
  @author Jairo monassa
  revert string
  */
    String rts = "" ;
    for(int i= str.length()-1; i>-1;i--)  {
      rts += str.charAt(i);
    }
    return rts;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }

}