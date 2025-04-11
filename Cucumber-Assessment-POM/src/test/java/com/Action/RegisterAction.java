package com.Action;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pages.Registerpage;
import com.utilities.HelperClass;

public class RegisterAction {
	Registerpage Registerlocate=null;
	public RegisterAction()
	{
		this.Registerlocate=new Registerpage();
		PageFactory.initElements(HelperClass.getDriver(), Registerlocate);
	}
	
	public void clickMyaccount()
	{
		Registerlocate.MyAccount.click();
		Registerlocate.Register.click();
	}
	public void setfields(String first,String last,String email,String phone,String pass,String confirm)
	{
		Registerlocate.Firstname.sendKeys(first);
		Registerlocate.LastName.sendKeys(last);
		Registerlocate.Emailid.sendKeys(email);
		Registerlocate.telephone.sendKeys(phone);
		Registerlocate.telephone.sendKeys(pass);
		Registerlocate.confirmpassword.sendKeys(confirm);
		Registerlocate.newsletteryes.click();
		Registerlocate.agreeterm.click();
		
	}
	public void registerconfirm()
	{
		Registerlocate.continueButton.click();
		
	}
	public void Successmsg()
	{
		String act1="Congratulations! Your new account has been successfully created!";
		String act2="If you already have an account with us, please login at the login page.";
		try
		{
			String exp=Registerlocate.successregistermsg.getText();
			if(act1.equalsIgnoreCase(exp))
			{
				Assert.assertEquals(act1, exp);
				System.out.println(act1);
			}
			else if(act2.equalsIgnoreCase(exp))
			{
				Assert.assertEquals(act2, exp);
				System.out.println(act2);
				System.out.println("User Already Registered");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		
		
	}

}
