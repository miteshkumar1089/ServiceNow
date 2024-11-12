package TestNGAnnotations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandler {
	
	public String readFromPropertiesFile(String key) throws IOException {
		
		FileInputStream fs= new FileInputStream("src\\test\\resources\\env.properties");
		Properties props=new Properties();
		props.load(fs);
		return props.getProperty(key);
		
		
	}
	

}
