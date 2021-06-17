package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {
	public static void main(String[] args) throws IOException {
		// Format is MS949
		// InputStream(FileInputStream) --> InputStreamReader(InputStream) --> BufferedReader(InputStreamReader)

		//		InputStream in = new FileInputStream("S:/javaStudy/file/MS949.txt");
		//		InputStreamReader isr = new InputStreamReader(in, "MS949");
		//		BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("S:/javaStudy/file/MS949.txt"), "MS949"));

		while (true) {
			String line = br.readLine();

			if ( line == null )
				break;

			System.out.println(line);
		}

		br.close();
	}

}
