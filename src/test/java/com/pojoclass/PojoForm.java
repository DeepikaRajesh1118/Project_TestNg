package com.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclassatlas.BaseClassAtlas;

public class PojoForm extends BaseClassAtlas {
	
	//non parametrized constructor
		public PojoForm() {
			PageFactory.initElements(driver, this);
		}
		//private WebElement
		
		@FindBy(xpath="//a[text()='Request a Quote']")
		private WebElement form;
		
		@FindBy(xpath="(//input[@class='form-control'])[1]")
		private WebElement firstname;
	
		@FindBy(xpath="(//input[@class='form-control'])[2]")
		private WebElement lastname;
		
		@FindBy(xpath="(//input[@class='input-width-15 form-control'])[1]")
		private WebElement phone1;

		@FindBy(xpath="(//input[@class='input-width-15 form-control'])[2]")
		private WebElement phone2;
		
		@FindBy(xpath="//input[@class='input-width-20 form-control']")
		private WebElement phone3;
		
		@FindBy(xpath="(//input[@class='form-control'])[3]")
		private WebElement email;

		
		@FindBy(xpath="(//input[@class='form-control'])[4]")
		private WebElement company;
		
		@FindBy(xpath="(//input[@class='form-control'])[5]")
		private WebElement addresss;
		
		@FindBy(xpath="//input[@value='Submit']")
		private WebElement submit;
		
		@FindBy(xpath="(//input[@type='radio'])[1]")
		private WebElement radioProject;

	
		//getters
		public WebElement getForm() {
			return form;
		}
		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getPhone1() {
			return phone1;
		}
		public WebElement getPhone2() {
			return phone2;
		}
		public WebElement getPhone3() {
			return phone3;
		}

		public WebElement getAddresss() {
			return addresss;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getCompany() {
			return company;
		}

		public WebElement getSubmit() {
			return submit;
		}
		public WebElement getRadioProject() {
			return radioProject;
		}

}
