package com.xworkz.Exception;

public class EventTester {

	public static void main(String[] args) throws Throwable {
		EventHandler eventHandler=new EventHandler();
		eventHandler.createEvent();
		Event event=new Event();
		event.createEvent(true);
		
	}

}
