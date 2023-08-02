package com.jap.ballad;

public class BalladImpl {
    public static void main(String[] args) {
        Ballad ballad = new Ballad();
        String a = ballad.readPoemFromAFile("F:\\NIIT\\Course 4\\Sprint 3\\C4S3PC2-The_Night_Before_Christmas-Read_From_a_File\\src\\main\\resources\\ballad.txt");
        System.out.println(a);
    }
}
