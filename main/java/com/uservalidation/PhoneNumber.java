package com.uservalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface Iphone {
    public String validate(String regex, String input);
}
public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter phone number");
        String input=sc.next();
        Iphone isValidnumber = (pattern, phonenumber) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(phonenumber).matches();
        };

        System.out.println(isValidnumber.validate("^\\d{10}$", input));
    }

}
