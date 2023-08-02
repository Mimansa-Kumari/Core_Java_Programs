package com.jap.validator;

import java.util.Scanner;

public class CredentialsValidatorImpl {

    public String validateUser(String name, String password){
        CredentialsValidator credentialsValidator = (userId, password1) -> (userId.equals("admin") && password1.equals("1234"))?"valid user":"invalid user";
    return credentialsValidator.validator(name,password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user id : ");
        String userId = scanner.nextLine();
        System.out.println("Enter password : ");
        String password = scanner.nextLine();
        CredentialsValidatorImpl credentialsValidatorImpl = new CredentialsValidatorImpl();
        System.out.println(credentialsValidatorImpl.validateUser(userId,password));
    }
}
