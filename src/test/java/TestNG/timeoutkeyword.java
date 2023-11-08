package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeoutkeyword {
@Test(timeOut = 8000)
public void tout() {  
	Reporter.log("after completing timeout");
}
}
