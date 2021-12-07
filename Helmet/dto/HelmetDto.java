package com.xworkz.Helmet.dto;

public class HelmetDto {
	private String brand;
	private int price;
	private String color;
	private float weight;
	public HelmetDto(String brand, int price, String color, float weight) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.weight = weight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	

}
