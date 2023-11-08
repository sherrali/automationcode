package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getclass {

	public static void main(String[] args) {
//	System.setProperty("webdriver.edge.driver", "C:\\Users\\Welcome\\Downloads\\edgedriver_win64");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		
	}
}
