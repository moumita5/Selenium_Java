package com.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitTest {


	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath("//[button[@class = 'search_btn']"));
		login.click();
		WebElement search = driver.findElement(By.cssSelector("//[input[role = 'searchbox']"));
		search.click();
		
		
		//Actions ac = new Actions(driver);
		//ac.moveToElement(dropdown).perform();
		//WebElement electronics = driver.findElement(By.xpath("//span[.= '10 prime']"));
		
		
	}
}
