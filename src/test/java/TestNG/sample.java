package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.j2objc.annotations.Property;

public class sample {
@Test(priority = 2)
public void m1() {

	System.out.println("i am getting with out main method");
//	Assert.fail();
}
@Test(invocationCount = 10)
public void m2() {
//	System.out.println(" i can also printable");
	Reporter.log("Hiii I am TestNG");
}
public void m3() {
	System.out.println("i am getting with out main method");
//	Assert.fail();
}
}

