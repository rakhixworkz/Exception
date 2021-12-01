package com.xworkz.Exception;

public class EventHandler {
	public EventHandler() {
		System.out.println("Event handler's object");
	}
	public void createEvent() throws Throwable{
		System.out.println("Inside create method");
		Throwable throwable=new Throwable();
		throw throwable;
	}
	

}
