package com.myStore.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//a[@title='Log in to your customer account']")
	WebElement login;
	
	@FindBy(id= "email_create")
	WebElement email_1;
	
	@FindBy (id="SubmitCreate")
	WebElement createAccount;
	
	@FindBy (xpath="//h1[text()='Create an account']")
	WebElement createAccountText;
	
	@FindBy (id="id_gender1")
	WebElement male;
	
	@FindBy (id="id_gender2")
	WebElement female;
	
	@FindBy (id="customer_firstname")
	WebElement fName;
	
	@FindBy (id="customer_lastname")
	WebElement lName;
	
	@FindBy (id="email")
	WebElement email_2;
	
	@FindBy (id="passwd")
	WebElement password;
	
	@FindBy (id="days")
	WebElement days;
	
	@FindBy (id="months")
	WebElement months;
	
	@FindBy (id="years")
	WebElement years;
	
	@FindBy (id="newsletter")
	WebElement newsletter;
	
	@FindBy (id="uniform-optin")
	WebElement uniformOptin;
	
	@FindBy (id="firstname")
	WebElement firstname;
	
	@FindBy (id="lastname")
	WebElement lastname;
	
	@FindBy (id="company")
	WebElement company;
	
	@FindBy (id="address1")
	WebElement address1;
	
	@FindBy (id="address2")
	WebElement address2;
	
	@FindBy (id="city")
	WebElement city;
	
	@FindBy (id="id_state")
	WebElement state;
	  
	@FindBy (id="postcode")
	WebElement postcode;
	
	@FindBy (id="id_country")
	WebElement country;
	
	@FindBy (id="other")
	WebElement otherInfo;
	
	@FindBy (id="phone")
	WebElement phone;
	
	@FindBy (id="phone_mobile")
	WebElement phoneMobile;
	
	@FindBy (id="alias")
	WebElement alias;
	
	@FindBy (id="submitAccount")
	WebElement submitAccount;
	
	@FindBy (xpath="//a[@title='Return to Home']")
	WebElement verifyTitle;
	
	public void clickSignIn(){
		login.click();
	}
	
	public void setEmail(String email1){
		email_1.sendKeys(email1);
	}
	
	public void clickCreateAccount(){
		createAccount.click();
	}
	public String getcreateAccountText(){
		String txt = createAccountText.getText();
		return txt;
	}
	public void clickMale(){
		male.click();
	}
	public void setCustomerFirstname(String customerFirstname){
		fName.sendKeys(customerFirstname);
	}
	public void setCustomerLastname(String customerLastname){
		lName.sendKeys(customerLastname);
	}
	public String getEmail(){
		String email = email_2.getText();
		return email;
	}
	public void setPassword(String pass){
		password.sendKeys(pass);
	}
	public void setDays(String setDays){
		days.click();
		days.sendKeys(setDays);
		days.click();
	}
	public void setMonths(String setMonths){
		months.click();
		months.sendKeys(setMonths);
		days.click();
	}
	public void setYears(String setYears){
		years.click();
		years.sendKeys(setYears);
		days.click();
	}
	public void checkNewsLetter(){
		newsletter.click();		
	}
	public void CheckInfo(){
		uniformOptin.click();	
	}
	public String getfName(){
		firstname.click();
		String fname=firstname.getText();
		return fname;
	}
	public String getlName(){
		String lname=lastname.getText();
		return lname;
	}
	public void setCompany(String companyName){
		company.sendKeys(companyName);
	}
	public void setAddress1(String address1Name){
		address1.sendKeys(address1Name);
	}
	public void setAddress2(String address2Name){
		address2.sendKeys(address2Name);
	}
	public void setCity(String cityName){
		city.sendKeys(cityName);
	}
	public void setState(String stateName){
		state.click();
		state.sendKeys(stateName);
		state.click();
	}
	public void setPostcode(String postcodeName){
		postcode.sendKeys(postcodeName);
	}
	public void setCountry(String countrySelect){
		state.click();
		country.sendKeys(countrySelect);
	}
	public void setotherInfo(String otherInfoValue){
		otherInfo.sendKeys(otherInfoValue);
	}
	public void setphoneNumber(String phoneNumber){
		phone.sendKeys(phoneNumber);
	}	
	public void setMobile(String mobile){
		phoneMobile.sendKeys(mobile);
	}
	public void setFutureAdderss(String futureAdderss){
		alias.clear();
		alias.sendKeys(futureAdderss);
	}
	public void clickRegister(){
		submitAccount.click();
	}
	public String verifyTitle(){
		String title = verifyTitle.getText();
		return title;
	}
}
