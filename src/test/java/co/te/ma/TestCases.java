package co.te.ma;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.core.BaseClass;
import com.core.WebDriverTest;

public class TestCases extends WebDriverTest {

	BaseClass bs = new BaseClass();
	WebDriver driver = bs.setup();


    //@Test
	public void TestOne() { 
    	WebElement searchInput =    
			driver.findElement(By.id("search-input"));
		Assert.assertTrue(searchInput.isDisplayed());
	//searchInput.sendKeys("Hi");

	WebElement searchButton = driver.findElement(By.id("search-button"));
	Assert.assertTrue(searchButton.isDisplayed());
		//	searchButton.click(); }
    }
    
    
    //@Test  
	public void TestTwo() { 
    	WebElement searchInput =    
			driver.findElement(By.id("search-input"));		
	 searchInput.sendKeys("");

	WebElement searchButton = driver.findElement(By.id("search-button"));
	searchButton.click();
	
	WebElement results = driver.findElement(By.xpath("//ul[@id='search-results']//div[@id='error-empty-query']"));
	String expectedText = "Provide some query";
	String emptyText =	results.getText();
    Assert.assertEquals(expectedText, emptyText);
	}
    
    @Test  
   	public void TestThree() { 
       	WebElement searchInput =    
   			driver.findElement(By.id("search-input"));		
   	 searchInput.sendKeys("isla");

   	WebElement searchButton = driver.findElement(By.id("search-button"));
   	searchButton.click();
   	
   	List<WebElement> results = driver.findElements(By.xpath("//ul[@id='search-results']/li"));
   	System.out.println("Length is "+results.size());
    for(int i=0; i<results.size(); i++)
    {
    	String temp;
    	temp = results.get(i).getText();
    	System.out.println("Islands are "+temp);
    }
   	
   	
//   	String emptyText =	results.getText();
//       Assert.assertEquals(expectedText, emptyText);
  	}
    
    
    //@Test  
  	public void TestFour() { 
      	WebElement searchInput =    
  			driver.findElement(By.id("search-input"));		
  	 searchInput.sendKeys("castle");

  	WebElement searchButton = driver.findElement(By.id("search-button"));
  	searchButton.click();
  	
  	WebElement results = driver.findElement(By.xpath("//ul[@id='search-results']//div[@id='error-no-results']"));
  	String expectedText = "No results";
  	String emptyText =	results.getText();
      Assert.assertEquals(expectedText, emptyText);
  	}
    
    }








