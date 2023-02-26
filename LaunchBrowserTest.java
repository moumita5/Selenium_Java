package com.qsp;

import org.openqa.selenium.chrome.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class LaunchBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.find_by_element_xpath("//input[@name='email']");
		WebElement username = driver.findElement(By.xpath( "//input[@name='email']"));
		username.sendKeys("moumitagiri2014@gmail.com");
		WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("@05moumita");
		driver.findElement(By.name("login")).click();

	}

}
