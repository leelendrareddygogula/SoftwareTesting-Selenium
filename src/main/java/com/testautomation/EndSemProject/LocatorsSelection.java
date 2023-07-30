package com.testautomation.EndSemProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsSelection 
{
	public static void byLocators()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Third Year AY 2022-23\\Even Sem\\ST\\chromedriver_win32\\chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.facebook.com/");
		highlight(webDriver, webDriver.findElement(By.id("email")));
		highlightOrange(webDriver, webDriver.findElement(By.name("pass")));
		highlight(webDriver, webDriver.findElement(By.className("_8ice")));
		highlightOrange(webDriver, webDriver.findElement(By.linkText("Forgotten password?")));
		highlight(webDriver, webDriver.findElement(By.partialLinkText("Create a Pa")));
	}
	
	public static void highlight(WebDriver driver, WebElement element) 
	{
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
	
	public static void highlightOrange(WebDriver driver, WebElement element) 
	{
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 2px solid red;');", element);
    }
	
}
