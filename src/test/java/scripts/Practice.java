package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void sample()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement searchTextfield = driver.findElement(By.id("small-searchterms"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		String name="ganesh";
//		String script="arguments[0].value=arguments[1].toUpperCase();";
//		
//		js.executeScript(script,searchTextfield,name);
		
		
	}

}
