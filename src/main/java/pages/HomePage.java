package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToRegister() {
        click(By.cssSelector(".caret"));
        click(By.xpath("//a[contains(text(),'Register')]"));
    }

    public void goToLogin(){
        click(By.cssSelector(".caret"));
        click(By.xpath("//a[contains(text(),'Login')]"));
    }
}
