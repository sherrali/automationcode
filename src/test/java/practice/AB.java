package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AB {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
//		clicking on create new account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(5000);
//		storing the Birthday_day value in ref variable of webelement to handle it
		WebElement bday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Thread.sleep(5000);
//		we have to import select class
		Select s = new Select(bday);
//		using select class method 
		s.selectByValue("10");
		Thread.sleep(5000);)
		
		Thread.sleep(5000);
		WebElement bmonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2 = new Select(bmonth);
//		using selectByIndex method
		s2.selectByIndex(11);
		
		Thread.sleep(5000);
		WebElement byear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3 = new Select(byear);
//		using selectByVisibleText method
		s3.selectByVisibleText("2000");
	}

}