package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclassatlas.BaseClassAtlas;

public class PojoDrop extends BaseClassAtlas {
	        //non parametrized constructor
			public PojoDrop() {
				PageFactory.initElements(driver, this);
			}
			//private WebElement
			@FindBy(xpath="(//li[@class='nav-item dropdown'])[1]")
			private WebElement dropdownmain;
			
			@FindBy(xpath="(//a[@class='dropdown-item'])[3]")
			private WebElement transport;
			
		

			//Getters
			public WebElement getDropdownmain() {
				return dropdownmain;
			}
			
			public WebElement getTransport() {
				return transport;
			}

}
