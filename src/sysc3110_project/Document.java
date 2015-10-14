package sysc3110_project;

import java.util.*;

public class Document {
	private String name;
	private String tag;
	private List<User> list_users;
	private int likes;
	
	public Document(String name, String taste){
		this.name= name;
		this.tag = taste;
		list_users = new ArrayList<User>();
		likes = 0;
	}
	public List<User> get_users(){
		return list_users;
	}
	public add_user(User u){
		list_users.add(u);
	}
	public int get_likes(){
		for(int i =0; i< list_users.size; i++){
			likes++;
		}
		return likes;
	}
}
