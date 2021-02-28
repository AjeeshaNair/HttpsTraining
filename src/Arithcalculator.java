import java.io.*; 
import java.lang.*; 
import java.lang.Math; 
import java.util.Scanner; 
public class Arithcalculator { 

	public static void main(String[] args) 
	{ 
	 
		double num1, num2;  
		Scanner sc = new Scanner(System.in); 

		System.out.println("Enter the numbers of your choice");  
		num1 = sc.nextDouble(); 

		num2 = sc.nextDouble(); 

		System.out.println("Enter the arithematic operation you want to perform (+,-,*,/)"); 

		char op = sc.next().charAt(0); 

		double o = 0; 

		switch (op) { 

		case '+': 

			o = num1 + num2; 

			break;
			
		case '-': 

			o = num1 - num2; 

			break; 


		case '*': 

			o = num1 * num2; 

			break; 

		 
		case '/': 
			
				o = num1 / num2; 
				break;
		
		default: 
			  
	            System.out.println("You entered wrong input"); 
	  
	            break; 
		
		} 

		System.out.println("The final result is:"); 

		System.out.println(); 
		if(op!='/'|| num2!=0){

		System.out.println(num1 + " " + op + " " + num2 
						+ " = " + o); 
	} else {
		System.out.println("zero division error"); 
	}
		
	}
}