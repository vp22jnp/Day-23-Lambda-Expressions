package com.uservalidation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface specialcasepassword {
    public String validate(String regex, String field);
}
public class PasswordSpecialcharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password :");
        String privacy = sc.next();
        specialcasepassword isValidpassword = (pattern, password) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(password).matches();
        };

        System.out.println(isValidpassword.validate("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$", privacy));
    }

}


