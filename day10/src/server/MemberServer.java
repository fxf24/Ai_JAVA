package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MemberServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket ss = null;
		String ids [] = {"java", "jsp", "spring"};
		try {
			ss = new ServerSocket(9999);
			
			while(true) {
				System.out.println("서버대기중");
				Socket s = ss.accept();
				
				InputStream is = s.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				String idpw = dis.readUTF();
				
				String[] inform = idpw.split(" ");
				String id = inform[0];
				String pw = inform[1];
				
				boolean flag = false;
				for(String same : ids) {
					if(same.equals(id)) {
						flag = true;
					}
				}
				
				
				OutputStream o = s.getOutputStream();
				DataOutputStream dos = new DataOutputStream(o);
				if(flag) {
					dos.writeUTF("다른 아이디를 사용하세요");
					System.out.println("사용불가");
				}
				else {
					dos.writeUTF(id + "는 사용 가능합니다.");
					System.out.println("사용가능");
				}
				s.close();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("서버 종료");
	}

}
