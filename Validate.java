/***
 * @Author:piyush_mishra
 * entering valid first name ,last name , password , mobile , and email and printing them .
 */


package com.bridgelab.User_registration;


import java.util.regex.Pattern;



@FunctionalInterface
interface Regex {



    boolean validate(String data , String pattern);

}

public class Validate {
    static final String F_NAME = "^[A-Z]\\w{3,}$";
    static final String L_NAME = F_NAME;
    static final String MOBILE = "^(91)[\\s][1-9][0-9]{9}$";
    static final String PASSWORD = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*[!@#$%&*^()<>:;']).{8,}$";
    static final String E_MAIL = ("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

    public static void main(String[] args)
    /**
     * creating lambda expression for checking first name last name and so on .
     *
     *
     */
    {
        Regex check = (data,pattern)->{
            try {
                if (data.length() == 0) throw new Exception("length can not be null");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Pattern.matches(pattern,data);
        };


/**
 * calling lambda function through references.
 */

        System.out.println(check.validate("Piyush",F_NAME));
        System.out.println(check.validate("Mishra",L_NAME));
        System.out.println(check.validate("91 1234567890",MOBILE));
        System.out.println(check.validate("piyushmishra.p@gmail.com",E_MAIL));
        System.out.println(check.validate("Piyush@123",PASSWORD));


    }

}
