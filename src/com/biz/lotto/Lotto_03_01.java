package com.biz.lotto;

import java.util.Random;

public class Lotto_03_01 {

	public static void main(String[] args) {

		
		int[] lottoNum = new int[6];
		
		Random rnd = new Random();
		for(int 저장위치 = 0; 저장위치 < lottoNum.length; 저장위치++ ) {
			int intR = rnd.nextInt(45) + 1;
			
			// lotNum배열에 intR과 같은값이 있는지 검사
			int 찾을위치 = 0;
			for(찾을위치 = 0; 찾을위치 < lottoNum.length; 찾을위치++) {
				if(lottoNum[찾을위치] == intR) {
					break;
				}
			}
			// 값을 못찾았다.
			if(찾을위치 >= lottoNum.length) {
				// 생성한 intR을
				// lottoNum[저장위치] 에 대입(저장)해도 된다
				lottoNum[저장위치] = intR;
			// 찾았다
			} else {
				// 번호(intR)를 다시 생성해서
				// lottoNum[저장위치]에 저장을 해야한다.
				저장위치 --;
			}
			
			// lottoNum[저장위치] = intR;
			}
		for(int i = 0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i] +"\t");
		}

	}}
