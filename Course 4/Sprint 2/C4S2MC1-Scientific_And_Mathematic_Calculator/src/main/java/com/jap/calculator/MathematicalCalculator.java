package com.jap.calculator;

import java.util.Scanner;

public class MathematicalCalculator {

	public int add(int num1, int num2)
	{
		return num1+num2;
	}
	public double add(double num1, int num2)
	{
		return (num1+num2);
	}
	public double add(int num1, double num2)
	{
		return (num1+num2);
	}
	public double add(double num1, double num2)
	{
		return (num1+num2);
	}

//____________________________________________________________________________________________________________________________________________________
	public int subtract(int num1, int num2)
	{
		 return num1-num2;
	}
	public double subtract(double num1, int num2)
	{
		return num1-num2;
	}
	public double subtract(int num1, double num2)
	{
		return num1-num2;
	}
	public double subtract(double num1, double num2)
	{
		return num1-num2;
	}
//____________________________________________________________________________________________________________________________________________________

	public int multiply(int num1, int num2)
	{
		return num1*num2;
	}
	public double multiply(double num1, int num2)
	{
		return num1*num2;
	}
	public double multiply(int num1, double num2)
	{
		return num1*num2;
	}
	public double multiply(double num1, double num2)
	{
		return num1*num2;
	}
//____________________________________________________________________________________________________________________________________________________

	public int divide(int num1, int num2)
	{
		int num=0;
			if (num2==0)
			{
				try {
					throw new CalculatorException("Cannot divided by 0 ");
					}
				catch (CalculatorException exception)
				{
					return num;
				}
			}
			else
			{
				num= num1/num2;
			}
		return num;
	}
	public double divide(double num1, int num2)
	{
		double num=0;
		if (num2==0)
		{
			try {
				throw new CalculatorException("Cannot divided by 0 ");
			}
			catch (CalculatorException exception)
			{
				return num;
			}
		}
		else
		{
			num= num1/num2;
		}
		return num;
	}
	public double divide(int num1, double num2)
	{
		double num=0;
		if (num2==0)
		{
			try {
				throw new CalculatorException("Cannot divided by 0 ");
			}
			catch (CalculatorException exception)
			{
				return num;
			}
		}
		else
		{
			num= num1/num2;
		}
		return num;
	}
	public double divide(double num1, double num2)
	{
		double num=0;
		if (num2==0)
		{
			try {
				throw new CalculatorException("Cannot divided by 0 ");
			}
			catch (CalculatorException exception)
			{
				return num;
			}
		}
		else
		{
			num= num1/num2;
		}
		return num;
	}
//____________________________________________________________________________________________________________________________________________________

	public int modulo(int num1, int num2)
	{
		return num1%num2;
	}
	public double modulo(double num1, int num2)
	{
		return num1%num2;
	}
	public double modulo(int num1, double num2)
	{
		return num1%num2;
	}
	public double modulo(double num1, double num2)
	{
		return num1%num2;
	}
//____________________________________________________________________________________________________________________________________________________

}
