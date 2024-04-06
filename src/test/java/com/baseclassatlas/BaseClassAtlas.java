package com.baseclassatlas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassAtlas {
	
	public static WebDriver driver;
	
	public static void browserLaunch() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	//minimize
	public static void browserMinimize() {
		Dimension d = new Dimension(480,620);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);
        System.out.println(driver.manage().window().getSize());
	}
	public static String urlLaunch(String url) {
		driver.get(url);
		return url;
	}
	//click
	public static void clickFunction(WebElement cookies) {
		cookies.click();
	}
	//senkeys
	public static void passtext(WebElement search,String text ) {
		search.sendKeys(text);
	
	}
	//submit
	public static void submitted(WebElement submi) {
		submi.submit();
	}
	
	public static void browserMaximize() {
		//Point p = new Point(300,550);
        //Resize the current window to the given dimension
        //driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
        		
	}
	
	

}
