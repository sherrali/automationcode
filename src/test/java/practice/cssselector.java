package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class cssselector {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub  
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
//		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
//		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
//		xpath by xpathExpression
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains@text(),'Login']")).click();
//		
//		xpath by attribute
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='username']")).clear();

}
}