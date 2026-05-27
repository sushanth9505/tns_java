package tnsif_java;

public class statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 10;

	        // 1. If Statement
	        if (number > 0) {
	            System.out.println("Number is positive");
	        }

	        // 2. If-Else Statement
	        if (number % 2 == 0) {
	            System.out.println("Number is even");
	        } else {
	            System.out.println("Number is odd");
	        }

	        // 3. Switch Statement
	        int day = 3;

	        switch(day) {

	            case 1:
	                System.out.println("Monday");
	                break;

	            case 2:
	                System.out.println("Tuesday");
	                break;

	            case 3:
	                System.out.println("Wednesday");
	                break;

	            default:
	                System.out.println("Invalid day");
	        }
	}

}
