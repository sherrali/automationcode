package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class findmultipleelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
//		variable
		int count = 0;
		driver.get("https://www.facebook.com");
//		take multiple elements
 	  List<WebElement> ele = driver.findElements(By.xpath("//div"));
 	  for(WebElement i:ele) {
 		  String res = i.getText();
 		System.out.println(res);
 		count++;
 		
 	  }
 	  System.out.println(count);

	}

}
