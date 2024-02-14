package controllers;

import java.util.ArrayList;

import post.Post;

public class BoardList implements BoardControl{

	@Override
	public void doing(ArrayList<Post> posts) {
		if(posts != null) {
			for(Post post : posts) {
				post.toString();
			}		
		}else {
			Post post = new Post();
			post.isNullStr();
		}
	}
	
	public Post onePost(ArrayList<Post> posts) {
		if(posts.size() == 1)
			return posts.get(0);
		else 
			return null;
	}
	
	public void doing(Post post) {
		
	}
}
