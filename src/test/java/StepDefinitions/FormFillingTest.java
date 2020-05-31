package StepDefinitions;

//import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import UiTest.java;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.UiTest;
//import pages.fillTheForm;

public class FormFillingTest {
	
	 WebDriver driver = null;

	
	@Given("^I open the home page$")
    public void i_open_the_home_page() throws Throwable {

		System.out.println("Browser opening!!");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://ec2-34-250-139-60.eu-west-1.compute.amazonaws.com");
//		UiTest.openBrowser();
		
    }
    
    @When("^I fill the form with correct details$")
    public void i_fill_the_form_with_correct_details() throws Throwable {
//    	fillTheForm.enterTheform();
    	driver.findElement(By.name("fullName")).sendKeys("Prasad Babu");
//    	driver.close();
    	driver.findElement(By.name("country")).sendKeys("United Kingdom");
          driver.findElement(By.name("yob")).sendKeys("01101980");
          driver.findElement(By.name("position")).sendKeys("Politician");
          driver.findElement(By.name("url")).sendKeys("www.google.com");
          
          
     
    }
    
    @And("^I select Risk Level$")
    public void i_select_risk_level() throws Throwable {
    	
    	Select dropdown = new Select(driver.findElement(By.name("risk")));
        dropdown.selectByVisibleText("Medium");
//    	fillTheForm.selectRiskValue();
    	
    	
    }

    @Then("^I should see a pop up message with a message$")
    public void i_should_see_a_pop_up_message_with_a_message() throws Throwable {

//    	fillTheForm.waitForTextToAppear();
    	String actualString = driver.findElement(By.cssSelector("div.modal-body")).getText();
    	
//    	String actualString = driver.switchTo().alert().getText();
//        driver.switchTo().alert().accept();
    	System.out.println(actualString);
    	
    	Assert.assertTrue(actualString.contains("You added John Doe to the list of entities."));
    }

    @And("^I click on save button$")
    public void i_click_on_save_button() throws Throwable {

//        fillTheForm.clickOnSaveBtn();
        driver.findElement(By.cssSelector(".btn")).click();
    }
    
    
    @Then("^I click on back button$")
    public void i_click_on_back_button() throws Throwable {
//    	driver.switchTo().alert().accept();
    	driver.findElement(By.xpath("//div[2]/button")).click();
        
    }

    @And("^I close the browser$")
    public void i_close_the_browser() throws Throwable {
    	driver.close();
        
    }
    
    @When("^I dont fill the form$")
    public void i_dont_fill_the_form() throws Throwable {
    	driver.findElement(By.name("fullName")).sendKeys(" ");
//    	driver.close();
    	driver.findElement(By.name("country")).sendKeys(" ");
          driver.findElement(By.name("yob")).sendKeys(" ");
          driver.findElement(By.name("position")).sendKeys(" ");
          
    }


    @When("^I give invalid \"([^\"]*)\"$")
    public void i_give_invalid_something(String strArg1) throws Throwable {
    	driver.findElement(By.name("url")).sendKeys("google");
    }

    @Then("^an error should be shown$")
    public void an_error_should_be_shown() throws Throwable {
    	String actualError = driver.findElement(By.cssSelector(".invalid-feedback")).getText();
    	Assert.assertTrue(actualError.contains("Invalid URL format."));
    }
    
    @When("^I submit empty form$")
    public void i_submit_empty_form() throws Throwable {
    	i_click_on_save_button();
    	
    }

    @Then("^the form should not be submitted$")
    public void the_form_should_not_be_submitted() throws Throwable {
    	
    	if (driver.findElement(By.cssSelector("div.modal-body")).isDisplayed()) {
    		System.out.println("The test has failed!!");
    		} else {
    			System.out.println("The test has failed!!");
    		}
    }
	
}
