package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class iframes {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
//				switching to desired frame
				driver.switchTo().frame("iframeResult");
//				enter first name
				driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("mastan");
			}

		}
