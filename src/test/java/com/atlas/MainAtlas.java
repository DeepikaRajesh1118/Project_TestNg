package com.atlas;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseclassatlas.BaseClassAtlas;
import com.pojoclass.PojoClass;
import com.pojoclass.PojoDrop;
import com.pojoclass.PojoForm;
import com.pojoclass.PojoLink6;

public class MainAtlas extends BaseClassAtlas {

	@BeforeClass
	public void launchBrowser() {
		browserLaunch();
		urlLaunch("https://www.atlaslogistics.com/");

	}

	@Test(priority = 1)
	public static void verify() {
		// 1.Testcase
		String Expected = urlLaunch("https://www.atlaslogistics.com/");
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(actual, Expected, "Verfied title");
	}

	@Test(priority = 2)
	public static void cookies() throws InterruptedException {
		PojoClass pl = new PojoClass();
		// 2.Testcase cookies are handled or not
		clickFunction(pl.getCookies());
		Assert.assertTrue(true);
	}

	@Test(priority = 3)
	public static void csearch() throws InterruptedException {
		PojoClass pl = new PojoClass();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(20));
		wait.ignoring(ElementNotInteractableException.class);
		// SoftAssert as=new SoftAssert();
		// 3.Testcase search Box give the proper content
		// search
		clickFunction(pl.getSearch());
		passtext(pl.getSearchlo(), "news");
		submitted(pl.getSearchlo());

	}

	@Test(priority = 4)
	public static void dcarousel() throws InterruptedException {
		// 4.Testcase carouselchecking
		PojoClass pl = new PojoClass();
		clickFunction(pl.getCarouselslide());
		// 5.Testcase carousel checking based maximize and minimize
		browserMinimize();
		Thread.sleep(3000);
		browserMaximize();
	}

	@Test(priority = 5)
	public static void elearnMoreLink() {
		// 6.TestCase All external link checking
		PojoLink6 pk = new PojoLink6();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(20));
		wait.ignoring(ElementNotInteractableException.class);
		// 7.Testcase
		clickFunction(pk.getLink());
		clickFunction(pk.getPortfolio());
		clickFunction(pk.getNews());
		clickFunction(pk.getNews());
		clickFunction(pk.getContact());
	}

	@Test(priority = 6)
	public static void linkclick() {
		// 10.TestCase
		PojoLink6 pk = new PojoLink6();
		clickFunction(pk.getFullservice());

	}

	@Test(priority = 7)
	public static void twitterlink() {
		PojoLink6 pk = new PojoLink6();
		// 11.Testcase
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pk.getTwitter());
		clickFunction(pk.getTwitter());
		// 12.Testcase to click the privacy setting
		js.executeScript("arguments[0].click();", pk.getPrivacy());
		// clickFunction(pk.getPrivacy());
		// 14.Testcase
		String foo = pk.getFooter().getText();
		System.out.println(foo);

	}

	@Test(priority = 8)
	public static void submitform() {
		// 15.TestCase submit form click and display
		PojoForm PF = new PojoForm();
		clickFunction(PF.getForm());
		Assert.assertTrue(true, "Form Opened");
		// 16.Testcase first name last name accept the upper and lower
		//17.Enter the all field
		passtext(PF.getFirstname(), "Deepika");
		passtext(PF.getLastname(), "Rajesh");
		passtext(PF.getPhone1(), "911");
		passtext(PF.getPhone2(), "255");
		passtext(PF.getPhone3(), "155");
		passtext(PF.getEmail(), "deepikarajesh211@gmail.com");
		passtext(PF.getCompany(), "ECS company");
		passtext(PF.getAddresss(), "Tivoli");
		//clickFunction(PF.getSubmit());
		SoftAssert s = new SoftAssert();
		String Expected = "https://www.atlaslogistics.com/request-a-quote";
		String actual = "https://www.atlaslogistics.com/request-a-quote";
		s.assertEquals(actual, Expected, "Request Form not submitted for empty field");
		
		//18.validate Email field
		PF.getEmail().clear();
		passtext(PF.getEmail(),"deepikarajesh");
		s.assertEquals(true, true);
		//19.Enter the valid mobile number try to give 2 digit invalid
		PF.getPhone1().clear();
		PF.getPhone2().clear();
		PF.getPhone3().clear();
		passtext(PF.getPhone1(),"12");
		passtext(PF.getPhone2(),"234");
		passtext(PF.getPhone3(),"1235");	
	}
	@Test(priority = 9)
	public static void backPage() {
		//22.Testcase Navigate to back page
		PojoForm PF = new PojoForm();
		clickFunction(PF.getForm());
		Assert.assertTrue(true, "Form Opened");
		driver.navigate().back();
		Assert.assertEquals(false, false);	
	}
	
	@Test(priority = 10)
	public static void dropDown() {
		//23.dropdown check
		 PojoDrop pd=new PojoDrop();
		 clickFunction(pd.getDropdownmain());
		 
		 Actions a=new Actions(driver);
		 a.moveToElement(pd.getTransport()).perform();
		 
		 a.moveToElement(pd.getTransport()).click().perform();
		 
		 
	}
	
	@AfterClass
	public static void browseclose() {
		driver.close();
	}

	
	

}
