package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priorityclass {
@Test(priority=1)
public void a() {
	Reporter.log("running testcase 1",true);
}
@Test(priority=0)
public void b() {
	Reporter.log("running testcase 2",true);
}
@Test(priority=2)
public void c() {
	Reporter.log("runnig testcase 3",true);
}

}
