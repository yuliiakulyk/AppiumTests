package ebenradio.screens;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Yuliia Kulyk on 06.02.2017.
 */
public class InfoScreen extends BaseScreen {
    public String packageName = "com.aws3.ebenradio:id/";
    public By nameField = By.id(packageName + "name");
    public String name = packageName + "name";
    public By emailField = By.id(packageName + "email");
    public String email = packageName + "email";
    public By messageField = By.id(packageName + "message");
    public String message = packageName + "message";
    public By submitButton = By.id("send");

    public InfoScreen (AndroidDriver driver) {
        super(driver);
    }

    public void fillAllFieldsSubmit(String name, String email, String message) {
        fillField(this.name, name);
        fillField(this.email, email);
        fillField(this.message, message);
        driver.findElement(submitButton).click();

        /*driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(messageField).sendKeys(message);
        driver.findElement(submitButton).click();*/
    }

    public void fillField(String field, String text) {
        WebElement inputField = driver.findElementById(field);
        //inputField.click();
        //inputField.clear();
        inputField.sendKeys(text);
        Assert.assertEquals(inputField.getAttribute("value"), text);
    }

}
