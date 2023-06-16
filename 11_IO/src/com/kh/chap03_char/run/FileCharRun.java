package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class FileCharRun {

	public static void main(String[] args) {
		FileCharDao da = new FileCharDao();
//		da.fileSave();
		
		da.fileRead();
	}

}
