package io;

import java.io.IOException;
import java.io.InputStream;

public class SysteminTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("키보드 입력을 시작하세요");
		//키보드 입력 종료(CTRL + z)될 때까지 입력 : -1
//		try {
//			while(true) {
//				int result = System.in.read();
//				System.out.println((char)result);
//				if(result == -1) {break;} //13:엔터키
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			while(true) {
				InputStream is = System.in;
				byte b[] = new byte[100];
				
				int result = is.read(b); //키보드로 1바이트 입력 b 배열 저장. cnt 입력 갯수
				String inputString = new String(b, 0, b.length);
				
				System.out.println(inputString);
				if(result == -1) {break;} //13:엔터키
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
//한글 입력 - 2바이트