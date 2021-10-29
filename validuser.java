import java.util.*; 
import java.io.*;

class Main {

  public static String CodelandUsernameValidation(String str) {
    if (str.length()<4 && str.length()>25) return "false";
    if (Character.isDigit(str.charAt(0))) return "false";
    boolean letterdigit = false;
    for(int i=0;i<str.length();i++) {
      if (Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))  || 
          str.charAt(i) != '_'
         ) {
        letterdigit = true;
        continue;
      }
      else break;
    }
    if (!letterdigit) return "false";
    if (str.charAt(str.length()-1) == '_' ) return "false";
        
    return "true";

  }

  public static void main (String[] args) {  

    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}