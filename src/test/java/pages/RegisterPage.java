package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegisterPage {
    WebDriver browser;

    private static final By REGISTER_BTN = By.xpath("//input[@value='Register']");

    public RegisterPage(WebDriver browser) {
        this.browser = browser;
    }

    public boolean checkRegisterBtn() {
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(REGISTER_BTN));
        return browser.findElement(REGISTER_BTN).isDisplayed();
    }
}
