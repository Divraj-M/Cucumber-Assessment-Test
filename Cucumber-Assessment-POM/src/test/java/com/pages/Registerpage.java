package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage {
	@FindBy(xpath="//ul[@class=\"list-inline\"]//li[2]//a")
	public WebElement MyAccount;
	
	@FindBy(xpath="//ul[@class=\"dropdown-menu dropdown-menu-right\"]//li[1]//a")
	public WebElement Register;
	
	@FindBy(xpath="//input[@id=\"input-firstname\"]")
	public WebElement Firstname;
	
	@FindBy(xpath="//input[@id=\"input-lastname\"]")
	public WebElement LastName;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	public WebElement Emailid;
	
	@FindBy(xpath="//input[@id=\"input-telephone\"]")
	public WebElement telephone;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	public WebElement password;
	
	@FindBy(xpath="//input[@id=\"input-confirm\"]")
	public WebElement confirmpassword;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
	public WebElement newsletteryes;
	
	@FindBy(xpath="//input[@name=\"agree\"]")
	public WebElement agreeterm;
	
	@FindBy(xpath="//input[@class=\"btn btn-primary\"]")
	public WebElement continueButton;
	
	@FindBy(xpath="//div[@class=\"col-sm-9\"]//p")
	public WebElement successregistermsg;
	
	
	
	
	
	
	
	
	

}
