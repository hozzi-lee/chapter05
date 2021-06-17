package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneDB {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("S:/javaStudy/file/PhoneDB.txt"));

		while (true) {
			String line = br.readLine(); // 한 줄씩

			if ( line == null )
				break;

			String[] pInfo = line.split(",");

			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];

			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println();

			//			System.out.println(line);
		}

		br.close();

	}

}
