package in.nit.java.Collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) throws Exception {
		/*
		 * if in our programme any hting will be changes frequently like username,mailid
		 * pwd are not recomended to hardcode in java prog if there any change to
		 * reflect that change recompiation,redeploid appln even sometimes server
		 * restart required which cretes prob tl buisness impact to client to over come
		 * from above problem we use properties here we r using what ever we want to
		 * read any thing then we should read from properties file,if we r change any in
		 * noraml map (map,treemap,hashmap) valueand key anything but in case of
		 * properties key and value should be string
		 */
		
		//=======methods**************
		//setproperty(),getproperty,propertynames()
		//load()-to load properties from properties file into java propeties obj
		//store() -reverse of load()
 
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("E:/prop/abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("venkey");
		System.out.println(s);
		p.getProperty("nag","844");
		FileOutputStream fos=new FileOutputStream("E:/prop/abc.properties");
		p.store(fos, "updated by jk");
	
		
		
		
	}

}
