package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneDB_IOArrayList {
	public static void main(String[] args) throws IOException {

		// 버퍼사용 txt파일 작성 및 생성
		BufferedWriter bw = new BufferedWriter( new FileWriter("S:/javaStudy/file/PhoneDBpractice.txt") );
		// 버퍼사용 리더 작성
		BufferedReader br = new BufferedReader( new FileReader("S:/javaStudy/file/PhoneDBpractice.txt") );

		bw.write("과제,작성,시작");
		bw.newLine();
		bw.write("유재석,010-1111-1111,02-111-111");
		bw.newLine();
		bw.write("이효리,010-2222-2222,02-222-222");
		bw.newLine();
		bw.write("정우성,010-3333-3333,02-333-333");
		bw.newLine();
		bw.write("이정재,010-4444-4444,02-444-444");
		bw.newLine();
		bw.write("이호진,010-4573-1371,02-000-000");
		bw.newLine();
		bw.write("취업하는!,이호진이!,힘내자!");

		bw.close();

		List<Person> pList = new ArrayList<Person>();

		while (true) {
			String line = br.readLine();

			if ( line == null )
				break;

			String[] brArray = line.split(",");
			String name = brArray[0];
			String hp = brArray[1];
			String company = brArray[2];

			Person p = new Person(name, hp, company);
			pList.add(p);
		}

		for ( Person p : pList )
			p.showInfo();

		br.close();

	}

}
