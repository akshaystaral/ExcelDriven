package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectFile {

	WebDriver driver;

	public PageObjectFile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='txtlogin']")
	WebElement username;

	@FindBy(xpath = "//input[@id='pass_box']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;

	public WebElement emaiId() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement loginbtn() {
		return loginbtn;
	}
}
