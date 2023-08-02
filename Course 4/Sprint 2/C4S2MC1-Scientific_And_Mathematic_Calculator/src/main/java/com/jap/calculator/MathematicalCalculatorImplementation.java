package com.jap.calculator;

import java.util.Scanner;

public class MathematicalCalculatorImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathematicalCalculator mathematicalCalculator = new MathematicalCalculator();
        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulous ");
        System.out.println("How many operation you want to perform? : ");
        int option = scanner.nextInt();
        double num3, num4;
        for (int i=1;i<=option;i++)
        {
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    scanner.nextLine();
                    System.out.println("Enter 1st number : ");
                    String num1 = scanner.next();
                    System.out.println("Enter 2nd number : ");
                    String num2 = scanner.next();
                    double num=Double.parseDouble(num1);
                    int number=(int)(num);

                    double numDouble = Double.parseDouble(num2);
                    int numInteger = (int)(numDouble);
                    if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        System.out.println(num1+"+"+num2+" = "+mathematicalCalculator.add(Double.parseDouble(num1),Double.parseDouble(num2)));
                    }
                    else if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)==0)
                    {
                        System.out.println(num1+"+"+num2+" = "+mathematicalCalculator.add(Double.parseDouble(num1),Integer.parseInt(num2)));
                    }
                    else if (number % Double.parseDouble(num1)==0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        System.out.println(num1+"+"+num2+" = "+mathematicalCalculator.add(Integer.parseInt(num1),Double.parseDouble(num2)));
                    }
                    else
                    {
                        System.out.println(num1+"+"+num2+" = "+mathematicalCalculator.add(Integer.parseInt(num1),Integer.parseInt(num2)));
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Enter 1st number : ");
                    num1 = scanner.next();
                    System.out.println("Enter 2nd number : ");
                    num2 = scanner.next();

                    num=Double.parseDouble(num1);
                    number=(int)(num);

                    numDouble = Double.parseDouble(num2);
                    numInteger = (int)(numDouble);
                    if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        System.out.println(num1+"-"+num2+" = "+mathematicalCalculator.subtract(Double.parseDouble(num1),Double.parseDouble(num2)));
                    }
                    else if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)==0)
                    {
                        System.out.println(num1+"-"+num2+" = "+mathematicalCalculator.subtract(Double.parseDouble(num1),Integer.parseInt(num2)));
                    }
                    else if (number % Double.parseDouble(num1)==0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        System.out.println(num1+"-"+num2+" = "+mathematicalCalculator.subtract(Integer.parseInt(num1),Double.parseDouble(num2)));
                    }
                    else
                    {
                        System.out.println(num1+"-"+num2+" = "+mathematicalCalculator.subtract(Integer.parseInt(num1),Integer.parseInt(num2)));
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter 1st number : ");
                    num1 = scanner.next();
                    System.out.println("Enter 2nd number : ");
                    num2 = scanner.next();

                    num=Double.parseDouble(num1);
                    number=(int)(num);

                    numDouble = Double.parseDouble(num2);
                    numInteger = (int)(numDouble);
                    if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        System.out.println(num1+"*"+num2+" = "+mathematicalCalculator.multiply(Double.parseDouble(num1),Double.parseDouble(num2)));
                    }
                    else if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)==0)
                    {
                        System.out.println(num1+"*"+num2+" = "+mathematicalCalculator.multiply(Double.parseDouble(num1),Integer.parseInt(num2)));
                    }
                    else if (number % Double.parseDouble(num1)==0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        System.out.println(num1+"*"+num2+" = "+mathematicalCalculator.multiply(Integer.parseInt(num1),Double.parseDouble(num2)));
                    }
                    else
                    {
                        System.out.println(num1+"*"+num2+" = "+mathematicalCalculator.multiply(Integer.parseInt(num1),Integer.parseInt(num2)));
                    }
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter 1st number : ");
                    num1 = scanner.next();
                    System.out.println("Enter 2nd number : ");
                    num2 = scanner.next();

                    num=Double.parseDouble(num1);
                    number=(int)(num);

                    numDouble = Double.parseDouble(num2);
                    numInteger = (int)(numDouble);
                    if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        try {
                            System.out.println(num1+"/"+num2+" = "+mathematicalCalculator.divide(Double.parseDouble(num1),Double.parseDouble(num2)));
                        }
                        catch (NumberFormatException e)
                        {

                            System.out.println(num1+"/"+num2+" = "+(Double.parseDouble(num1)*10)/(Double.parseDouble(num2)*10));
                        }
                    }
                    else if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)==0)
                    {
                        try {
                            System.out.println(num1+"/"+num2+" = "+mathematicalCalculator.divide(Double.parseDouble(num1),Integer.parseInt(num2)));
                        }
                        catch (NumberFormatException e)
                        {

                            System.out.println(num1+"/"+num2+" = "+(Double.parseDouble(num1)*10)/(Integer.parseInt(num2)*10));
                        }
                    }
                    else if (number % Double.parseDouble(num1)==0 && numInteger % Double.parseDouble(num2)>0)
                    {
                            System.out.println(num1+"/"+num2+" = "+mathematicalCalculator.divide(Integer.parseInt(num1),Double.parseDouble(num2)));
                    }
                    else
                    {
                        try {
                            System.out.println(num1+"/"+num2+" = "+mathematicalCalculator.divide(Integer.parseInt(num1),Integer.parseInt(num2)));
                        }
                        catch (NumberFormatException e)
                        {

                            System.out.println(num1+"/"+num2+" = "+(Integer.parseInt(num1)*10)/(Integer.parseInt(num2)*10));
                        }
                        catch (NumberFormatException e1)
                        {

                            System.out.println(num1+"/"+num2+" = "+(Integer.parseInt(num1)*10)/(Double.parseDouble(num2)*10));
                        }
                    }

                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Enter 1st number : ");
                    num1 = scanner.next();
                    System.out.println("Enter 2nd number : ");
                    num2 = scanner.next();

                    num=Double.parseDouble(num1);
                    number=(int)(num);

                    numDouble = Double.parseDouble(num2);
                    numInteger = (int)(numDouble);
                    if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        System.out.println(num1+"/"+num2+" = "+mathematicalCalculator.modulo(Double.parseDouble(num1),Double.parseDouble(num2)));
                    }
                    else if(number % Double.parseDouble(num1)>0 && numInteger % Double.parseDouble(num2)==0)
                    {
                        System.out.println(num1+"/"+num2+" = "+mathematicalCalculator.modulo(Double.parseDouble(num1),Integer.parseInt(num2)));
                    }
                    else if (number % Double.parseDouble(num1)==0 && numInteger % Double.parseDouble(num2)>0)
                    {
                        System.out.println(num1+"/"+num2+" = "+mathematicalCalculator.modulo(Integer.parseInt(num1),Double.parseDouble(num2)));
                    }
                    else
                    {
                        System.out.println(num1+"/"+num2+" = "+mathematicalCalculator.modulo(Integer.parseInt(num1),Integer.parseInt(num2)));
                    }
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
