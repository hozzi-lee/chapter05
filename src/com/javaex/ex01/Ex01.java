package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[] args) throws IOException {

		// IOStream
		InputStream in = new FileInputStream("S:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("S:\\javaStudy\\file\\byteImg.jpg");

		int data;
		System.out.println("복사시작");
		while (true) {
			data = in.read(); // 1회 스트림값 대입
			if ( data == -1 ) { // 스트림의 마지막 값은 -1 --> -1 이 나오면 끝
				System.out.println("복사끝: " + data);
				break;
			}
			out.write(data); // 1회입력 1회출력 반복
		}

		in.close();
		out.close();

	}

}
