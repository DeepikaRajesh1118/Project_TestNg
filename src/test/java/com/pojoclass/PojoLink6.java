package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclassatlas.BaseClassAtlas;

public class PojoLink6 extends BaseClassAtlas {
	
	//non paramitrized constructor
	public PojoLink6() {
		PageFactory.initElements(driver, this);
	}
	
	//private WebEleemnt
	@FindBy(xpath="(//a[@class='nav-link'])[1]")
	private WebElement link;
	
	@FindBy(xpath="(//a[@class='nav-link'])[2]")
	private WebElement portfolio;
	
	@FindBy(xpath="(//a[@class='nav-link'])[3]")
	private WebElement aboutus;
	
	@FindBy(xpath="(//a[@class='nav-link'])[4]")
	private WebElement news;
	
	@FindBy(xpath="(//a[@class='nav-link'])[5]")
	private WebElement contact;
	
	@FindBy(xpath="//a[text()='full-service logistics']")
	private WebElement fullservice;
	
	@FindBy(xpath="//img[@src='/AtlasLogisticsRefresh/media/Site-Layout/twitterX.png']")
	private WebElement twitter;
	
	@FindBy(xpath="//footer[@class='atlaslogistics']")
	private WebElement footer;

	@FindBy(xpath="//button[@class='ot-floating-button__open']")
	private WebElement privacy;

	//getters
	public WebElement getLink() {
		return link;
	}
	public WebElement getPortfolio() {
		return portfolio;
	}

	public WebElement getAboutus() {
		return aboutus;
	}

	public WebElement getNews() {
		return news;
	}

	public WebElement getContact() {
		return contact;
	}
	public WebElement getFullservice() {
		return fullservice;
	}
	public WebElement getTwitter() {
		return twitter;
	}

	public WebElement getFooter() {
		return footer;
    }
	public WebElement getPrivacy() {
		return privacy;
	}
}