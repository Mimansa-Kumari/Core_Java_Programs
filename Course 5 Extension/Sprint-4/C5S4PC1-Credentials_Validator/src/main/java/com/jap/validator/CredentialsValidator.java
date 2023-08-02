package com.jap.validator;
@FunctionalInterface
public interface CredentialsValidator {
public String validator(String userId,String password);
}
