package University;

public class Calculator {
		
	
	public void Addition(int num1, int num2){
		int add=num1+num2;
		System.out.println("The sum of the two numbers is: " +add);
	}

	public void Subtraction(int num1, int num2){
		int sub=num1-num2;
		System.out.println("The sum of the two numbers is: " + sub);
	}
	
	public void PrintSmaller(int num1, int num2) {
		if (num1>num2)
			System.out.println("The smallest of the two numbers is " + num2);
		else
			System.out.println("The smallest of the two numbers is " + num1);
	}

	
		
	}

