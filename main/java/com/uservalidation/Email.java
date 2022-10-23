package com.uservalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface IEmail{
    public String validate (String regex ,String field);
}

public class Email {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter email of user");
        String field=sc.next();
        IEmail isValidEmail = (pattern,email)->{
            return"the input provided is->"+Pattern.compile(pattern).matcher(email).matches();
        };
        System.out.println(isValidEmail.validate("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", field));

    }
}
