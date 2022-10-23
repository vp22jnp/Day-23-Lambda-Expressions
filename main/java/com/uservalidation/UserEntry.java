package com.uservalidation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface userentry{
    public String validatefirstname (String regex ,String userentry);
}
public class UserEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //firstname
        System.out.println("Enter the first name :");
        String fname = sc.next();
        IFName isValiFirstName = (pattern, firstName) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(firstName).matches();
        };
        System.out.println(isValiFirstName.validate("^[A-Z]{1}[a-z]{3,9}$", fname));

        //lastname

        System.out.println("Enter the last name :");
        String lname = sc.next();
        IFName isValidLastName = (pattern, lastName) -> {

            return "Input provided is " + Pattern.compile(pattern).matcher(lastName).matches();
        };
        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{3,9}$", lname));

        //email

        System.out.println("enter email of user");
        String Email=sc.next();
        IEmail isValidEmail = (pattern,email)->{
            return"the input provided is->"+Pattern.compile(pattern).matcher(email).matches();
        };
        System.out.println(isValidEmail.validate("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", Email));

        //phoneNumber

        System.out.println("Enter phone number");
        String input=sc.next();
        Iphone isValidnumber = (pattern, phonenumber) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(phonenumber).matches();
        };

        System.out.println(isValidnumber.validate("^\\d{10}$", input));

        //password

        System.out.println("Enter password :");
        String privacy = sc.next();
        specialcasepassword isValidpassword = (pattern, password) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(password).matches();
        };

        System.out.println(isValidpassword.validate("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$", privacy));
    }

}










