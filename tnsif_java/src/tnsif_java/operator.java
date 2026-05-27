package tnsif_java;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int a = 10;
		        int b = 5;

		        // Arithmetic Operators
		        System.out.println("Addition = " + (a + b));
		        System.out.println("Subtraction = " + (a - b));
		        System.out.println("Multiplication = " + (a * b));
		        System.out.println("Division = " + (a / b));
		        System.out.println("Modulus = " + (a % b));

		        // Relational Operators
		        System.out.println("a > b = " + (a > b));
		        System.out.println("a < b = " + (a < b));
		        System.out.println("a == b = " + (a == b));

		        // Logical Operators
		        System.out.println((a > b && b > 0));
		        System.out.println((a < b || b > 0));

		        // Increment and Decrement
		        a++;
		        b--;

		        System.out.println("Incremented a = " + a);
		        System.out.println("Decremented b = " + b);
		
	}

}
