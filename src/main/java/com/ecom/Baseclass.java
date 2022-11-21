package com.ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	
		static String projectPath = System.getProperty("user.dir");
		public static WebDriver driver;
		public static WebDriver getDriver() {
		//System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\driver\\chromedriver.exe");
		  
        WebDriver driver = new ChromeDriver();
 
         driver.get("https://demo.guru99.com/V1/index.php ");
         return driver;
	}

}
