package com.uservalidation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface Ipassworduppercase {
    public String validate(String regex, String privacy);
}
public class Password1uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password :");
        String privacy = sc.next();
        Ipassworduppercase isValidpassword = (pattern, password) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(password).matches();
        };

        System.out.println(isValidpassword.validate("^[A-Za-z0-9]{8,}$", privacy));
    }

}


