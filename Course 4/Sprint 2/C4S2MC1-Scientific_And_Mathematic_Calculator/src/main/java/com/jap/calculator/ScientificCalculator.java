package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value
		if (num<=0)
		{
			throw new CalculatorException("Number is less than or equal to zero ");
		}
		else
		{
			Math.ceil(num);
		}
		return num;
	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		if (num<=0)
		{
			throw new CalculatorException("Number is less than or equal to zero ");
		}
		else
		{
			Math.floor(num);
		}
		return num;
	}
	
    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value
		double power1;
		if (num1<num2)
		{
			throw new CalculatorException("First value is less than the second value  ");
		}
		else
		{
			 power1 = Math.pow(num1,num2);
		}
		return (long)(power1);
    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
			//or else call sqrt method of Math class and return the value

		double squareRoot;
		if (num<=0)
		{
			throw new CalculatorException("Number is less than or equal to zero  ");
		}
		else
		{
			squareRoot = Math.sqrt(num);
		}
		return squareRoot;
    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10);
			scientificCalculator.floorOfANumber(10);
			scientificCalculator.power(10,2);
			scientificCalculator.squareRoot(4);
		}
		//-----------------------------------------------------------------------------------------------------------------------------------------

		catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
	}
}
