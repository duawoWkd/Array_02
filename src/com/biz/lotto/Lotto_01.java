package com.biz.lotto;

import java.util.Random;

public class Lotto_01 {

	public static void main(String[] args) {

		// 6개의 정수형 배열을 선언및초기화(생성)하고\
		// 1부터 45까지의 임의의 정수를 1개씩 배열에 채우시오
		
		int[] intNum = new int[6];
		
		Random rnd = new Random();
		
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = rnd.nextInt(45)+1;
			System.out.print(intNum[i] +"\t");
			}
		
		// 또다른 임의숫자 (1부터 45)를 하나 생성해서
		// num배열에 담겨 있는지 검사
		// 있으면 있다
		// 없으면 없다라고 표시
		
		int intR= rnd.nextInt(45)+1;
		int index;
		for(index = 0; index < intNum.length; index++ ) {
			if(intNum[index]== intR) {
				break;
			}
		}
		if(index >= intNum.length) {                     // break를 만나면 절대 참이 될수 없다.
			System.out.println(("값이 없음"));
		}else {
			System.out.println("값이 있음");
		}
		
	}

}
