package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
 driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
 Thread.sleep(15000);
 
 driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
 
 Thread.sleep(3000);
 Alert test = driver.switchTo() .alert();
 System.out.println(test.getText());
  test.accept();
		 
	}

}
