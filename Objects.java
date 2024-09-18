package BasicPackage;

import java.util.Scanner;


public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To inherit methods from other class , we need to create object of those classes.
				int num1 , num2;
				
				Methods method = new Methods();
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter First number");
				num1 = sc.nextInt();
				System.out.println("Enter Second number");
				num2 = sc.nextInt();
				
				System.out.println("First number is :- "+num1);
				System.out.println("Second number is :- "+num2);
				
				method.add(num1, num2);
				method.subtract(num1, num2);
				//Above methods are void which are having Syso in code, hence no need to give System.out.println().
				
				int multiply = method.multiply(num1, num2);
				System.out.println("Multiplication value is "+multiply);
				
				System.out.println(method.intro());
				
				
				sc.close();

	}

}
