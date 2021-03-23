package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer_Data {

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
				DataInputStream ds = new DataInputStream(i);
				String input_b = ds.readUTF();
				
				System.out.println("클라이언트가 서버로 전송한 데이터=" + input_b);
				
				//클라이언트로 hello client 문자열 전송 = 서버가 출력
				OutputStream o = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(o);
				String data = "hello client";
				dos.writeUTF(data);
				
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
