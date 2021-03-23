package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MemberClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("172.30.1.9",9999);
			System.out.println("서버와의 연결중");
			//서버로 hello server 문자열 전송 = 클라이언트 출력
			//Input...Reader...
			OutputStream o = s.getOutputStream();
			DataOutputStream ds = new DataOutputStream(o);
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 암호: ");
			String data = sc.nextLine();
			ds.writeUTF(data);
			
			//클라이언트가 서버로부터 입력받음
			InputStream i = s.getInputStream();
			DataInputStream dis = new DataInputStream(i);
			String input_b = dis.readUTF();

			System.out.println("서버가 클라이언트로 전송한 데이터=" + input_b);
			
			s.close();
			sc.close();
			System.out.println("서버와의 연결종료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
