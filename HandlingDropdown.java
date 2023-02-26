package com.qsp;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		String url = "https://www.amazon.in/ap/signin?_encoding=UTF8&accountStatusPolicy=P1&openid.assoc_handle=inamazon&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcss%2Forder-history%3Fie%3DUTF8%26ref_%3Dnav_orders_first&pageId=webcs-yourorder&showRmrMe=1";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(100);
		WebElement mobilenumber = driver.findElement(By.xpath("//input[@id='ap_email']"));
		Thread.sleep(100);
		mobilenumber.sendKeys("916290042332");
		Thread.sleep(100);
		WebElement submit = driver.findElement(By.xpath("//input[@id ='continue']"));
		submit.click();
		Thread.sleep(100);
		WebElement password = driver.findElement(By.xpath("//input[@id = 'ap_password']"));
		password.sendKeys("N8420072638c%");
		Thread.sleep(100);
		WebElement signup = driver.findElement(By.xpath("//input[@id ='signInSubmit']"));
		signup.click();
		WebElement dropdown = driver.findElement(By.xpath("//input[@name ='field-keywords']"));
		dropdown.sendKeys("redmi 10 prime");
		dropdown.click();
		Thread.sleep(100);
		//Actions ac = new Actions(driver);
		//ac.moveToElement(dropdown).perform();
		//WebElement electronics = driver.findElement(By.xpath("//span[.= '10 prime']"));
		
		WebElement electronics = driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']"));
		electronics.click();
		WebElement primephone = driver.findElement(By.cssSelector("img[class= s-image]"));
		primephone.click();
		
		
		
		
		
		//search.sendKeys("redmi note");
		
		
	}

}
