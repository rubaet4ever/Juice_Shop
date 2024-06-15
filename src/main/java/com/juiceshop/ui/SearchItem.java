package com.juiceshop.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchItem {
	
	public static void createSearchItemTest(WebDriver driver)throws InterruptedException {

		try {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("soydijutro@gufum.com");//email
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]/span[1]/mat-icon")).click();//Ad-block Dismiss
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345678"); // password
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='login-form']/button")).click(); // login
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[2]/button/span/span")).click(); // Add Item
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[2]/button/span/span")).click(); 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//mat-grid-tile[3]/div/mat-card/div[2]/button/span/span")).click(); // Add Item
	Thread.sleep(2000);
	driver.findElement(By.xpath("//mat-search-bar[@id='searchQuery']/span/mat-icon[2]")).click(); 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//mat-search-bar[@id='searchQuery']/mat-form-field/div/div/div/input")).sendKeys("Apple"); 
	Thread.sleep(2000);

	driver.findElement(By.xpath("//mat-search-bar[@id='searchQuery']/mat-form-field/div/div/div/input")).sendKeys(Keys.ENTER); 
	Thread.sleep(2000);
	
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}
	



	}

}
