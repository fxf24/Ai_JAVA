package net;

import java.net.InetAddress;

public class IPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//3자리.3자리.3자리.3자리
			//0-255.0-255...
			//256*256*256*256
			InetAddress myip = InetAddress.getLocalHost();
			System.out.println(myip.getHostAddress());
			
			//www.google.com 서버 접속 - ip:port 없다
			//인터넷 메이저 사이트들 - 서버이름 = domain
			//인터넷관리기구 이름 제시 등록
			//구글 서버 - 멀티캠퍼스 네트워크
			//구글 서버 - kt
			InetAddress[] ips = InetAddress.getAllByName("www.multicampus.co.kr");
			for(InetAddress one : ips) {
				System.out.println(one.getHostAddress());
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
