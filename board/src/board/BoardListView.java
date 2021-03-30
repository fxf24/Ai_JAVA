package board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardListView {
	void show() {
		Scanner sc = new Scanner(System.in);
		System.out.println("페이지번호 입력: ");
		int pagenum = sc.nextInt();
		System.out.println("한 페이지당 출력 게시물 갯수 입력: ");
		int cntperpage = sc.nextInt();
		
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> dto = dao.getBoardList(pagenum, cntperpage);
		for(BoardDTO d : dto) {
			System.out.println(d);
		}
	}
}
