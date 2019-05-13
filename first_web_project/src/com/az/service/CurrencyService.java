package com.az.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.az.model.jaxb.ValCurs;
import com.az.model.jaxb.Valute;



public class CurrencyService   {
	
	

	public ValCurs getCurencies()  {
		
	URL url=null;
	ValCurs valCurs = null;
	try {
		Properties properties= new Properties();
//		InputStream propIS= new FileInputStream("src/com/az/utilities/dictionary.properties");
		InputStream propIS= CurrencyService.class.getClassLoader().getResourceAsStream("/com/az/utilities/dictionary.properties");
		properties.load(propIS);
		String currencyURL=properties.getProperty("currency-url");
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd.MM.yyy");
		String today=simpleDateFormat.format(new Date());
		
		currencyURL=currencyURL.replace("{Today}", today);
		
		url = new URL(currencyURL);
		
	   URLConnection con=url.openConnection();
	   InputStream is=con.getInputStream();
	   JAXBContext jaxbContext= JAXBContext.newInstance(ValCurs.class);	
	   Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
	 valCurs=(ValCurs) unmarshaller.unmarshal(is);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return valCurs;

	
	}

	public static void main(String[] args) {
		
		
		
		try {File file =new File("C:/Users/Taleh/Desktop/Valute.properties");
		boolean bfile=file.createNewFile();
		if (bfile) {
			ValCurs valCurs1=new CurrencyService().getCurencies();
		OutputStream outputStream=new FileOutputStream(file);
		Properties properties= new Properties();
		for (Valute valute : valCurs1.getValType().get(1).getValute()) {
			properties.setProperty(valute.getName() , valute.getValue() );
			
		}
		
//		properties.setProperty("key", "value");
//		properties.store(outputStream, "ela");
		outputStream.close();
		}
			
		} catch (IOException io) {
			io.printStackTrace();
		}
		
	}

}
