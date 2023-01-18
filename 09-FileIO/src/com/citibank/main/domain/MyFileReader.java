package com.citibank.main.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class MyFileReader {
	private File file;
	private char [] data; 
	private int length;
	private Reader reader;
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	
	public MyFileReader(File file, Reader reader) {
		super();
		this.file = file;
		this.reader = reader;
	}
	
	public MyFileReader(BufferedReader bufferedReader ) {
		super();
		this.bufferedReader = bufferedReader;
	}
	
	public String readFilelinebyline() {
		String filedata = "";
		try {
			String temp = bufferedReader.readLine();
			do {
				filedata = filedata + temp + "\n";
				temp = bufferedReader.readLine();
			} while (temp != null);
			return filedata;
		} catch (IOException e) {
			System.out.println("Error While Reading");
			return "";
		} finally {
			try {
				bufferedReader.close();
			} catch (Exception e2) {
				System.out.println();
			}
		}

	}
	
	public String readFile() {
		try {
			length = (int)file.length();
			data = new char[length];
			reader.read(data);
			String datafromfile = new String(data);
			return datafromfile;
		} catch (IOException e) {
			System.out.println("Error to Read File");
			return "";
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println("Error While Closing File");

			}
		}
	}
	
	
}
