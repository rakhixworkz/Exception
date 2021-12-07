package com.xworkz.Helmet.dao;
import com.xworkz.Helmet.dto.HelmetDto;
import com.xworkz.Helmet.dao.HelmetDao;
public class HelmetDaoImpl implements HelmetDao{

	@Override
	public void save(HelmetDto dto) {
		System.out.println("Inside save method");
		helmets[index]=dto;
		
	}

	@Override
	public void display() {
		System.out.println("Inside display method");
		for(int i=0;i<index;i++) {
			System.out.println(helmets[i].getBrand);
			System.out.println(helmets[i].getPrice);
			System.out.println(helmets[i].getColor);
			System.out.println(helmets[i].getWeight);
		}
	}

}
