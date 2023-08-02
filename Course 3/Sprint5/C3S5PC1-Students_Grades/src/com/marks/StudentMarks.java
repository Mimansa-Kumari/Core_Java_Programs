package com.marks;

public class StudentMarks {
    private int sum;
    public int calculateMarks(int math, int physics, int chemistry, int biology)
    {
        sum=math+physics+chemistry+biology;
        return sum;
    }
    public int calculateMarks(int physics, int chemistry, int biology)
    {
        sum=physics+chemistry+biology;
        return sum;
    }
    public double calculateMarks(double bst, double finance, double accounting)
    {
        double sum=bst+finance+accounting;
        return sum;
    }
}
