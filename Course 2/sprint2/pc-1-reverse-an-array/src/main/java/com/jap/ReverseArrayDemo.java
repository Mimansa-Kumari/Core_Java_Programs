package com.jap;

public class ReverseArrayDemo {
    public static void main(String[] args) {
        //Declare and initialize values of an array.
        int[] array = {23,34,43,56,67,78,43,35};
        //Create an object of the class ReverseArrayDemo.
        ReverseArrayDemo reverseArrayDemo = new ReverseArrayDemo();
        System.out.println("Before Reversing array : ");
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
       //Call the method getReverseArray and pass the array as parameter
        int[] reverseArray = reverseArrayDemo.getReverseArray(array);
        System.out.println("Reversed array : ");
        for (int i=0;i<array.length;i++)
        {
            System.out.print(reverseArray[i]+" ");
        }
    }

    //Write the logic to reverse the given array inside the below
    // method and return the reverse array.
    public int[] getReverseArray(int [] array){
        int[] reverse=new int[array.length];
        for (int i=0; i<array.length;i++)
        {
            reverse[array.length-i-1]=array[i];
        }
        return reverse;
    }
}
