package com.citibank.main.domain;


import java.io.IOException;
import java.io.OutputStream;

public class WriteFile {
	private OutputStream outputStream;
	private String outMessage;
	
	public WriteFile(OutputStream outputStream, String outMessage) {
		super();
		this.outputStream = outputStream;
		this.outMessage = outMessage;
	}
	
	public boolean wrtieFile() {
		try {
			byte [] data = outMessage.getBytes();
			outputStream.write(data);
//			outputStream.write(outMessage.getBytes());
			return true;
		} catch (IOException e) {
			System.out.println("Error While Writing File");
			return true;
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				System.out.println("Error While Closing");
			}
			
		}
		
	}
	
	
	

}
