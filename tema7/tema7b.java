import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTests extends TestConfig {

    @Test
    public void tema7b() {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement usernameInput = driver.findElement(By.id("txt-username"));
        WebElement passwordInput = driver.findElement(By.id("txt-password"));
        WebElement loginButton = driver.findElement(By.id("btn-login"));
        usernameInput.sendKeys("username");
        passwordInput.sendKeys("password");
        loginButton.click();
        WebElement userPanel = driver.findElement(By.className("account"));
        assertTrue(userPanel.getText().contains("Welcome"));
    }

    @Test
    public void testInvalidLogin() {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement usernameInput = driver.findElement(By.id("txt-username"));
        WebElement passwordInput = driver.findElement(By.id("txt-password"));
        WebElement loginButton = driver.findElement(By.id("btn-login"));
        usernameInput.sendKeys("invalid_username");
        passwordInput.sendKeys("invalid_password");
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.className("alert-danger"));
        assertEquals("Invalid username or password!", errorMessage.getText());
    }
}
