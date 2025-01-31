package myPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {
        

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a website
        driver.get("https://practice.expandtesting.com/login");
        
        WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("practice");
        
        WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("SuperSecretPassword!");
        
        WebElement loginButton=driver.findElement(By.xpath("(//button[normalize-space()='Login'])[1]"));
        loginButton.click();
        
        
    }
}

