package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.className("initial")).click();

driver.findElement(By.id("ext-gen23")).click();
Thread.sleep(30000);
driver.findElement(By.xpath("(//a/em/span[text()= '9'])")).click();

//driver.close();


	}

}
