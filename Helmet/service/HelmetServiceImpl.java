package com.xworkz.Helmet.service;

import com.xworkz.Helmet.Exception.InvalidBrand;
import com.xworkz.Helmet.dto.HelmetDto;

public class HelmetServiceImpl implements Helmetservice {
	boolean status=true;
	public HelmetServiceImpl() {
		System.out.println("Inside the helmet service class");
	}

	@Override
	public void validateSave(HelmetDto dto) throws InvalidBrand{
		if(dto.getBrand()==null||dto.getBrand().length()<2) {
			InvalidBrand invalidBrand=new InvalidBrand("Invalid brand");
			throw invalidBrand;
		}
		
	}

}
