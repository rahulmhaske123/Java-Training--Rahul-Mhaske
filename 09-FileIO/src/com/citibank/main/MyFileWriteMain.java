package com.citibank.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.WriteFile;

public class MyFileWriteMain {

	public static void main(String[] args) {
		String fileMessage,path;
		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter Path & File Name With Extension-");
		path = scanner.next();
		scanner.nextLine();
//		File filpath= new File(path);
		System.out.println("Enter Message  -");
		fileMessage = scanner.nextLine();
		OutputStream outputStream = null;
		WriteFile writefile = null;
		try {
			outputStream = new FileOutputStream(path,true);
//			outputStream = new FileOutputStream(filpath);
			writefile = new WriteFile(outputStream, fileMessage);
			if (writefile.wrtieFile()) {
				System.out.println("Please check output file");
			} else {
				System.out.println("Failed to Write");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Unable to Write file");
		} finally {
			try {
				outputStream.close();
				scanner.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		

	}

}
