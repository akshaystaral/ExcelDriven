package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "srchword")
	WebElement search;

	@FindBy(xpath = "//input[@aria-label='Search']")
	WebElement searchbtn;

	public WebElement search() {
		return search;
	}

	public WebElement searchbtn() {
		return searchbtn;
	}
}