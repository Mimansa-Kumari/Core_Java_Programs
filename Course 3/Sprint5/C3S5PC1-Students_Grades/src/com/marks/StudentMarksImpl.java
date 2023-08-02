package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();
        System.out.println("Total Marks of Medical Pathway Students : "+studentMarks.calculateMarks(88,94,79,90));
        System.out.println("Total Marks of Non Medical Pathway Students : "+studentMarks.calculateMarks(77,88,93));
        System.out.println("Total Marks of Business Pathway Students : "+studentMarks.calculateMarks(77.7,78.3,93.4));
    }
}
