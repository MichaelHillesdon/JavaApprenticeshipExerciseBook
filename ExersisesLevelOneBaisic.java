
public class ExersisesLevelOneBaisic {

	public static void main(String[] args) {
		
		// Assignment 1 - Store 'Hello World!' in a variable and output it via System.out.println()
		String var1 = "Hello World!";
		System.out.println(var1);
		
		// Calls to following methods
		printInputString("Hello World!");
		System.out.println(ReturnString());
		System.out.println(addTwoNums(5, 12));
		System.out.println(addOrMulitplyTwoNums(5, 12, false));
		System.out.println(addOrMulitplyTwoNumsImproved(5, 0, false));
		
		/* ITERATION
		 * Create a for loop that will call and output the result of your method from Conditionals 2, 10 times,
		 * using the current iteration as one of the parameters you pass to it.
		 */
		for (int i=0; i<10; i++) {
			System.out.println(addOrMulitplyTwoNumsImproved(5, i, false));
		}
		
		/* ARRAYS
		 * Create an array that will hold 10 integer values, populate the array with values,
		 * then call and output the result of your method from Conditionals 2, 
		 * passing values that are stored in the array as arguments to the method.
		 */
		int[] myIntArray = {7,3,13,12,4,10,8,20,17,11};
		System.out.println(addOrMulitplyTwoNumsImproved(myIntArray[0],myIntArray[5],true));
		
		/* ITERATION/ARRAYS
		 * Using your array that you created in Task 9, create a for loop that iterates through your array, 
		 * outputting the values contained within it.
		 */
		for (int i=0; i<myIntArray.length; i++) {
			int x = myIntArray[i];
			System.out.println(x);
		}
		
		/* ITERATION/ARRAYS 2
		 * Create a for loop that populates an integer array with values, outputting them at each iteration. 
		 * Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, 
		 * outputting them at each iteration.
		 */
		int [] newAr = new int[10];
		for(int i=0;i<10;i++) {
			newAr[i] = i+1;
		}
		
		for (int i=0; i<newAr.length; i++) {
			int x = newAr[i];
			System.out.println(x * 10);
		}
	}
	
	/* PARAMETERS 
	 * Create a method that accepts a string as a parameter, and then outputs that string to the console via a System.out.println(),
	 * then call that method from your main method.
	 */
	public static void printInputString(String input) {
		System.out.println(input);
	}
	
	/* RETURN TYPES
	 * Create a method to return “Hello World!” once called, which you call from your main method, 
	 * to then output the text to the screen.
	 */
	public static String ReturnString() {
		String var2 = "Hello World!";
		return var2;
	}
	
	/* PARAMETERS/OPERATORS
	 * Create a method that accepts two integers as parameters, then returns an integer that is a sum of the two integers given, 
	 * then call this method from your main method and output the returned result.
	 */
	public static int addTwoNums(int num1, int num2) {
		int sum;
		sum = num1 + num2;
		return sum;
	}
	
	/* CONDITIONALS
	 * Modify your method from the previous task to accept another parameter, a Boolean, which if it is true, 
	 * the method will return a sum of the two numbers, and if it is false it will return the multiplication of the two numbers.
	 */
	public static int addOrMulitplyTwoNums(int num1, int num2, boolean add) {
		int sum;
		if(add) {
			sum = num1 + num2;
		} else {
			sum = num1 * num2;
		}
		return sum;
	}
	
	/* CONDITIONALS 2
	 * Modify your method from the previous task to have another if statement that checks if one of the numbers is 0, 
	 * if this is true then return the other non-0 number.
	 */
	public static int addOrMulitplyTwoNumsImproved(int num1, int num2, boolean add) {
		int sum;
		
		if(num1 == 0) {
			return num2;
		} else if(num2 == 0) {
			return num1;
		}
		
		if(add) {
			sum = num1 + num2;
		} else {
			sum = num1 * num2;
		}
		return sum;
	}
	

}
