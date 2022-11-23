package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Constants;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void inputValidDataInFields() {

        setText(By.cssSelector("#input-firstname"), Constants.FIRST_NAME);
        setText(By.cssSelector("#input-lastname"), Constants.LAST_NAME);
        setText(By.cssSelector("#input-email"), Constants.EMAIL);
        setText(By.cssSelector("#input-telephone"), Constants.TELEPHONE);
        setText(By.cssSelector("#input-password"), Constants.PASSWORD);
        setText(By.cssSelector("#input-confirm"), Constants.PASSWORD);
    }

    public void clickCheckBoxAndContinue() {
        click(By.xpath("//input[@type='checkbox']"));
        click(By.xpath("//input[@type='submit']"));
    }
}
