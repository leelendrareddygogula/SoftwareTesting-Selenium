package com.testautomation.EndSemProject;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Operations 
{
	@SuppressWarnings("unused")
	public static void openingBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
	}
	
	public static void openAGivenURL() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		System.out.print("Enter a URL to open: ");
		Scanner scanner = new Scanner(System.in);
		String url = scanner.next();
		WebDriver webDriver = new ChromeDriver();
		webDriver.get(url);
		System.out.println("Browser opened with title '"+webDriver.getTitle()+"'");
		scanner.close();
	}
	
	public static void validCredentialsBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		System.out.print("Enter a URL to open: ");
		Scanner scanner = new Scanner(System.in);
		String url = scanner.next();  //https://lms.kluniversity.in/login/index.php
		System.out.print("Enter the username: ");
		String username = scanner.next();
		System.out.print("Enter the password: ");
		String password = scanner.next();
		if (username.equals("2000030317") && password.equals("Password")) 
		{
			WebDriver webDriver = new ChromeDriver();
			webDriver.get(url);
			webDriver.findElement(By.id("username")).sendKeys(username);
			webDriver.findElement(By.id("password")).sendKeys(password);
			webDriver.findElement(By.id("loginbtn")).click();
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
		scanner.close();
	}
	
	public static void invalidCredentialsMessage() throws RuntimeException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		System.out.print("Enter a URL to open: ");
		Scanner scanner = new Scanner(System.in);
		String url = scanner.next();
		System.out.print("Enter the username: ");
		String username = scanner.next();
		System.out.print("Enter the password: ");
		String password = scanner.next();
		WebDriver webDriver = new ChromeDriver();
		webDriver.get(url);  //https://www.facebook.com/
		webDriver.findElement(By.id("email")).sendKeys(username);
		webDriver.findElement(By.id("pass")).sendKeys(password);
		webDriver.findElement(By.name("login")).click();
		String s = "";
		try 
		{
			s = webDriver.findElement(By.className("_9ay7")).getText();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		if (s.equals("")) 
		{
			
		}
		else
		{
			System.out.println("Invalid Credentials, try again");
		}
		System.out.println("The error message is,'" + s + "'");
		scanner.close();
	}
	
	public static void dynamicCSSSelector()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/github.com/login");
        LocatorsSelection.highlightOrange(driver, driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(4) > main:nth-child(1)")));
	}
	
	public static void XpathImplementation() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
        webDriver.get("https:/github.com/login");
        LocatorsSelection.highlight(webDriver, webDriver.findElement(By.xpath("//div[contains(@class,'application-main')]//main")));
	}
	
	public static void selectDropdown() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.amazon.in/");
		WebElement dropdown = webDriver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		webDriver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	public static void seleniumScreenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.amazon.in/");
		TakesScreenshot screenshot = (TakesScreenshot) webDriver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("F:\\Third Year AY 2022-23\\Even Sem\\ST\\Selenium Screenshot\\ss.png"));
	}
	
}
