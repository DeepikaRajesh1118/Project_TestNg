package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclassatlas.BaseClassAtlas;

public class PojoClass extends BaseClassAtlas{
	
//non parametrized constructor
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	//private WebElement
	
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	private WebElement cookies;
	
	//serach
	@FindBy(xpath="//img[@alt='Search']")
	private WebElement search;
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement searchlo;
	
	@FindBy(xpath="//button[@aria-label='Previous']")
	private WebElement carouselslide;


	


	//getters
	public WebElement getCookies() {
		return cookies;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSearchlo() {
		return searchlo;
	}
	public WebElement getCarouselslide() throws InterruptedException {
		for(int i=1; i<5; i++) {
			Thread.sleep(3000);
			carouselslide.click();	
		}
		return carouselslide;
	}
}
