import java.util.*; 
import java.io.*;

class Main {

  public static String LongestWord(String sen) {
    /**
	 @autor Jairo monassa
	 longest word into phrase
	 
	*/
    String[] arrayword = sen.split(" ");
    String longestWord = "";
    String str = "";
    for(int i=0;i<arrayword.length;i++) {
      str = "";
      for(int j=0;j<arrayword[i].length();j++){
        if (Character.isLetterOrDigit(arrayword[i].charAt(j))) {
          str += arrayword[i].charAt(j);

        }
      }
      if (str.length() > longestWord.length()) {
        longestWord = str;
      }
    }
    
    return longestWord;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }

}