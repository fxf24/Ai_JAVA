package day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//명령행 매개변수 입력
		//a.txt b.txt -> a.txt 입력파일 존재x --> 오류발생 중단
		//src/FileCopyTest.java b.txt -> b.txt 출력파일 존재x --> b.txt 생성-출력
		//src/FileClassTest.java b.txt -> b.txt 출력파일 존재o --> 기존내용삭제-출력
		//src/FileClassTest.java b.txt -> b.txt 출력파일 존재o append --> 기존내용유지-추가출력
		try {
			FileInputStream fi = new FileInputStream(args[0]);
//			File f = new File(args[0]);
//			if(f.exists()) {
//				FileInputStream fi = new FileInputStream(f);
//			}
			FileOutputStream fo = new FileOutputStream(args[1], true);
			while(true) {
				int result = fi.read();//1바이트
				
				if(result ==-1) {break;}
				fo.write(result);
			}
			fi.close();
			fo.close();
		} catch (IOException e) {//원인 출력
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
