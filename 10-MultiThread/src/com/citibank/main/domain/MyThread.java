package com.citibank.main.domain;

public class MyThread implements Runnable {
	private Resource resource;
	private String Textmessage;
	
	
	public MyThread(Resource resource, String Textmessage) {
		super();
		this.resource = resource;
		this.Textmessage = Textmessage;
	}


	@Override
	public void run() {
		resource.message(Textmessage);
		
	}
	

}
