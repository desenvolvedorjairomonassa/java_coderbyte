import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) {
	/**
	 @autor Jairo monassa
	 
	 Have the function FindIntersection(strArr) read the array of strings stored in strArr which will 
	 contain 2 elements: the first element will represent a list of comma-separated numbers sorted in ascending order,
	 the second element will represent a second list of comma-separated numbers (also sorted). 
	 Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection, return the string false.
	*/
    final String WORD_SEPARETOR = ", ";
    String[] array1 = strArr[0].split(WORD_SEPARETOR);
    String[] array2 = strArr[1].split(WORD_SEPARETOR);
    Collection<String> list1 = new ArrayList<String>(Arrays.asList(array1));
    Collection<String> list2 = new ArrayList<String>(Arrays.asList(array2));
    list1.retainAll(list2);
    if (!list1.isEmpty()) {
				String listaStr = String.join(",", list1);
				
				return listaStr;
			} else {
				return "false";
			}
  
    
  }

  public static void main (String[] args) {  
    
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}