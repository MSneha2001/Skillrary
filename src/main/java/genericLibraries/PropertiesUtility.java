package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Properties;
/*
 * This class contains reusable methods to perform actions on 
 * properties file
 *@author harish
 */

public class PropertiesUtility {
	
	private Properties property;
	/**
	 * This method is used to initialize Properties file
	 * @param filepath
	 */
	
	public void propertiesInitialization(String filepath) { 
	FileInputStream fis = null;
	try {
		fis=new FileInputStream(filepath);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	property = new Properties();
	try {
		property.load(fis);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
				
	
	

}
	/**
	 * This method is used to read data from Properties file
	 * @param key
	 * @return
	 */
	
	public String fetchproperty(String key) {
		
		return property.getProperty(key);
	}
}