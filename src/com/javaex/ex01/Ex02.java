package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {
	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("S:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("S:\\javaStudy\\file\\byteBufferImg.jpg");

		int data;
		byte[] buffer = new byte[1024];

		System.out.println("복사시작");
		while (true) {
			data = in.read(buffer);
			if ( data == -1 ) {
				System.out.println("복사끝: " + data);
				break;
			}
			out.write(buffer);
		}

		in.close();
		out.close();

	}

}
