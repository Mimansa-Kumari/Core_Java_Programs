package com.jap.marksevaluation;
public class OakBridgeSchool {
    public int[] calculateTotalMarks(int [] math,int science[],int[] english) {
        if(math.length>0 && science.length>0 && english.length>0)
        {
            int[] totalMarks=new int[math.length];
            for (int i=0;i<math.length;i++)
            {
                totalMarks[i]=math[i]+science[i]+english[i];
            }
            return totalMarks;
        }
        return null;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        if(totalMarks.length>0 && noOfSubjects>0)
        {
            int[] averageMarks=new int[totalMarks.length];
            for (int i=0;i<totalMarks.length;i++)
            {
                averageMarks[i] = totalMarks[i]/noOfSubjects;
            }
            return averageMarks;
        }
        return null;
    }
    public int calculateAverageScienceMarks (int[] science)
    {
        int averageScMarks, sum=0;
        if(science.length>0)
        {
            for(int i=0;i<science.length;i++)
            {
                sum=sum+science[i];
            }
            averageScMarks=sum/science.length;
            return averageScMarks;
        }
        return -1;
    }
    public int calculateAverageEnglishMarks (int[] english)
    {
        int averageEngMarks, sum=0;
        if(english.length>0)
        {
            for(int i=0;i<english.length;i++)
            {
                sum=sum+english[i];
            }
            averageEngMarks=sum/english.length;
            return averageEngMarks;
        }
        return -1;
    }
    public int calculateAverageMathMarks (int[] math) {
        int averageMathMarks, sum=0;
        if(math.length>0)
        {
            for(int i=0;i<math.length;i++)
            {
                sum=sum+math[i];
            }
            averageMathMarks=sum/math.length;
            return averageMathMarks;
        }
        return -1;
    }

    public static void main(String[] args) {
        //Object of OakBridgeSchool class is created
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Initialize the arrays with 10 values of marks for each subject
        int [] math = {88,89,100,70,60,80,35,3,25,56};
        int [] science = {80,83,99,67,56,84,38,9,32,65};
        int [] english = {90,98,100,65,54,82,40,13,45,67};
        // The total number of subjects
        int noOfSubjects = 3;
        // Initialize names of 10 Students
        String[] studentNames = {"Michelle","Kate", "Ann","Tina","Tom","Sam","Ria","Pam","Leena","Leo"};
        // Initialize roll numbers of 10 Students
        int [] rollNos = {102,109,101,103,104,108,110,105,106,107};
        // Call the methods to calculate total marks and average marks
        int [] totalMarks = oakBridgeSchool.calculateTotalMarks(math,science,english);
        int [] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks,noOfSubjects);
        // Display the marks and average marks of each student
        for (int i=0; i<studentNames.length;i++)
        {
            System.out.println("_____________________________________________________________________");
            System.out.println("Student Name : "+studentNames[i]+"    ||    Roll number : "+rollNos[i] );
            System.out.println("_____________________________________________________________________");
            System.out.println("Total Marks : "+totalMarks[i]+"/300");
            System.out.println("Average Marks : "+averageMarks[i]);
            System.out.println("_____________________________________________________________________");
            System.out.println();
        }
        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);

        // Display the average marks scored by the class in subjects
        System.out.println("Average Science Marks stored by the class is "+averageScienceMarks);
        System.out.println("Average Math Marks stored by the class is "+averageMathMarks);
        System.out.println("Average English Marks stored by the class is "+averageEnglishMarks);

    }
}
