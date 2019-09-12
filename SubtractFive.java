/**
	 *  
	 * @author Abraham Alawe
	 *
	 */
	public class SubtractFive {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	//1-- Introduce the program
	System.out.println("Welcome, This Program\ngenerates"+" subtraction of five numbers");
	//2-- Asks the user for the inputs
	System.out.println("Enter first number");
	//3-- Wait for the user's inputs and store
	int num1 = input.nextInt();
	System.out.println("Enter secound number");
	int num2 = input.nextInt();
	System.out.println("Enter third number");
	int num3 = input.nextInt();
	System.out.println("Enter fourth number");
	int num4 = input.nextInt();
	System.out.println("Enter fifth number");
	int num5 = input.nextInt();
	//--calculate
	int result=num1-num2-num3-num4-num5;
	//5-- Display result
	System.out.println("Result is"+result);
	}
	}
}
