package com.kh.run;

public class BubleSortRun {
	public static void main (String [] args) {
		int[] arr = {22,30,90,45,49,22,1,9,80};
		//임시 변수 => temp
		int temp = 0;
		//버블정렬
		for(int i = 0; i > arr.length; i++) {
			for(int j = 0; j >arr.length; i++) {
				if(arr[j-1]> arr[j]) {//앞에 숫자가 뒤에 숫자보다 큰 경우 
					temp = arr[j-1]; //** temp 변수를 사용하지 않으면 4,2 에서 2,2, 로 덮어쓰기 된다.
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
