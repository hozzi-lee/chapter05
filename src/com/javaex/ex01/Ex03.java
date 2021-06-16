package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws IOException {

		//		InputStream in = new FileInputStream("S:\\javaStudy\\file\\img.jpg");
		//		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedInputStream bin = new BufferedInputStream( new FileInputStream("S:\\javaStudy\\file\\img.jpg") );

		//		OutputStream out = new FileOutputStream("S:\\javaStudy\\file\\bufferImg.jpg");
		//		BufferedOutputStream bout = new BufferedOutputStream(out);
		BufferedOutputStream bout = new BufferedOutputStream( new FileOutputStream("S:\\javaStudy\\file\\bufferImg.jpg") );

		int data;
		System.out.println("복사시작");
		while (true) {
			data = bin.read();
			if ( data == -1 ) {
				System.out.println("복사끝: " + data);
				break;
			}
			bout.write(data);
		}

		bin.close();
		bout.close();

	}

}
