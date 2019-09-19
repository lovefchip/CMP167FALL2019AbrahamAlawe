/**
 * 
 * @author Abraham 
 * @description  This program checks the user age and see if user can drink alcohol
 */
import java.util.Scanner;
public class Unit4 {
      public static void main(String[] args) {
    	  int age;
    	  String name;
    	  String option="can't";
    	  Scanner in = new Scanner(System.in);
    	  
    	  System.out.println("This program will check if you are legal to drink alcohol");
    	  //input
    	  System.out.print("Enter your name:");
    	  name = in.next();
    	  System.out.printf("Ok %s, Enter your age:",name);
    	  age = in.nextInt();
    	  
    	  //logic
    	  if(age >= 21) {
    		  option ="can";
    	  }
    	  //output
    		  System.out.printf("You %s drink alcohol", option);
    
}
}





