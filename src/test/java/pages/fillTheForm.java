//package pages;
//
//import static org.junit.Assert.assertTrue;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class fillTheForm extends UiTest {
//	
////public fillTheForm(WebDriver driver2) {
////		super(driver2);
////		// TODO Auto-generated constructor stub
////	}
//	
//	public static WebDriver driver;
//
//public static void clickOnSaveBtn() {
//		
//		driver.findElement(By.cssSelector(".btn")).click();
//		
//		
//		}
//
//public static void enterTheform() {
////	Thread.sleep(3000);
//	
//	
//	driver.findElement(By.name("fullName")).sendKeys("Prasad Babu");
////	driver.close();
//	driver.findElement(By.name("country")).sendKeys("United Kingdom");
//      driver.findElement(By.name("yob")).sendKeys("01101980");
//      driver.findElement(By.name("position")).sendKeys("Politician");
//      driver.findElement(By.name("url")).sendKeys("www.google.com");
////      return;
//     
//      }
//
//
//public static void selectRiskValue() {
//	
//	Select dropdown = new Select(driver.findElement(By.name("risk")));
//      dropdown.selectByVisibleText("Medium");
////      dropdown.selectByValue("Low");
////      dropdown.selectByIndex(1);
//}
//
//public static void waitForTextToAppear() {
//	
//	String actualString = driver.findElement(By.cssSelector(".modal-body")).getText();
//	assertTrue(actualString.contains("You added John Doe to the list of entities."));
//
////	WebDriverWait wait = new WebDriverWait(driver,30);
////
////	wait.until(ExpectedConditions.textToBePresentInElement(".modal-body", "You added John Doe to the list of entities."));
//
//	}
//
//
//
//}
