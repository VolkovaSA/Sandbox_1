package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class FirstClass extends BaseTest {

    @Test
    public void zipCode() {
        loginPage.open();
        loginPage.login("12345");
        registerPage.checkRegisterBtn();
        assertTrue(registerPage.checkRegisterBtn(), "Ожидалось наличие кнопки 'Register'");
    }

    @Test
    public void zipDigitCode() {
        loginPage.open();
        loginPage.login("12");
        assertEquals(loginPage.checkErrorMsg(), "Oops, error on page. ZIP code should have 5 digits");
    }
}
/*        Alert alert = browser.switchTo().alert();
        alert.accept();
        browser.switchTo().frame(1);
        browser.switchTo().defaultContent();*/
