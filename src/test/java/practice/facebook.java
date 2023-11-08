package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new EdgeDriver();
driver.get("https://www.facebook.com");
Thread.sleep(2000);
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
Thread.sleep(2000);
WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//creating object of actions class
Actions act = new Actions(driver);
Thread.sleep(2000);
act.moveToElement(month).click().perform();
Thread.sleep(2000);
act.sendKeys(Keys.ARROW_DOWN).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ENTER).perform();



	}

}
