package com.election;

public class Voter {
    private String name;
    private int age;
    final static  int VOTER_ELIGIBLE_AGE=18;
    Voter()
    {
        this.name=null;
        this.age=0;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getAgeCriteria()
    {
        if (getAge()>=VOTER_ELIGIBLE_AGE)
        {
            return getName()+" is Eligible to Vote";
        }
        else if (getAge()>=0 && this.age<VOTER_ELIGIBLE_AGE)
        {
            return getName()+" is not Eligible to Vote";
        }
        else
        {
            return "Age Can't Be Negative or Zero";
        }
    }
}
