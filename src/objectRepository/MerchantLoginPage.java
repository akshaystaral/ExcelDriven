package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MerchantLoginPage {
	
	WebDriver driver;
	
	public  MerchantLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username = By.xpath("//input[@id='txtlogin']");
	By password = By.xpath("//input[@id='pass_box']");
	By loginbtn = By.xpath("//input[@value='Login']");
	
	public WebElement emaiId()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginbtn()
	{
		return driver.findElement(loginbtn);
	}
}
