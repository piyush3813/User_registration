package com.bridgelab;


import com.bridgelab.User_registration.Regex;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;


public class RegexTest extends TestCase {
    /**
     * one happy case and one sad case for all the methods
     */

    @Test
    public void testValidate_fname() {
        Regex re = new Regex();
        boolean result = re.validate_fname("Saikiran");
        Assert.assertTrue(result);
    }

    @Test
    public void testValidate_fname_incorrect() {
        Regex re = new Regex();
        boolean result = re.validate_fname("saikiran");
        Assert.assertFalse(result);
    }

    @Test
    public void testValidate_lname() {
        Regex re = new Regex();
        boolean result = re.validate_lname("Professor");
        Assert.assertTrue(result);
    }

    @Test
    public void testValidate_lname_incorrect() {
        Regex re = new Regex();
        boolean result = re.validate_lname("professor");
        Assert.assertFalse(result);
    }

    @Test
    public void testValidate_email() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra.p@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void testValidate_email_incorrect1() {
        Regex re = new Regex();
        boolean result = re.validate_email("piy");
        Assert.assertFalse(result);
    }
    @Test
    public void testValidate_email_incorrect2() {
        Regex re = new Regex();
        boolean result = re.validate_email("piy@.com..in");
        Assert.assertFalse(result);
    }
    @Test
    public void testValidate_email_incorrect3() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra@gmail.a");
        Assert.assertFalse(result);
    }@Test
    public void testValidate_email_incorrect4() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra.p@.gmail");
        Assert.assertFalse(result);
    }@Test
    public void testValidate_email_incorrect5() {
        Regex re = new Regex();
        boolean result = re.validate_email(".piyush123@.gmail");
        Assert.assertFalse(result);
    }@Test
    public void testValidate_email_incorrect6() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra()*.p@gmail.com");
        Assert.assertFalse(result);
    }@Test
    public void testValidate_email_incorrect7() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra.p@%.*gmail");
        Assert.assertFalse(result);
    }@Test
    public void testValidate_email_incorrect8() {
        Regex re = new Regex();
        boolean result = re.validate_email("abc..2002@gmail.com");
        Assert.assertFalse(result);
    }@Test
    public void testValidate_email_incorrect9() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra.p@.gmail..com");
        Assert.assertFalse(result);
    }@Test
    public void testValidate_email_incorrect10() {
        Regex re = new Regex();
        boolean result = re.validate_email("abc.@gmail.com");
        Assert.assertFalse(result);
    }@Test
    public void testValidate_email_incorrect11() {
        Regex re = new Regex();
        boolean result = re.validate_email("abc@abc@gmail.com");
        Assert.assertFalse(result);
    }
    @Test
    public void testValidate_email_incorrect12() {
        Regex re = new Regex();
        boolean result = re.validate_email("abc@gmail.com.1a");
        Assert.assertFalse(result);
    }
    @Test
    public void testValidate_email_incorrect13() {
        Regex re = new Regex();
        boolean result = re.validate_email("abc@gmail.com.aa@.au");
        Assert.assertFalse(result);
    }

    @Test
    public void testValidate_mobile() {
        Regex re = new Regex();
        boolean result = re.validate_mobile("91 9828052609");
        Assert.assertTrue(result);
    }

    @Test
    public void testValidate_mobile_incorrect() {
        Regex re = new Regex();
        boolean result = re.validate_mobile("919828052609");
        Assert.assertFalse(result);
    }

    @Test
    public void testValidate_password() {
        Regex re = new Regex();
        boolean result = re.validate_password("saiKIRAN@123");
        Assert.assertTrue(result);
    }

    @Test
    public void testValidate_password_incorrect() {
        Regex re = new Regex();
        boolean result = re.validate_password("saiKIRAN123");
        Assert.assertFalse(result);
    }
}