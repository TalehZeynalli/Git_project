package test;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.az.model.Brandcopy;

public class Exercise4 {
    
	   public static void main(String[] args) throws JAXBException, IOException {

		   Brandcopy br=new Brandcopy();
		 
		 
		   File file=new File("C:\\Users\\Taleh\\Desktop\\Taleh.xml");
		  
		   
		   JAXBContext jaxb=JAXBContext.newInstance(Brandcopy.class); 
		   Unmarshaller unMarshaller=jaxb.createUnmarshaller();
		  br= (Brandcopy)unMarshaller.unmarshal(file);
		  System.out.println(br);
}
	   
}	

