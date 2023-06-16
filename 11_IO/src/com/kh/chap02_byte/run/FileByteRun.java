package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class FileByteRun {

	public static void main(String[] args) {
		FileByteDao dao = new FileByteDao();
//		dao.fileSave();
		
		dao.fileRead();

	}

}
