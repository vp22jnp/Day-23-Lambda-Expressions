package com.uservalidation;
import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface numericpassword{
    public String validate(String regex,String field);

public class Password1Numeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password :");
        String privacy = sc.next();
        Ipassword isValidpassword = (pattern, password) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(password).matches();
        };

        System.out.println(isValidpassword.validate("^(?=.*[A-Z])[a-zA-Z0-9]{8,}$", privacy));
    }

}


}
