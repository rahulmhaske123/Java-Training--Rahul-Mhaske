package com.citibank.main;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

import com.citibank.main.domain.MyFileWriter;
import com.citibank.main.domain.WriteFile;

public class MyFileWriterMain {

	public static void main(String[] args) {
		String fileMessage, path;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Path & File Name With Extension-");
		path = scanner.next();
		scanner.nextLine();
		System.out.println("Enter Message  -");
		fileMessage = scanner.nextLine();
		MyFileWriter myFileWriter = null;
		FileWriter writer = null;
		WriteFile writeFile = null;
		try {
			writer = new FileWriter(path);
		} catch (IOException e) {
			System.out.println("Error While opening file");
		}

		myFileWriter = new MyFileWriter(writer, fileMessage);
		if (myFileWriter.writefile()) {
			System.out.println("Please check output file");
		} else {
			System.out.println("Failed to Write");
		}

	}

}
