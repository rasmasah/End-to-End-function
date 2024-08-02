package app.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getdatafrompropertiesfile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Jeevan.Varaprasatham\\Desktop\\health.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String data=pobj.getProperty(key);
		return data;
	}

}
