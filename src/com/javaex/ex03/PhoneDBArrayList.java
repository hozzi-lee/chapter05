package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneDBArrayList {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("S:/javaStudy/file/PhoneDB.txt"));

		List<Person> strList = new ArrayList<Person>();

		while (true) {
			String line = br.readLine(); // 한 줄씩

			if ( line == null )
				break;

			String[] pInfo = line.split(",");

			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];

			Person p = new Person(name, hp, company);

			strList.add(p);
		}

		/*
		for ( int i = 0; i < strList.size(); i++ ) {
//			System.out.println("이름: " + strList.get(i).getName());
//			System.out.println("핸드폰: " + strList.get(i).getHp());
//			System.out.println("회사: " + strList.get(i).getCompany());
			strList.get(i).showInfo();
			System.out.println();
		}
		 */

		// Enhanced for문
		for ( Person p : strList ) {
			p.showInfo();
		}

		/*
		for ( int i = 0; i < 4; i++ ) {
			String[] strArray = br.readLine().split(",");
			String name = strArray[0];
			String hp = strArray[1];
			String company = strArray[2];
			strList.add(new Person(name, hp, company));
		}

		for ( Person p : strList ) {
			p.showInfo();
		}
		 */
		br.close();

	}

}
