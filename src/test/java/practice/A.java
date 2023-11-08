package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class A {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
//		driver.get("https://demo.actitime.com/login.do");
//		driver.get("https://demo.acttime.com/login.do");
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("w3schools.com");
		
//		WebElement un =  driver.findElement(By.xpath("(//input)[3]"));
//		WebElement un = driver.findElement(By.xpath("//input)[3]"));
//		un.sendKeys("admin");
//		WebElement pw = driver.findElement(By.xpath("(//input)[4]"));
//		pw.sendKeys("manager");
//		
//		Thread.sleep(5000);
//		
//		un.clear();
//		pw.clear();
//		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
	}

}
