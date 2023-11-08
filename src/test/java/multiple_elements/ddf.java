package multiple_elements;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ddf {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Welcome\\eclipse-workspace\\selenium\\files\\credentials.properties");
		Properties p=new Properties();
		p.load(fis);
	System.out.println(p.getProperty("un"));
		
		
		
	}

}
