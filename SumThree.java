/**
	 *  
	 * @author Abraham Alawe
	 *
	 */
	import java.util.Scanner;
	public class SumThree {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//1-- Introduce the program
	System.out.println("Welcome, This Program\ngenerates"+" sum of three numbers");
	//2-- Asks the user for the inputs
	System.out.println("Enter first number");
	//3-- Wait for the user's inputs and store
	int num1 = input.nextInt();
	System.out.println("Enter secound number");
	int num2 = input.nextInt();
	System.out.println("Enter third number");
	int num3 = input.nextInt();
	//--calculate
	int result=num1+num2+num3;
	//5-- Display result
	System.out.println("Result is"+result);
	}
	}
}
