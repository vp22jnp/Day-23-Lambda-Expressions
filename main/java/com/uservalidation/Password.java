package com.uservalidation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface Ipassword {
    public String validate(String regex, String privacy);
}
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password :");
        String privacy = sc.next();
        Ipassword isValidpassword = (pattern, password) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(password).matches();
        };

        System.out.println(isValidpassword.validate("^[A-Za-z]{8,}$", privacy));
    }

}




