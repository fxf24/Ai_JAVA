package day9;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File f = new File("src/day9/FileClassTest.java");
		File f = new File(args[0]);
		if(f.exists()) {//존재
			try {
				System.out.println("기준 경로=" + f.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(f.isFile()) {//파일명이냐
				System.out.println("읽기여부 = " + f.canRead());
				System.out.println("쓰기여부 = " + f.canWrite());
				System.out.println("총길이(byte) = " + f.length());
				System.out.println("최종수정시각 = " + f.lastModified());
				//4자리년도 2자리월 2자리일 24시간:2자리분:2자리초
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
				System.out.println("최종수정시각 = " + sdf.format(f.lastModified()));
			}
			else {//디렉토리명이냐
				String[] details= f.list();
				for(String one : details) {
					System.out.println(one);
					File f2 = new File(args[0] +  "/" + one);
					if(f2.isFile()) {
						System.out.println(one + ": file");
					}
					else {
						System.out.println(one + ": dir");
					}
					//이름": file / dir 표시"
					
				}
			}
		}
		else {//미존재
			System.out.println(args[0] + " 이름의 파일이나 디렉토리는 존재하지 않습니다.");
		}

	}

}
