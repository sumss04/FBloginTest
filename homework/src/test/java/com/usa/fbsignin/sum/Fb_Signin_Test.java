package com.usa.fbsignin.sum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fb_Signin_Test {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sumss04@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Sum@8888");
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_a']/div[1]/div[1]/div/a/span/span")).click();
		driver.quit();
		System.out.println("Successfully signin my facebook account.");	
	}

}
