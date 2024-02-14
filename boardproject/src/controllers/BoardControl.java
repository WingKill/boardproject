package controllers;

import java.util.ArrayList;

import post.Post;

public interface BoardControl {
	// 상수는 추가하지 않는 것이 좋을 듯 하다. 
	// 개념 정리를 하다보니, ArrayList<Post>는 초기화하여 사용하면 인터페이스를 구현한 클래스 간에서, 
	// 해당 클래스를 공통으로 사용할 수 있다. ArrayList<>가 상수가 되는 것. 그러면? 
	// ArrayList 자체를 상수로 만든 것이므로 게시글 추가, 수정, 삭제, 리스트 작업 시 해당 상수를 사용하게 된다.
	// 즉, 이를 활용하면 과도한 ArrayList 사용을 방지할 수 있게 되는 것.
	
	// 따로 키워드를 정하지 않으면 public static final이 붙게 된다.
	ArrayList<Post> POSTS = new ArrayList<Post>();
	
	
	// 클라이언트에서 요청한 작업을 구현하게 되는 메서드.
	public void doing(ArrayList<Post> posts);
}
