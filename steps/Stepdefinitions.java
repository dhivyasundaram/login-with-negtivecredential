package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinitions {
	public ChromeDriver driver; //global variable
	@Given("Open the chrome browser")
	public  void openchromebrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("Load the application url")
	public  void Loadtheapplicationurl()  {
		driver.get("http://leaftaps.com/opentaps");
	}
	@Given("Enter the username as {string}")
	
	public  void enterusername(String uName) {
		driver. findElement(By.id("username")).sendKeys(uName);
			}
	@Given("Enter the password as {string}")
	
	public  void enterpassword(String pWord) {
		driver. findElement(By.name("PASSWORD")).sendKeys(pWord);
	}
	@When("click on login button")
	public  void clicklogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
		}
	@Then("Home page should be displayed")
	public  void verifyHomepage() {
		boolean displayed= driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage is displayed");
		}
		else
			System.out.println("Home page is not displayed");
					}
	@But ("Error message should be displayed")

	
	public  void verifyErrorMessage() {
		System.out.println("Error message is displayed");
		
			}


		
		}












































