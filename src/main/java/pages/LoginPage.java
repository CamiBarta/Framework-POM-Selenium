package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.Constants;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputValidDataInLoginFields() {
        setText(By.cssSelector("#input-email"), Constants.EMAIL);
        setText(By.cssSelector("#input-password"), Constants.PASSWORD);
    }

    public void clickLoginButton() {
        click(By.cssSelector("input[value='Login']"));
    }

    public void searchItemToBuy() {
        driver.findElement(By.cssSelector(".form-control.input-lg"))
                .sendKeys("iphone", Keys.ENTER);
    }

    public void addToCart() {
        click(By.xpath("//div[@class='button-group']//button[1]"));
    }
}
