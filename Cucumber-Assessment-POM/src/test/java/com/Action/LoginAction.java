package com.Action;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pages.Loginpage;
import com.pages.Registerpage;
import com.utilities.HelperClass;

public class LoginAction {
	Loginpage Loginlocate=null;
	public LoginAction()
	{
		this.Loginlocate=new Loginpage();
		PageFactory.initElements(HelperClass.getDriver(), Loginlocate);
	}
	
	public void clickmyaccount()
	{
		Loginlocate.MyAccount.click();
	}
	public void clickloginhome()
	{
		Loginlocate.loginhome.click();
	}
	public void setvailddata(String email,String pass)
	{
		Loginlocate.email.sendKeys(email);
		Loginlocate.password.sendKeys(pass);
		
	}
	public void loginbuttonclick()
	{
		Loginlocate.loginbutton.click();
	}
	public void geterrormsg()
	{
		String act="Warning: No match for E-Mail Address and/or Password.";
		String exp=Loginlocate.errormsg.getText();
		Assert.assertEquals(act, exp);
		System.out.println(exp);
	}
	public void afterlogin()
	{
		String act="My Affiliate Account";
		String exp=Loginlocate.affilate.getText();
		Assert.assertEquals(act, exp);
		System.out.println(exp);
	}
	public void setInvaliddata(String mail,String pass)
	{
		Loginlocate.email.sendKeys(mail);
		Loginlocate.password.sendKeys(pass);
	}
	

}
