package day7;

import java.util.HashMap;

public class PhoneMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = new String[3];
		s1[0] = "010-1234-5678";
		s1[1] = "02-1234-5678";
		s1[2] = "ss@multi.com";
		
		String[] s2 = {"010-1234-5678", "02-1234-5678", "ss@multi.com"};
		HashMap<String, String[]> phone = new HashMap<>();
		
		phone.put("초등친구",
				new String[]{"010-1111-2222", "02-3429-2222", "032-1999-5122", "fri1@multi.com"});
		phone.put("고등친구", 
				new String[]{"010-1111-2222", "052-1999-5122", "fri2@multi.com"});
		phone.put("회사동기", 
				new String[]{"010-5656-2222", "fri3@multi.com"});
		phone.put("회사상사", 
				new String[]{"010-1111-2222", "052-1999-5122", "fri4@multi.com"});
		phone.put("회사상사", 
				new String[]{"010-9966-5678", "041-1999-5122", "fri4@multi.com"});
		
		System.out.println("총연락처갯수 = " + phone.size());
		
		//회사동기의 연락처 정보 조회
		String[] p = phone.get("회사동기");
		for(String s: p) {
			System.out.println(s);
		}
		
		//사장님의 연락처 정보 조회
		if(phone.containsKey("사장님")) {
			String[] p2 = phone.get("사장님");
			for(String s: p2) {
				System.out.println(s);
			}
		}
		else {
			System.out.println("사장님은 연락처에 없어요.");
		}
		
		//내 연락처 모든 정보 조회
		//초등친구 : xxxx | xxxx | ....
		for(String key: phone.keySet()) {
			String[] info = phone.get(key);
			System.out.print(key + " : ");
			for(String i : info) {
				System.out.print(i + "\t|\t");
			}
			System.out.println();
		}
	}

}
