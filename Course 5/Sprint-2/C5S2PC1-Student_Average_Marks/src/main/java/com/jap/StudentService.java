package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student st1 = new Student("Mim",55,450);
        Student st2 = new Student("Abhiraj",56,451);
        Student st3 = new Student("Pawan",57,452);
        Student st4 = new Student("Agnivesh",58,453);
        Student st5 = new Student("Priti",59,454);
        Student st6 = new Student("Ritesh",60,455);

        //create HashSet object and add all the students object inside it
        Set<Student> set = new HashSet<>();
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);
        set.add(st6);

        //return the HashSet object
        return set;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        TreeSet<String> set = new TreeSet<>();
        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext())
        {
            //get all the name and add it inside the TreeSet object
            set.add(String.valueOf(iterator.next().getName()));
        }
        //return the TreeSet object;
        return set;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        HashMap<String,Integer> map = new HashMap<>();
        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();
        //retrieve the Student object from the iterator
        while (iterator.hasNext()) {
            iterator.next();
        }
        //Use getter method to get TotalMarks of each student. calculate the average
        for (Student s : studentSet)
        {
            map.put(s.getName(),s.getTotalMarks());
        }
        //add the student name and average marks in the HashMap object created in the first line and return the map
           return map;
    }

    public static void main(String[] args) {
        Set<Student> studentName = getAllStudentData();
        System.out.println(studentName);
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }
}
