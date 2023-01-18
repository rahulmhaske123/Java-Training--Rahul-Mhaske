package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;
import com.citibank.main.domain.ReadMyfile;

public class ReadMyfileMain {

	public static void main(String[] args) {
		String fileMessage, path, datafromclass;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Path for file to Read-");
		path = scanner.next();
		File file = new File(path);
		FileReader reader = null;
		MyFileReader myFileReader = null;
		BufferedReader bufferedReader = null;
		try {
			reader = new FileReader(file);
			bufferedReader = new BufferedReader(reader);
			
			myFileReader = new MyFileReader(bufferedReader);
			
			String data = myFileReader.readFilelinebyline();
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		
		
		
//		try {
//			reader = new FileReader(file);
//			myFileReader = new MyFileReader(file, reader);
//			datafromclass = myFileReader.readFile();
//			if (datafromclass.equals("")) {
//				System.out.println("No Data in File");
//			} else {
//				System.out.println(datafromclass);
//			}
//
//		} catch (FileNotFoundException e) {
//			System.out.println("Error While Reading The File");
//			e.printStackTrace();
//		} finally {
//			scanner.close();
//		}

	}

}
