package com.ecom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.Baseclass;

public class Login extends Baseclass{

	public Login() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath ="//input[@name='uid']")
		WebElement userid;
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		@FindBy(xpath="//input[@name='btnLogin']")
		WebElement loginButton;
		@FindBy(xpath="//input[@name='btnReset']")
		WebElement resetButton;
		@FindBy(xpath="//a[text()='here']")
		WebElement getCredentials;

		
	}


