package com.myStore.utils;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is"+ e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	
	public String getUsername()
	{
		String userName= pro.getProperty("userName");
		return userName;
	}
	
	public String getPassword()
	{
		String password= pro.getProperty("password");
		return password;
	}
	
	public String getchromPath()
	{
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}
	
	public String getIEPath()
	{
		String iePath = pro.getProperty("iepath");
		return iePath;
	}
	
	public String getFFPath()
	{
		String ffPath = pro.getProperty("firefoxpath");
		return ffPath;
	}
	
}

