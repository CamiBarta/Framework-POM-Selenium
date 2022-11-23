import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTests {

    @Test
    public void addProductToCartTest() throws InterruptedException {

        homePage.goToLogin();

        loginPage.inputValidDataInLoginFields();
        loginPage.clickLoginButton();
        loginPage.searchItemToBuy();
        Thread.sleep(5000);
        loginPage.addToCart();
        Thread.sleep(5000);

        String actualText = basePage.getText(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        System.out.println(actualText);
        Assert.assertTrue(actualText.contains("Success: You have added iPhone"), "The message is not the same");
    }
}
