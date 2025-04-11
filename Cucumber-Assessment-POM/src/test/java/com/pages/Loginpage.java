package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	@FindBy(xpath="//ul[@class=\"list-inline\"]//li[2]//a")
	public WebElement MyAccount;
	
	@FindBy(xpath="//ul[@class=\"dropdown-menu dropdown-menu-right\"]//li[2]//a")
	public WebElement loginhome;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	public WebElement email;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	public WebElement password;
	
	@FindBy(xpath="//input[@value=\"Login\"]")
	public WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]")
	public WebElement errormsg;
	
	@FindBy(xpath="//div[@class=\"col-sm-9\"]//h2[3]")
	public WebElement affilate;
	

}
