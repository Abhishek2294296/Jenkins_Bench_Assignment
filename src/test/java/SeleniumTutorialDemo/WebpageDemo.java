package SeleniumTutorialDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebpageDemo {
	
	@Test
	public void web() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://blazedemo.com/index.php");
		driver.manage().window().maximize();
		
		WebElement departureCity = driver.findElement(By.name("fromPort"));
		departureCity.sendKeys("Boston");
		
		// Find the destination city dropdown list and select a city
		WebElement destinationCity = driver.findElement(By.name("toPort"));
		destinationCity.sendKeys("New York");
		
          // Find the Find Flights button and click it
	    WebElement findFlightsButton = driver.findElement(By.cssSelector("input[value='Find Flights']"));
		findFlightsButton.click();
		
          // Find the Choose This Flight button for the first flight and click it
		WebElement chooseFlightButton = driver.findElement(By.cssSelector("input[value='Choose This Flight']"));
		chooseFlightButton.click();
		
	}

}
