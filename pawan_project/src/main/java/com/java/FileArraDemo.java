package com.java;

import java.io.File;
import java.util.ArrayList;

public class FileArraDemo {
	public static void main(String [] ars){
		File s=new File("ABC");
		ArrayList<File> FileList=new ArrayList<File>();
		FileList.add(s);
		File[] tempDir =  FileList.toArray(new File[FileList.size()]);
		System.out.print("file is " +tempDir);
	}

}
