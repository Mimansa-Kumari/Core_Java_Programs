package com.jap;
import java.util.Scanner;
public class ReverseStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create a String object.
        System.out.println("Enter any String : ");
        String string = sc.next();
        //Create an object of the class ReverseStringDemo
        ReverseStringDemo reverseStringDemo = new ReverseStringDemo();
        //Call the method getReverseString() and pass the parameter
        String reversedString = reverseStringDemo.getReverseString(string);
        System.out.println(reversedString);
    }
//Write the logic to reverse the String  inside the below method and return the reverse String.
public String getReverseString(String string){
        char[] reversedString=string.toCharArray();
        char[] str=new char[reversedString.length];
        int j=reversedString.length-1;
        if (j>=0)
        {
            for (int i=0;i<reversedString.length;i++)
            {
                str[j] =reversedString[i];
                j--;
            }
        }
        String reversed = new String(str);
        return reversed;

    }
}
