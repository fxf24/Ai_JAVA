package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(9999);
			System.out.println("====서버 시작 대기중====");
			while(true) {
				Socket s = ss.accept();
				System.out.println("클라이언트와 연결중");
				InputStream i = s.getInputStream();
				byte [] b = new byte[100];
				i.read(b);
				String input_b = new String(b);
				System.out.println("클라이언트가 서버로 전송한 데이터=" + input_b);
				
				//클라이언트로 hello client 문자열 전송 = 서버가 출력
				OutputStream o = s.getOutputStream();
				String data = "hello client";
				
				//String --> byte[] 변경
				byte[] data_byte = data.getBytes();
				o.write(data_byte);
				
				s.close();
				System.out.println("클라이언트와 연결종료");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
