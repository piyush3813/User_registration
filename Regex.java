package com.bridgelab;

import java.util.Scanner;
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
    private static final String PASSWORD="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#$%&*^()<>:;']).{8,}$";
    private static final String E_MAIL=("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");

    public Regex( String gfg) {
    }


    public String gfg(){
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter first name ");
         fname = sc.nextLine();
        System.out.println(Pattern.matches(F_NAME,fname));

        System.out.println("enter last name ");
         lname = sc.nextLine();
        System.out.println( Pattern.matches(L_NAME,lname));

        System.out.println("enter E-mail ");
         email = sc.nextLine();
        System.out.println( Pattern.matches(E_MAIL,email));

        System.out.println("enter Mobile number of format 91 xxxxxxxxxx ");
         mobile = sc.nextLine();
        System.out.println( Pattern.matches(MOBILE,mobile));

        System.out.println("enter Password ");
         password = sc.nextLine();
        System.out.println( Pattern.matches(PASSWORD,password));


        return null;
    }

    public void display(){
        System.out.println("first name -->"+fname);
        System.out.println("last name -->"+lname);
        System.out.println("email -->"+email);
        System.out.println("Mobile number -->"+mobile);
        System.out.println("password entered -->"+password);
    }

    public static void main(String[] args){
        Regex re = new Regex(null ,null,null,null,null);
        re.gfg();
        re.display();

        }

    }

