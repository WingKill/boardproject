package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.BoardControl;
import controllers.BoardList;
import post.Post;

public class ClientView{
	
	private int page = 1; // 5번 : 종료
	Scanner sc = new Scanner(System.in);
	ArrayList<Post> posts = new ArrayList<Post>();
	// 뷰에 고정되는 부분 - 리스트 상단
	public void listheader() {
		System.out.println("-------------------------------------------------------");
		System.out.println("  |  전체 번호   | 게시글 제목    | 게시글 작성자  | 게시글 작성일  |  ");
	}
	
	// 뷰에 고정되는 부분 - 리스트 하단
	public void listfooter() {
		System.out.println("-------------------------------------------------------");
		System.out.println("  | 1. 게시글 작성  | 2. 게시글 수정 | 3. 게시글 삭제 | 4. 게시글 보기 | 5. 종료 | ");
	}
	
	// 뷰에서 sc를 통해 처리할 영역.
	public int selectlistfooter() {
		System.out.println("선택할 영역 중 하나(1,2,3,4 중 하나) : ");
		page = sc.nextInt();
		return page;
	}
	
	// 뷰에 고정되는 부분 - 게시글 선택지(1 : 작성, 2 : 수정 , 3 : 삭제, 4 : 게시글 보기)
	public void footer(int page) {
		if(page == 1) { // 작성
			System.out.println("-------------------------------------------------------");
			System.out.println("                 | 1. 작성  | 2. 취소 | ");
		}else if(page == 2) { // 수정
			System.out.println("-------------------------------------------------------");
			System.out.println("                 | 1. 수정  | 2. 취소 | ");
		}else if(page == 3) { // 삭제
			System.out.println("-------------------------------------------------------");
			System.out.println("                 | 1. 삭제  | 2. 취소 | ");
		}else if(page == 4) { // 게시글 보기
			System.out.println("-------------------------------------------------------");
			System.out.println("확인하실 게시글 번호는 무엇입니까?");
			int exit = sc.nextInt();
			BoardList list = new BoardList();
			list.doing(posts);
		}
	}
	
	// 뷰에서 나타나는 부분 - 리스트 몸통
	public void listbody(ArrayList<Post> posts) {
		if(posts.isEmpty()) {
			Post post = new Post();
			post.isNullStr();
		}else {
			for(Post post : posts) {
				post.toString();
			}
		}		
	}
	
	// 뷰에서 나타나는 부분 - 게시글 몸통
	public void thepost(int page) {
		// 게시글 내용이 나와야 한다.
		System.out.println("-------------------------------------------------------");
		if(page!=5) {
			if(posts.size() < 2) {
				Post post = new Post();
				System.out.println("제 목 : " ); 
				post.setSubject(sc.nextLine());
				System.out.println("작 성 자 : " );
				post.setWriterName(sc.next());
				System.out.println("내 용 : ");
				post.setContent(sc.nextLine());
			}
		}		
		else {
			System.out.println("접근해선 안되는 루트로 접근하셨습니다. 강제로 종료됩니다.");
			page = 5; // page = 4 이면 종료한다.
			return;
		}		
	}
	
	public void isedit() {
		
	}
}
