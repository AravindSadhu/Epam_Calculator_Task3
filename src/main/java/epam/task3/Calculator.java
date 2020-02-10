package epam.task3;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		System.out.println("Enter First Number");
        double first = scan.nextDouble();
        System.out.println("Enter Second Number");
        double second = scan.nextDouble();
        boolean choice=false;
        while(!choice) {
        	System.out.print("Enter an operator (+, -, *, /): ");
        	char operator = scan.next().charAt(0);
        	double result=0.0;
        	int flag=1;
        	switch(operator){
            	case '+':
            		result = first + second;
            		choice=true;
            		break;
            	case '-':
            		result = first - second;
            		choice=true;
            		break;
            	case '*':
            		result = first * second;
            		choice=true;
            		break;
            	case '/':
            		result = first / second;
            		choice=true;
            		break;
            	default:
            		System.out.println("Error!!! operator is not correct");
            		flag=0;
            		break;
        	}
        	if(flag==1) {
        		System.out.print("The "+"'"+operator+"'"+" Two Number : ");
        		if(Math.ceil(result)==Math.floor(result)) {
        			System.out.println((int)result);
        		}
        		else {
        			System.out.printf("%.1f", result);
        		}
        	}
        }
	}
}
