package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {
	public static void main(String[] args) throws IOException {

		// BufferedReader(FileReader)

		//		Reader fr = new FileReader("S:/javaStudy/file/song.txt");
		//		BufferedReader br = new BufferedReader(fr);

		BufferedReader br = new BufferedReader(new FileReader("S:/javaStudy/file/song.txt")); // MS949는 숫자만 읽음(문자 오류) --> Ex03
		while(true) {
			String str = br.readLine(); // 한 줄(Line)씩 읽어온다 --> 줄바꿈 기호 제외
			if ( str == null ) {
				break;
			}
			System.out.println(str);
		}

		br.close();
	}

}
