package allPages;

import org.openqa.selenium.By;

import BasePP.BaseCCC;

public class LoginPPP extends BaseCCC {

	static By username = By.id("email");
	static By password = By.id("pass");
	static By loginButton = By.name("login");
	
	public static void Enter_Email(String EmailId) {
		driver.findElement(username).sendKeys(EmailId);
	}
	public static void Enter_Password(String Password) {
		driver.findElement(password).sendKeys(Password);
	}
	public static void LoginIn() {
		driver.findElement(loginButton).click();
	}
}
