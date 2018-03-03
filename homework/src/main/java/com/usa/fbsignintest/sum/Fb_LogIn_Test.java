package com.usa.fbsignintest.sum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fb_LogIn_Test {
	
	WebDriver driver;
	
	@Given("^User able to open internet browser$")
	public void user_able_to_open_internet_browser() throws Throwable {
	   driver=new FirefoxDriver();
	}

	@When("^Go to facebook home page$")
	public void go_to_facebook_home_page() throws Throwable {
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	}

	@When("^User put valid user email-sumss(\\d+)@yahoo\\.com$")
	public void user_put_valid_user_email_sumss_yahoo_com(int arg1) throws Throwable {
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("sumss04@yahoo.com");  
	}

	@When("^User put valid password -Sum@(\\d+)$")
	public void user_put_valid_password_Sum(int arg1) throws Throwable {
	 
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Sum@8888");
	}

	@When("^User click log in button$")
	public void user_click_log_in_button() throws Throwable {
	 
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}

	@Then("^User account log in successfully$")
	public void user_account_log_in_successfully() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='u_0_a']/div[1]/div[1]/div/a/span/span")).click();
		System.out.println("Facebook log in functionality test is successfully passed.");
	}

}
