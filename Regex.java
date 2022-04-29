package com.bridgelab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    String fname,lname,email,mobile,password;

    Regex(String fname,String lname, String email, String mobile , String password){
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.mobile=mobile;
        this.password=password;
    }

    private static final String F_NAME="^[A-Z]\\w{3,}$";
    private static final String L_NAME="^[A-Z]\\w{3,}$";
    private static final String MOBILE="^(91)[\\s][1-9][0-9]{9}$";
    private static final String PASSWORD="^\\d\\w{8,}$";
    private static final String E_MAIL=("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

    public Regex( String gfg) {
    }


    public static String gfg(){
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter first name ");
        String fname = sc.nextLine();
        System.out.println(Pattern.matches(F_NAME,fname));

        System.out.println("enter last name ");
        String lname = sc.nextLine();
        System.out.println( Pattern.matches(L_NAME,lname));

        System.out.println("enter E-mail ");
        String email = sc.nextLine();
        System.out.println( Pattern.matches(E_MAIL,email));

        System.out.println("enter Mobile number of format 91 xxxxxxxxxx ");
        String mobile = sc.nextLine();
        System.out.println( Pattern.matches(MOBILE,mobile));

        System.out.println("enter Mobile number of format 91 xxxxxxxxxx ");
        String password = sc.nextLine();
        System.out.println( Pattern.matches(PASSWORD,password));


        return null;
    }

    public static void main(String[] args){
        List<Regex> list = new ArrayList<Regex>();

        Regex l1 = new Regex(gfg());

    }
}
