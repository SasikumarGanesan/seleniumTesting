package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import testing.GivingDashboard;

public class PropertiesFile {

	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
	}
	
	public static void readPropertiesFile(){
		;
		try {
			InputStream input = new FileInputStream("C:\\Users\\Sasikumar Ganesan\\Desktop\\code\\testing\\SeleniumTest\\src\\config\\config.properties");
			prop.load(input);
			GivingDashboard.browser = prop.getProperty("browser");
			System.out.println(GivingDashboard.browser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void writePropertiesFile(){
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\Sasikumar Ganesan\\Desktop\\code\\testing\\SeleniumTest\\src\\config\\config.properties");
			prop.setProperty("browser", "firefox");
			prop.setProperty("result", "pass");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
