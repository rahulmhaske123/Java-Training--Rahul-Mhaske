package com.citibank.main.domain;

import java.io.File;
import java.util.Date;

public class MyFileMetadata {
	private String path = "c:/JavaTraining/test.txt";
	
	public void printFileMetadata() {
		File file = new File(path);
		if (file.exists()){
			System.out.println("File Name-" + file.getName());
			System.out.println("File Path-" + file.getAbsolutePath());
			System.out.println("File Size-" + file.length());
			System.out.println("File Open-" + file.canExecute());
			System.out.println("File Write-" + file.canWrite());
			System.out.println("File Read-" + file.canRead());
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("Last Modify-" + lastModifiedDate);
		}else {
			System.out.println("File Doesn't Exist");
		}
	}

}
