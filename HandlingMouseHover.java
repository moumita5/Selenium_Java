package com.qsp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class HandlingMouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.amazon.in/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//driver.find_by_element_xpath("//input[@name='email']");
		//WebElement username = driver.findElement(By.xpath( "//input[@name='email']"));
		//username.sendKeys("moumitagiri2014@gmail.com");
		//WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
		//password.sendKeys("@05moumita");
		//driver.findElement(By.name("login")).click();
		
		WebElement search = driver.findElement(By.xpath( "//input[@id = 'twotabsearchtextbox']"));
		search.sendKeys("r");
		
		
		Actions ac = new Actions(driver);
		ac.moveToElement(search);
		
		Thread.sleep(100);
		
         driver.findElement(By.xpath( "//span[@class = 's-heavy' and text() = 'edmi 10']")).click();
		
		
         //JavaScriptExecutor jse =(JavaScriptExecutor)driver;
        // jse.execute("window.scrollBy(0,2000)");
         
         Thread.sleep(100);
         
         driver.findElement(By.xpath( "//span[@class = 'a-size-base a-color-base' and text() = 'Samsung']")).click(); 
         
         JavascriptExecutor jse = (JavascriptExecutor) driver;
         jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
         
         //JavascriptExecutor js = (JavascriptExecutor) driver;
         //js.executeScript("window.scrollBy(-100,document.body.scrollHeight)");
         
         driver.findElement(By.partialLinkText("https://www.amazon.fr/ref=footer_")).click();

	}

}



// brand xpath : //span[@class = 'a-size-base a-color-base puis-bold-weight-text' and text() ='Brand' ]
//samsung xpath checkbox : //span[@class = 'a-size-base a-color-base' and text() = 'Samsung']
