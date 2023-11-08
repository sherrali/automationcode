package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollbar {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://amazon.com");
		
//		typecast it
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,3000);");
		Thread.sleep(5000);
		
		jse.executeScript("window.scrollBy(0,-1000);");

	}

}
