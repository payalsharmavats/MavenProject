package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	//FileInputStream fis;

	public static String getConfigProp(String propName) {
		FileInputStream fis = null;
		//step1:get the prop file path
		String propFilePath = System.getProperty("user.dir") + "\\config\\config.properties";
		try {
			fis = new FileInputStream(propFilePath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		//step2:
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
		//read the properties
		String propVal=prop.getProperty(propName);
		return propVal;
	}
	
	

}
