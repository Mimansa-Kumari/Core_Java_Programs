package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
        if(math.length>0 && science.length>0 && english.length>0)
        {
            int[] totalMarks = new int[math.length];
            for (int i=0;i<math.length;i++)
            {
                totalMarks[i] = math[i]+science[i]+english[i];
            }
            return totalMarks;
        }
        return null;
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageScienceMarks (int[] science,int len)
    {
        double average=0.0, sum=0.0;
        double[] scienceD=new double[science.length];
        for (int i=0;i<science.length;i++)
        {
            scienceD[i]=science[i];
        }
        if (len==1)
        {
            return scienceD[len-1]/science.length;
        }
        if (len>1)
        {
            sum=(scienceD[len-1]/science.length);
            return average = sum+calculateAverageScienceMarks(science,len-1);
        }
        return 0.0;
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageEnglishMarks (int[] english,int len)
    {
        double average=0.0, sum=0.0;
        double[] englishD=new double[english.length];
        for (int i=0;i<english.length;i++)
        {
            englishD[i]=english[i];
        }
        if (len==1)
        {
            return englishD[len-1]/english.length;
        }
        if (len>1)
        {
            sum=(englishD[len-1]/english.length);
            return average = sum+calculateAverageScienceMarks(english,len-1);
        }
        return 0.0;
    }
    // Write the logic to calculate the average marks using recursion
    public double calculateAverageMathMarks (int[] math,int len)
    {
        double average=0.0, sum=0.0;
        double[] mathD=new double[math.length];
        for (int i=0;i<math.length;i++)
        {
            mathD[i]=math[i];
        }
        if (len==1)
        {
            return mathD[len-1]/math.length;
        }
        if (len>1)
        {
            sum=(mathD[len-1]/math.length);
            return average = sum+calculateAverageScienceMarks(math,len-1);
        }
        return 0.0;
    }

    //Write the logic to find the top score in the class using recursion
    public int findTopScore(int [] totalMarks,int len){
        int maxMarks=totalMarks[0];
        if (len==1)
        {
            return maxMarks;
        }
        if (len>1)
        {
            return maxMarks=totalMarks[len-1]>findTopScore(totalMarks,len-2)?totalMarks[len-1]:findTopScore(totalMarks,len-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] math  = new int[]{88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = new int[]{80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = new int[]{90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        int noOfSubjects = 3;
        int len=math.length;
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
        int[] rollNos = new int[]{102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
        // Initialize the OakBridgeSchool class object
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Call the appropriate methods and display the output
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        System.out.println("Total marks : ");
        for (int i=0;i<totalMarks.length;i++)
        {
            System.out.print(totalMarks[i]+" ");
        }
        System.out.println();
        double scienceAverage = oakBridgeSchool.calculateAverageScienceMarks(science,len);
        System.out.println("Average Science Marks = "+scienceAverage);
        double englishAverage = oakBridgeSchool.calculateAverageEnglishMarks(english,len);
        System.out.println("Average English Marks = "+englishAverage);
        double mathAverage = oakBridgeSchool.calculateAverageMathMarks(math,len);
        System.out.println("Average Math Marks = "+mathAverage);
        int max=oakBridgeSchool.findTopScore(totalMarks,len);
        System.out.println("Maximum Score = "+max);
    }
}
