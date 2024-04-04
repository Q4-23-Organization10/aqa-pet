import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;


class SeleniumTestHW17 {

    private WebDriver driver;
    private final String URL = "https://the-internet.herokuapp.com/login";
    private final String USERNAME1 = "tomsmith";
    private final String PASSWORD1 = "SuperSecretPassword!";
    private final String USERNAME2 = "test";
    private final String PASSWORD2 = "test";

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/yana/aqa-pet/seleniumHW17/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @Test
    public void testEmptyLogin() throws InterruptedException {

        driver.get(URL);
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        assertTrue(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!"));
    }
    @Test
    public void testValidLogin() throws InterruptedException {

        driver.get(URL);
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        usernameInput.sendKeys(USERNAME1);
        passwordInput.sendKeys(PASSWORD1);
        loginButton.click();
        assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));

    }

    @Test
    public void testInvalidLogin() throws InterruptedException {

        driver.get(URL);
        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        usernameInput.sendKeys(USERNAME2);
        passwordInput.sendKeys(PASSWORD2);
        loginButton.click();
        assertTrue(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!"));

    }

    @AfterEach
    public void tearDown() {

        driver.quit();
    }

}
