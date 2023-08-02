package com.jap.fibonacci;
import java.util.Scanner;
public class FibonacciSeries
{
    // Write the logic in the method to generate the next number in the Fibonacci series
    public long fibonacci(long number) {
        if(number>=0)
        {
            if(number==0)
            {
                return 0;
            } else if (number==1)
            {
                return 1;
            }
            else
            {
                return fibonacci(number-1)+fibonacci(number-2);
            }
        }
        return -1;
    }
    // Print the series inside the method
    public void printFibonacciSeries(long number){
        for (int i=0;i<=number;i++)
        {
            System.out.print(fibonacci(i)+" ");
        }
    }
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= sc.nextInt();
        FibonacciSeries fib = new FibonacciSeries();
        // Call the  printFibonacciSeries() method and pass the value.
        long number = fib.fibonacci(num);
        fib.printFibonacciSeries(number);
    }
}
