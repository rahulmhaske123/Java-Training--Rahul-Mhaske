package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadMyfile {
	private String path = "c:/JavaTraining/test.txt";
	private InputStream inputStream;
	private byte [] data;
	private int arrayLen;
	
	
	
	
	public void ReadFile() {
		try {
			File file = new File(path);
			arrayLen = (int)file.length();
			data = new byte[arrayLen];
			inputStream = new FileInputStream(path);
			inputStream.read(data);
			for (byte b : data) {
				System.out.print((char)b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error in Reading File");
//			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Failed to close File");
			}
		}
		
	}
}
