package day9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//명령행 매개변수 입력
		//a.txt b.txt -> a.txt 입력파일 존재x --> 오류발생 중단
		//src/FileCopyTest.java b.txt -> b.txt 출력파일 존재x --> b.txt 생성-출력
		//src/FileClassTest.java b.txt -> b.txt 출력파일 존재o --> 기존내용삭제-출력
		//src/FileClassTest.java b.txt -> b.txt 출력파일 존재o append --> 기존내용유지-추가출력
		FileReader fi = null;
		FileWriter fo = null;
		
		try {
			fi = new FileReader(args[0]);
//			File f = new File(args[0]);
//			if(f.exists()) {
//				FileInputStream fi = new FileInputStream(f);
//			}
			fo = new FileWriter(args[1], true);
			while(true) {
				int result = fi.read();//1바이트
				
				if(result ==-1) {break;}
				fo.write(result);
			}
//			fi.close();
			/* 입력파일명 a.txt 가정
			 * 자바 - 입력 수행중-종료
			 * 탐색기 - 파일명 변경 가능
			 * */
//			fo.close();
			/* FileOutputStream / FileWriter
			 * write() ---> 메모리버퍼 임시 저장 (취소 가능) --> close() ---> 파일 최종 저장
			 * */
		} catch (IOException e) {//원인 출력
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fi.close();
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
