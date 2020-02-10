package com.epam.calculator;
import java.util.Scanner;

public class presentation {
	public void getValues(float result)
	{
		System.out.println("Result is "+result);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("BASIC CALCULATOR");
		System.out.println("Enter first operands");
		float a=sc.nextFloat();
		System.out.println("Enter second operand");
		float b=sc.nextFloat();
		System.out.println("Enter the operation to be performed");
		String s=sc.next();
		database d=new database();
		d.setvaluestodb(a,b,s);
	}
}
