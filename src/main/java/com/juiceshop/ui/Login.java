package com.juiceshop.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Login {

	

	public static void createLoginTest(WebDriver driver)throws InterruptedException {

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
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]")).click();  
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='checkoutButton']/span")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='card']/app-address/mat-card/div/button/span/span")).click(); // Address
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='address-form']/mat-form-field/div/div/div[3]/input")).sendKeys("Demo"); //Country
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='address-form']/mat-form-field[2]/div/div/div[3]/input")).sendKeys("Tester"); //Name
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("12345678"); // Mobile Number
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mat-input-6\"]")).sendKeys("12345678"); // Zip Code
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='address-form']/mat-form-field[5]/div/div/div[3]/textarea")).sendKeys("12345678"); // Address Details
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='address-form']/mat-form-field[6]/div/div/div[3]/input")).sendKeys("12345678"); // City
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='address-form']/mat-form-field[7]/div/div/div[3]/input")).sendKeys("12345678"); // State
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-address-create/div/mat-card/div[2]/button[2]")).click(); // Submit
			Thread.sleep(2000);


		
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();

		}
	



	}
}
	
		
