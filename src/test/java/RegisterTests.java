import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTests extends BaseTests {

    @Test
    public void validRegistrationTest() {

        homePage.goToRegister();

        registerPage.inputValidDataInFields();
        registerPage.clickCheckBoxAndContinue();

        String actualText = driver.findElement
                (By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]")).getText();
        System.out.println(actualText);
        Assert.assertEquals(actualText, "Your Account Has Been Created!");
    }
}
