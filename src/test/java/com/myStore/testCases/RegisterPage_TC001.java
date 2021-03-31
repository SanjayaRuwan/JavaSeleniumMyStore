package com.myStore.testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.myStore.pageObjects.RegisterPage;

public class RegisterPage_TC001 extends BaseClass  {
	
	
	@Test
	public void register()  throws IOException, InterruptedException{
		
		
		RegisterPage regPage = new RegisterPage(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		regPage.clickSignIn();
//		logger.info("Clicked sign in button");
		
		regPage.setEmail("abcd123456789012@gmail.com");
		logger.info("Entered email address");
		Thread.sleep(1000);
		
		regPage.clickCreateAccount();
		logger.info("Clicked create account");
		Thread.sleep(3000);
		
//		String createAccountText=regPage.getcreateAccountText();
//		if(createAccountText.equals("CREATE AN ACCOUNT"))
//		{
//			Assert.assertTrue(true);
//			logger.info("Verify text passed");
//		}else{
//			Assert.assertFalse(false);;
//			logger.info("Verify text failed");
//		}
//		
//		Thread.sleep(2000);
		
		regPage.clickMale();
		Thread.sleep(2000);
		
		regPage.setCustomerFirstname("Nuwan");
		logger.info("Set first name");
		
		regPage.setCustomerLastname("Thishara");
		logger.info("Set last name");
		Thread.sleep(2000);
		
		 js.executeScript("window.scrollBy(0,1000)");
		 Thread.sleep(2000);
		 
		 
		String email = regPage.getEmail();
		System.out.println(email);
//		
//		if(email.equals("abcd1234kndsfuw@gmail.com")){
//			Assert.assertTrue(true);
//			logger.info("Verifed email");
//		}else{
//			captureScreen(driver,"Verify email");
//			Assert.assertTrue(false);
//			logger.info("wrong email");
//		}
		regPage.setPassword("1qaz@WSX");
		logger.info("Set password");
		
		regPage.setDays("31");
		logger.info("Set date");
		regPage.setMonths("March");
		logger.info("Set month");
		regPage.setYears("2000");
		logger.info("Set year");
		Thread.sleep(2000);
		
		regPage.checkNewsLetter();
		logger.info("check news letter");
		regPage.CheckInfo();
		logger.info("check info");
		Thread.sleep(2000);
		
		//YOUR ADDRESS
		
		String fname = regPage.getfName();
		System.out.println(fname);
		
		String lname = regPage.getlName();
		System.out.println(lname);
		Thread.sleep(2000);
		
		regPage.setCompany("SanwinTech Solution");
		logger.info("Added company name info");
		
		regPage.setAddress1("Kahahena");
		logger.info("Added address 1");
		
		regPage.setAddress2("Waga");
		logger.info("Added address 2");
		
		regPage.setCity("Hanwella");
		logger.info("Added city");
		
		regPage.setState("Texas");
		logger.info("Added state");
		
		regPage.setPostcode("10340");
		logger.info("Added zip code");
		
		regPage.setCountry("United States");
		logger.info("Selected country");
		
		regPage.setotherInfo("Hello World");
		logger.info("Added other information");
		
		regPage.setphoneNumber("0112393294");
		logger.info("Added phone number");
		
		regPage.setMobile("0714542381");
		logger.info("Added mobile number");
		
		regPage.setFutureAdderss("Kandy");
		logger.info("Added future address");
		Thread.sleep(8000);
		
		regPage.clickRegister();
		logger.info("Clicked register button");
		Thread.sleep(2000);
		
		String title= regPage.verifyTitle();
		System.out.println(title);
		
	}

}
