package com.jap.addevens;
import java.util.Scanner;
public class AddEven
{
    //Write the logic to add evens in the methods
    public long addEvens(int n) {
        if(n==1)
        {
            return 0;
        }
      for (int i=n;i>=2;i--)
      {
          if(i%2==0)
          {
              return i + addEvens(i-1);
          }
      }
        return  0;
    }
        public static void main(String[] args) {
            // Initialize the object of AddEven class
            AddEven addEven = new AddEven();
            // Declare a variable to give as input to the addEvens method
            System.out.println("Enter a number : ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            // Call the addEvens method and display the result
            long sum = addEven.addEvens(num);
            System.out.println("Sum = "+sum);
        }
}
