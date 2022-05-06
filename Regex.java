/***
 * @Author:piyush_mishra
 * entering valid first name ,last name , password , mobile , and email and printing them .
 */


package com.bridgelab.User_registration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    private static final String F_NAME="^[A-Z]\\w{3,}$";
    private static final String L_NAME=F_NAME;
    private static final String MOBILE="^(91)[\\s][1-9][0-9]{9}$";
    private static final String PASSWORD="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*[!@#$%&*^()<>:;']).{8,}$";
    private static final String E_MAIL=("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

    public Regex( String gfg) {
    }

    public Regex() {

    }

    public boolean validate_fname(String fname)
    {
        try {
            if (fname.length()==0) throw new Exception("length can not be null");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pattern.matches(F_NAME, fname);
    }

    public boolean validate_lname(String lname)
    {
        try {
            if (lname.length()==0) throw new Exception("length can not be null");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pattern.matches(L_NAME, lname);
    }

    public boolean validate_email(String email)
    {
        try {
            if (email.length()==0) throw new Exception("length can not be null");
        } catch (Exception e) {
            e.printStackTrace();

        }

        return Pattern.matches(E_MAIL, email);
    }

    public boolean validate_mobile(String mobile)
    {
        try {
            if (mobile.length()==0) throw new Exception("length can not be null");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pattern.matches(MOBILE, mobile);
    }

    public boolean validate_password(String password)
    {
        try {
            if (password.length()==0) throw new Exception("length can not be null");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Pattern.matches(PASSWORD, password);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Regex re = new Regex();
        System.out.println("first name >>"+(re.validate_fname("Piyush")));
        System.out.println("last name >>"+(re.validate_lname("Mishra")));
        System.out.println("Mobile number >>"+(re.validate_mobile("91 9915018976")));
        System.out.println("email >>"+(re.validate_email("piyushmishra.p@gmail.com")));
        System.out.println("password >>"+(re.validate_password("Piyush@123")));

        }

    }

