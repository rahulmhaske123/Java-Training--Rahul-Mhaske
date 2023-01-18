package com.citibank.main.domain;

import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {
	private Writer filewriter;
	private String data;
	public MyFileWriter(Writer filewriter, String data) {
		super();
		this.filewriter = filewriter;
		this.data = data;
	}
	
	public boolean writefile() {
		try {
			filewriter.write(data);
			return true;
		} catch (IOException e) {
			System.out.println("Error While writing Data");
			return false;
		}finally {
			try {
				filewriter.close();
			} catch (Exception e2) {
				System.out.println("Error While Closing File");
			}
		}
	
		
	}
}
