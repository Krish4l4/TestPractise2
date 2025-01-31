package myPack;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshot {
    public static void main(String[] args) {
    	try {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://practice.expandtesting.com/login");
    	driver.manage().window().maximize();
    	
    	//full page screenshot
//    	TakesScreenshot ts=(TakesScreenshot)driver;
//    	File src=ts.getScreenshotAs(OutputType.FILE);
//    	File trg=new File("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\TestPractise\\\\Screenshot\\\\fullpage.jpg");
//    	FileUtils.copyFile(src, trg, false);
//    	
    	//screenshot of portion of page
//    	WebElement section=driver.findElement(By.xpath("//div[@class='card-body']"));
//    	File src=section.getScreenshotAs(OutputType.FILE);
//    	File trg=new File("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\TestPractise\\\\Screenshot\\\\sectionOfpage.jpg");
//    	FileUtils.copyFile(src, trg, false);
    	
    	//screenshot of specific webelement
    	WebElement ele=driver.findElement(By.xpath("//a[@aria-label='SUT']"));
    	File src=ele.getScreenshotAs(OutputType.FILE);
    	File trg=new File("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\TestPractise\\\\Screenshot\\\\logo.jpg");
    	FileUtils.copyFile(src, trg, false);
    	
    	
    	
    	}catch (IOException e) {
            System.out.println("An error occurred while saving the screenshot: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        } 
    }
    }
    	
    	
    

