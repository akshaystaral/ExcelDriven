package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.MerchantLoginPage;

public class LoginApplication {

	/* MerchantLoginPage class is implemented in normal POM style
	 * 	HomePage class is implement in PageObject Factory style
	 */
		
	
	@Test
	public void Login() {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "A://Chromedriver//88//chromedriver.exe");
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
		MerchantLoginPage mLogin = new MerchantLoginPage(driver); // Login page WebElements
		mLogin.emaiId().sendKeys("pomtestsmailbox@rediffmail.com"); // WebElement emaiId access using mLogin object
		mLogin.password().sendKeys("Pass@1234");
		mLogin.loginbtn().click();

		HomePage homepage = new HomePage(driver); // Object of Class HomePage Created to access HomePage page
		homepage.search().sendKeys("Selenium");
		homepage.searchbtn().click();
	}
}
