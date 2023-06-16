package com.kh.chap04_assit.part02_Object.run;

import com.kh.chap04_assit.part02_Object.model.dao.ObjectDao;

public class ObjectRun {

	public static void main(String[] args) {
		ObjectDao da = new ObjectDao();
				da.fileSave();
				da.fileRead();
	}

}
