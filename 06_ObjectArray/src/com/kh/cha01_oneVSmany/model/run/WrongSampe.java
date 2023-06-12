package com.kh.cha01_oneVSmany.model.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSampe {
	public static void main(String[] args) {
	
		Phone[] arr = new Phone[3];
		
//		arr[0] = new Phone();
//		arr[1] = new Phone();
//		arr[2] = new Phone();
		
		for(int i =0; i <= arr.length; i ++) {
			System.out.println(arr[i]);
			//1.nullpointException
			//객체를 생성하지 않고 배열만 생성하면 위와 같은 에러가 난다.
			//배열생성시 arr[i]에는 null값이 들어가 있기 떄문에 null.의 값은 없어서 나는 에러이다.
			//**조치방법 => 객체배열 생성후 각 인덱스별로 객체 생성을 진행해야한다.
			
			
			//2.ArrayIndexOutOfBoundsException
			//배열의 길이와 조건식의 arr.length 값의 인덱스 범위를 벗어나있기 때문에 
			//<= 가 아닌 < 로 변경해야한다.
			
			
		}
	}
}
