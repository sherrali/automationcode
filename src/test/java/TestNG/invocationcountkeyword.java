package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcountkeyword {
@Test(invocationCount = 10)
public void a() {
	Reporter.log("running tc ",true);
  }

}
