//package pages;
//
//import static org.junit.Assert.assertTrue;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class UiTest {
//	
//	 public static WebDriver driver;
//	
//	
////	public UiTest(WebDriver driver2) {
////		
////	}
//		
////		String projectPath = System.getProperty("user.dir");
////		
////		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
//
//
//	public static void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://ec2-34-250-139-60.eu-west-1.compute.amazonaws.com");
//		
//		driver.findElement(By.name("fullName")).sendKeys("Prasad Babu");
////		driver.close();
//		driver.findElement(By.name("country")).sendKeys("United Kingdom");
//	      driver.findElement(By.name("yob")).sendKeys("01101980");
//	      driver.findElement(By.name("position")).sendKeys("Politician");
//	      driver.findElement(By.name("url")).sendKeys("www.google.com");
//	      
//	      Select dropdown = new Select(driver.findElement(By.name("risk")));
//	      dropdown.selectByVisibleText("Medium");
////	      dropdown.selectByValue("Low");
////	      driver.findElement(By.cssSelector(".btn")).click();
////	      selectRiskValue();
////	      clickOnSaveBtn();
////		return driver;	
//		
//	}
//	
//
//}
