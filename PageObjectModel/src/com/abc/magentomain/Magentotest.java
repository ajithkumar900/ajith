package com.abc.magentomain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobject.Home;
import com.abc.magentoobject.Login;
import com.abc.magentoobject.Welcome;

public class Magentotest 
{
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.magento.com");
	Welcome w=new Welcome(driver);
	w.clickOnMyAccount();
	Login l=new Login(driver);
	l.typeEmail("mvajith496@gmail.com");
	l.typePassword("784564@a");
	l.clickOnlogin();
	Home h=new Home(driver);
	h.clickOnLogOut();
	driver.quit();
	}
	}
