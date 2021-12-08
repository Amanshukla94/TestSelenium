package automation;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;


public class Test3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
WebElement test2 =  driver.findElement((By.xpath("(//span/button[@type ='submit'])")));
Wait.until(ExpectedCondition.visibiltyof(test2)).click();
	//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	//driver.findElement(By.xpath("(//span/button[@type ='submit'])")).click();


	Alert Test = driver.switchTo().alert();
	System.out.println(Test.getText());
	Test.accept();
	
	
	//driver.close();
	
	}
}
