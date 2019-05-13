package com.az.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import com.az.model.jaxb.ValCurs;
import com.az.model.jaxb.Valute;

public class test {
	public static void main(String[] args) {
		
		
		
		try {
			Properties properties= new Properties();
			File file =new File("C:/Users/Taleh/Desktop/Valute.properties");
		boolean bfile=file.createNewFile();
		if (bfile) {
			ValCurs valCurs1=new CurrencyService().getCurencies();
	
		
		for (Valute valute : valCurs1.getValType().get(1).getValute()) {
			properties.setProperty(valute.getName() , valute.getValue() );
			
		}
			OutputStream outputStream=new FileOutputStream(file);

       	properties.store(outputStream, "ela");
		outputStream.close();
		}
			
		} catch (IOException io) {
			io.printStackTrace();
		}
		
	}

}
