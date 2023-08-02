package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        int temp=0;
        try {
            for (int i=1;i<nameOfSchool.length;i++)
            {
                if (Integer.parseInt(scores[temp])<Integer.parseInt(scores[i]))
                {
                    temp=i;
                }
            }
        }
        catch (NumberFormatException exception)
        {
            return exception.toString();
        }

        return nameOfSchool[temp];

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        String upperCase[] = new String[name.length];
        try {
            for (int i=0;i<name.length;i++)
            {
                upperCase[i]=name[i].toUpperCase();
            }
        }
       catch (NullPointerException exception)
            {
                return new String[]{exception.toString()};
            }
        return upperCase;
    }


    public static void main(String[] args) {
        String nameOfSchools[]={"DAV","RSK","Treamis","Candor","Oak","UAV","BCGS","Baldwin","NPS"};
        String scores[]={"86","78","95","6","44","33","82","77","8","90"};
        QuizDemo quizDemo = new QuizDemo();
        System.out.println(quizDemo.highestScore(nameOfSchools,scores));
        String inUp[]=quizDemo.convertAllNamesToCapital(nameOfSchools);
        for (int i=0; i<inUp.length;i++)
        {
            System.out.print(inUp[i]+" ");
        }
    }
}






