package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected String url = "http://tutorialsninja.com/demo/";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By element) {
        driver.findElement(element).click();
    }

    public void setText(By element, String text) {
        driver.findElement(element).sendKeys(text);
    }

    public String getText(By element) {
        return driver.findElement(element).getText();
    }

    public void goToUrl() {
        driver.get(url);
    }

    public void clearField(By element){
        driver.findElement(element).clear();
    }
}
