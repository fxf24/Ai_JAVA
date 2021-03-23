package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket s = new Socket("172.30.1.9",9999);
			System.out.println("서버와의 연결중");
			//서버로 hello server 문자열 전송 = 클라이언트 출력
			//Input...Reader...
			OutputStream o = s.getOutputStream();
			String data = "hello server";
			//String --> byte[] 변경
			byte[] data_byte = data.getBytes();
			o.write(data_byte);
			
			InputStream i = s.getInputStream();
			
//			방법1 byte [] b = new byte[100];
//			i.read(b);
//			String input_b = new String(b);
			//방법2
			Scanner sc = new Scanner(i);
			String input_b = sc.nextLine();
			System.out.println("서버가 클라이언트로 전송한 데이터=" + input_b);
			
			s.close();
			System.out.println("서버와의 연결종료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
