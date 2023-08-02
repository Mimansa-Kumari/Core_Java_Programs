package com.jap.marksevaluation;
public class OakBridgeSchool {

    public int[] calculateTotalMarks(int [] math,int science[],int[] english)
    {
        int[] sum=new int[math.length];
        if(math.length>0 && science.length>0 && english.length>0)
        {
            for(int i=0;i<math.length;i++)
            {
                sum[i]=math[i]+science[i]+english[i];
            }
            return sum;
        }
        return null;
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects){
        int sum=0;
        int[] averageMarks=new int[totalMarks.length];
        if(totalMarks.length>0 && noOfSubjects>0)
        {
            for (int i=0;i<totalMarks.length;i++)
            {
                averageMarks[i]=totalMarks[i]/noOfSubjects;
            }
            return averageMarks;
        }
        return null;
    }

   // Write the logic inside the method to calculate the grade based on the math mark of the student
    public char findGradeInMath(int math){
        char mathGrade='A';
        if(math>=90 && math<=100)
        {
            mathGrade='A';
        }
        else if(math>=80 && math<=89)
        {
            mathGrade='B';
        }
        else if (math>=70 && math<=79)
        {
            mathGrade='C';
        }
        else if (math>=60 && math<=69)
        {
            mathGrade='D';
        }
        else if (math<=59)
        {
            mathGrade='F';
        }
        return mathGrade;
    }
    // Write the logic inside the method to calculate the grade based on the science mark of the student
    public char findGradeInScience(int science){
        char scienceGrade='A';
        if(science>=90 && science<=100)
        {
            scienceGrade='A';
        }
        else if(science>=80 && science<=89)
        {
            scienceGrade='B';
        }
        else if (science>=70 && science<=79)
        {
            scienceGrade='C';
        }
        else if (science>=60 && science<=69)
        {
            scienceGrade='D';
        }
        else if (science<=59)
        {
            scienceGrade='F';
        }
        return scienceGrade;
    }
    // Write the logic inside the method to calculate the grade based on the english mark of the student
    public char findGradeInEnglish(int english){
        char englishGrade='A';
        if(english>=90 && english<=100)
        {
            englishGrade='A';
        }
        else if(english>=80 && english<=89)
        {
            englishGrade='B';
        }
        else if (english>=70 && english<=79)
        {
            englishGrade='C';
        }
        else if (english>=60 && english<=69)
        {
            englishGrade='D';
        }
        else if (english<=59)
        {
            englishGrade='F';
        }
        return englishGrade;
    }

    // Write the logic to sort the total marks of the students of the class, use insertion-sort

    public int[] sortByTotalMarks(int[] totalMarks)
    {
        for(int i=1; i<totalMarks.length; i++)
        {
            int key=totalMarks[i];
            int j = i-1;
            while (j>=0 && totalMarks[j]>key)
            {
                totalMarks[j+1]=totalMarks[j];
                j=j-1;
            }
            totalMarks[j+1]=key;
        }
        return totalMarks;
    }

    //Display the details of the student
    public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade,String studentName, int rollNo ){
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Grading And Evaluation");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("------------------------------------------------");
            System.out.println("Student Name\t\t\t\tRoll Number");
            System.out.println(studentName+"\t\t\t\t\t: "+rollNo);
            System.out.println("The total marks scored\t\t: "+totalMark);
            System.out.println("The average marks scored\t: "+averageMark);
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println("Grade in Math\t\t: "+mathGrade);
            System.out.println("Grade in Science\t: "+scienceGrade);
            System.out.println("Grade in English\t: "+englishGrade);
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println();
    }

    public static void main(String[] args) {

        // Declare and Initialize the object of OakBridgeSchool
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        // Declare and Initialize values to the arrays to store marks of math, science, english
        int[] math  = new int[]{88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = new int[]{80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = new int[]{90, 98, 100, 65, 54, 82, 40, 13, 45, 67};

        // Declare and Initialize a string array for storing student names
        String[] studentName = new String[]{"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};

        // Declare and Initialize an int array for storing roll numbers
        int[] rollNo = new int[]{102, 109, 101, 103, 104, 108, 110, 105, 106, 107};

        // Call the appropriate methods and display the results
        int[] totalMark=oakBridgeSchool.calculateTotalMarks(math,science,english);
        int[] averageMark=oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMark,3);
        int i=0;
        for (int j=0;j<math.length;j++)
        {
                char mathGrade= oakBridgeSchool.findGradeInMath(math[i]);
                char scienceGrade= oakBridgeSchool.findGradeInMath(science[i]);
                char englishGrade= oakBridgeSchool.findGradeInMath(english[i]);
                oakBridgeSchool.displayDetails(totalMark[i],averageMark[i],mathGrade,scienceGrade,englishGrade,studentName[i],rollNo[i] );
        }

        //Displaying the Sorted Marks
        int[] afterSorting = oakBridgeSchool.sortByTotalMarks(totalMark);
        System.out.println("After sorting marks from highest to lowest : ");
        for ( i=afterSorting.length-1;i>=0;i--)
        {
            System.out.println(afterSorting[i]);
        }
    }
}
