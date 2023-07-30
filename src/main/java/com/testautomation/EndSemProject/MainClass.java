package com.testautomation.EndSemProject;

import java.io.IOException;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) 
		{
			System.out.println("1. Open Browswer Window");
			System.out.println("2. Open a URL");
			System.out.println("3. Validate a user using credentials");
			System.out.println("4. Display Invalid Credentials Message");
			System.out.println("5. Using all Selectors");
			System.out.println("6. Dynamic CSS Selector");
			System.out.println("7. Dynamic Xpath");
			System.out.println("8. Dropdown");
			System.out.println("9. Screenshot a URL");
			System.out.print("	Enter an Operation: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Operations.openingBrowser(); break;
			case 2:
				Operations.openAGivenURL(); break;
			case 3: 
				Operations.validCredentialsBrowser(); break;
			case 4:
				Operations.invalidCredentialsMessage(); break;
			case 5:
				LocatorsSelection.byLocators(); break;
			case 6: 
				Operations.dynamicCSSSelector(); break;
			case 7:
				Operations.XpathImplementation(); break;
			case 8:
				Operations.selectDropdown(); break;
			case 9: 
				Operations.seleniumScreenshot(); break;
			default:
				break;
			}
		}
//		Operations.openingBrowser();
//		Operations.openAGivenURL();
//		Operations.validCredentialsBrowser();
//		Operations.invalidCredentialsMessage();
//		LocatorsSelection.byLocators();
//		Operations.dynamicCSSSelector();
//		Operations.XpathImplementation();
//		Operations.selectDropdown();
//		Operations.seleniumScreenshot();
	}
	
}
