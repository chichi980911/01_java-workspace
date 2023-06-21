package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

//사용자의 요청 처리해주는 클래스 (출력문x)
public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("구구", "이문세"));
		list.add(new Music("팔팔", "박혁거세"));

		
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
			}
		}
		return result;

	}

	public ArrayList<Music> searchMusic(int menu, String keyword) {
		ArrayList<Music> searchList = new ArrayList<>();

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
	}
}