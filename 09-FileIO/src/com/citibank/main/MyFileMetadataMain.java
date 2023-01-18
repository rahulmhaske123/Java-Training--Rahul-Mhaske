package com.citibank.main;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.ReadMyfile;

public class MyFileMetadataMain {

	public static void main(String[] args) {
//		MyFileMetadata fileMetadata = new MyFileMetadata();
//		fileMetadata.printFileMetadata();
//		fileMetadata.printFileMetadata();
		
		ReadMyfile readmyfile = new ReadMyfile();
		
		readmyfile.ReadFile();

	}

}
