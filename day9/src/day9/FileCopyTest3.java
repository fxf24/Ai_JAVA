package day9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyTest3 {

	public static void main(String[] args) {
		FileReader fi = null;
		FileWriter fo = null;
		Scanner sc = null;
		try {
			// 라인번호 : 왼쪽 라인 시작 추가
			fi = new FileReader("src/day9/FileCopyTest3.java");
			fo = new FileWriter("linecopy.txt");
			sc = new Scanner(fi);
			
			int linenum = 1;
			
			while(sc.hasNextLine()) {
				String line = sc.nextLine();//\n 이전 문자까지 입력
				fo.write(linenum++ + ": " + line + "\n");
			}
			
		} catch (IOException e) {//원인 출력
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fi.close();
				fo.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
