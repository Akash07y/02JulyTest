package pack123;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement e1 =  driver.findElement( By.xpath("//input[@id='email']") ) ; // 30 sec
		WebElement e2 =  driver.findElement( By.xpath("//input[@id='pass']") ) ; // 30
		WebElement e3 =  driver.findElement( By.xpath("//button[text()='Log In']") ) ;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		WebElement e4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='eml']")));	

		
		e3.click();
		// Fluent wait -> Waiting Time + Consition + Frequency 
		
		// 4.0.0
		Wait<WebDriver> fWait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(20))   // Maximum Waiting time -> 20 Sec
								.pollingEvery(Duration.ofMillis(200))   // Frequncy  -> 200 miliSec intervals 
								.ignoring(NoSuchElementException.class);// Condition 
		
		WebElement ele = fWait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				
				return driver.findElement(By.xpath("//button[text()='Log In']"));
			}
			
		});
		
		
		// findElelemnts 
		// How to find the all broken links 
		// Tagname -> a      xpath -> "//a"     tagname -> "a"
		// Attribute -> href 
		
		// How to find the all broken images 
		// Tagname -> img      xpath -> "//img"     tagname -> "img"
		// Attribute -> src 
				
		String value  = "";
		value = null ;
		if(value.equals("") || value.equals(null))
		{
			System.out.println("Link is broek");
		}
		else
		{
			System.out.println("links is verified ");
		}
		
		
		
		
		
		
		
	
//		List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//tr[2]//td"));
//		
//		for(int i = 0 ; i < cells.size() ; i++)
//		{
//			System.out.println(cells.get(i).getText());
//		}	
			
			
//		Alfreds Futterkiste,	Maria Anders,	Germany
//		Centro comercial Moctezuma,	Francisco Chang,	Mexico
//		Ernst Handel,	Roland Mendel,	Austria
			
			
			
			
			
			

//			WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
//			
//			Actions action = new Actions(driver);
//			
//			//holds the SHIFT key and converts the text to uppercase
//			action..build().perform();
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		//submit.click();
//		Thread.sleep(3000);
//		
//		// Handling of Alert Popup 
//		
//		Alert alt = driver.switchTo().alert();
//		
//		alt.accept() ;
//		
//		Thread.sleep(3000);
//		//alt = driver.switchTo().alert();
//		
//		alt.accept();
//		
		
		
		
		// How to fetch the data from excel sheet    // parameterization 
		
//		String path = "C:\\Users\\akash\\OneDrive\\Desktop\\Test.xlsx";
//		FileInputStream file = new FileInputStream(path);
//		
//		Date value = WorkbookFactory.create(file).getSheet("Velocity").getRow(5).getCell(1).getDateCellValue();
//		
//		System.out.println(value);

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
//	
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/");
		
//			TakesScreenshot take = (TakesScreenshot)driver ;
//
//			File src = take.getScreenshotAs(OutputType.FILE);
//		
//			File dest = new File("C:\\Users\\akash\\OneDrive\\Documents\\Test\\Test"+i+".jpeg");
//		

//		
//		act.click() ; // Left Click
//		act.doubleClick() ; // Left double click
//		act.contextClick() ; // Right Click
//		act.moveToElement(creatNewAcc); // MOve to target webelement 
//		act.dragAndDrop(source, target) ; // drag source element and drop on target element
//		act.build(); // to combine 2 or more mouse action in same line
//		act.perform(); // to execute mouse action on the browser
//			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(5000);
//		
		// How to handle the drop down or list box
		// 1. Create a WebElement 
//		
//		WebElement month =  driver.findElement( By.xpath("//select[@id='month']") ) ;
//		
//		// 2. Create a object of Select class and pass above WebElement as argument
//		
//		Select s = new Select(month);
//		
//		// 3. By using methods of select class select the value
//		s.selectByIndex(6);   // tagname -> Option   Index - 0,1,2,3.....
//		s.selectByValue("11");  // attribute -> Value
//		s.selectByVisibleText("Mar"); // html text 
		
		// custoize drop down /list box
		
		// drop down without select tagname (any other tagname)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// to get the attribute value of elelemnt
//		
//		// String attribueValue = ele.getAttribute("attribute Name");
//		
//		String attributeValue = useName.getTagName();
//		
//		System.out.println(attributeValue);
//		
//		if(attributeValue.equals("Email or Phone Number")) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		
//		// Used for hidden element 
//		// to verify WebElement is displayed or not.
//		// true -> Element displayed
//		// false -> Element not displayed
//		boolean result = pronoum.isDisplayed();
//		
//		System.out.println(result);
//		
//		if(result == true) {
//			System.out.println("PASS");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
//	
		
		
//		useName.sendKeys("Velocity@gmail.com");
//		
//		Thread.sleep(5000);
//		
//		WebElement password =  driver.findElement( By.xpath("//input[@id='pass']") ) ;
//		password.sendKeys("12234");
//		
//		WebElement loginButton =  driver.findElement( By.xpath("//button[text()='Log In']") ) ;
//		loginButton.click();
//		
//		Thread.sleep(3000);
		
		
		
		
		
	}
}
