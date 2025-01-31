package myPack;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class handlingAlerts {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//simple alert
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='alertButton']")));
//		button1.click();
//		Alert simpleAlert=driver.switchTo().alert();
//		System.out.println(simpleAlert.getText());
//		simpleAlert.accept();
//		
		//confirmation Alert
		
//		WebElement button2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button2); //Ensures the button is in view before clicking.
//		button2.click();
//		Alert confirmationAlert=driver.switchTo().alert();
//		System.out.println(confirmationAlert.getText());
//		//confirmationAlert.accept();//for accept
//		confirmationAlert.dismiss();//for cancel
//		System.out.println(driver.findElement(By.xpath("//span[@id='confirmResult']")).getText());
		
		//promt alert
		WebElement button3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button3); //Ensures the button is in view before clicking.
		button3.click();
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("READY");
		promptAlert.accept();
		System.out.println(driver.findElement(By.xpath("//span[@id='promptResult']")).getText());
		driver.quit();
		
		
	}

}
