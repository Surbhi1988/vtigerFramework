package com.crm.Sdet.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class propertyUtility {
	/*This method is used for fetch data from propertyfile
	 * *author surbhi
	 */
	
    public String getPropertyKeyValue(String key) throws Throwable {
    	
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
    	Properties p=new Properties();
    	p.load(fis);
    	String value = p.getProperty(key);
    	return value;
    }

}
