package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

//사용자의 요청 처리해주는 클래스 (출력문x)
public class MusicController {
	private ArrayList<Music> list = new ArrayList<>(); // []
	{
		// 초기화 블럭

		list.add(new Music("dangerous", "puth")); // Music [dangerous - puth]
		list.add(new Music("call", "me"));
		list.add(new Music("dandan", "yosi"));
		
		
//		
	}

	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}

	public ArrayList<Music> selectMusic() {
		return list;

	}

	public int deleteMusic(String title) {

		int result = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}

	public ArrayList<Music> searchMusic(String keyword) {

		ArrayList<Music> searchList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
				// serachList가 비어있을 수도 담겨 있을 수도 있는상태
			}

		}
		return searchList;
	}

	public ArrayList<Music> searchMusic(int menu, String keyword) {
		ArrayList<Music> searchList = new ArrayList<>();

//		switch(menu) {
//		case 1: for(int i = 0; i<list.size(); i++) {
//			if(list.get(i).getTitle().contains(keyword)) {
//			searchList.add(list.get(i));
//			}
//		}
//		case 2:for(int i = 0; i<list.size(); i++) {
//			if(list.get(i).getArtist().contains(keyword)) {
//			searchList.add(list.get(i));
//			}
//		}
//		}return searchList;

		if (menu == 1) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}

			}
		}
		return searchList;

//		

//		for(int i = 0; i<searchList.size();i++) {
//			if(list.get(i).getTitle().contains(keyword)||list.get(i).getArtist().contains(keyword)) {
//				searchList.add(list.get(i));
//			}
//		}

	}
	public int updateMusic(String title , String upArtist,String upTitle) {
		
		ArrayList<Music> upList = new ArrayList<>();
		
		int result = 0;
		for(int i = 0 ; i<list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setTitle(upTitle);
				m.setArtist(upArtist);
				result = 1;
				break;
			}
		}
		return result;
		
		
		
		
		
	}
}