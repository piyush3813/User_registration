package com.bridgelab;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertTrue(result);
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
        Assert.assertTrue(result);
    }

    @Test
    public void testValidate_email() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra.p@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void testValidate_email_incorrect() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra.p@gmail..com");
        Assert.assertFalse(result);
    }
    @Test
    public void testValidate_email_incorrect2() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyus@hmishra.p@gmail..com");
        Assert.assertFalse(result);
    }
    @Test
    public void testValidate_email_incorrect3() {
        Regex re = new Regex();
        boolean result = re.validate_email("piyushmishra.p@.gmail..com");
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
        Assert.assertTrue(result);
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
        Assert.assertTrue(result);
    }
}