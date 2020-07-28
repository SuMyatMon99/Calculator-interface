package CalculatorInterface;
import java.util.Scanner;
public class Calculation implements Calculator {
	int x;
	int y;
	
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int substract(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculation c = new Calculation();
		
		System.out.print("Enter first number : ");
		int input1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int input2 = sc.nextInt();
		
		int result = 0;
		String str;
		do {
			System.out.print("Enter operator[+, -, *, /] :");
			String op = sc.next();
			
			switch(op) {
				case "+" : result = c.add(input1, input2);
					break;
				case "-" : result = c.substract(input1, input2);
					break;
				case "*" : result = c.multiply(input1, input2);
					break;
				case "/" : result = c.divide(input1, input2);
					break;
				default : 
					break;
			} 
			System.out.println("The result is : " + result);
			
			System.out.print("Continue? [y/n]:");
			str = sc.next();
		}while(str.equals("y"));
		sc.close();
	}


}
