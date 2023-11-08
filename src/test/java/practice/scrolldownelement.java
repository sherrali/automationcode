package practice;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scrolldownelement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://amazon.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Welcome\\Desktop\\screenshots\\Amazonpage.jpg");
		
		Thread.sleep(5000);
		File.copy(src , dest);
		

	}

}
