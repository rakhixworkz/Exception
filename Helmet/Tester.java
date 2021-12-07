package com.xworkz.Helmet;
import com.xworkz.Helmet.dto.HelmetDto;
import com.xworkz.Helmet.service.HelmetServiceImpl;
import com.xworkz.Helmet.service.Helmetservice;
import com.xworkz.Helmet.Exception.InvalidBrand;
public class Tester {

	public static void main(String[] args) throws InvalidBrand{
		System.out.println("start");
		HelmetDto helmetDto=new HelmetDto("S",12,"red",(float) 12.5);
		Helmetservice helmetservice=new HelmetServiceImpl();
		helmetservice.validateSave(helmetDto);
		System.out.println("End of program");
		
	}

}
