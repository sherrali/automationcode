package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enablekeyword {
@Test(enabled=false)
public void enable() {
	Reporter.log("this is enabled log",true);
}
@Test
public void result() {
	Reporter.log("this is printable log",true);
}
}
