package com.jap;

import java.util.Scanner;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0, sum=0.0;

        try{
            //Write the logic
            for (int i=0; i<ageRawData.length;i++)
            {
                sum= sum+Integer.parseInt(ageRawData[i]);
            }
            avg=sum/ageRawData.length;
            //Handle specific exception
        }catch (NumberFormatException exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        sc.nextLine();
        String age[] =new String[size];
        System.out.println("Enter the ages : ");
        for (int i= 0; i< age.length;i++)
        {
            age[i]=sc.next();
        }
        AverageAge averageAge = new AverageAge();
        System.out.println("String Age[] : ");
        for (int i= 0; i< age.length;i++)
        {
            System.out.print(age[i]+" ");
        }
        System.out.println("Average Age : "+averageAge.averageAgeCalculator(age));
    }


}
