package com.epam.calculator;

public class operation{
	float result;
	presentation p=new presentation();
	public void setvalforopr(float a,float b,String s)
	{
		switch(s)
		{
		case "+":
			result=a+b;
			p.getValues(result);
			break;
		case "-":
			result=a-b;
			p.getValues(result);
			break;
		case "*":
			result=a*b;
			p.getValues(result);
			break;
		case "/":
		    result=a/b;
		    p.getValues(result);
		    break;
		default:
			System.out.println("please provide proper input");
		}
		
	}

}
