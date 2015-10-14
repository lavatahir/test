package sysc3110_project;

import java.util.*;

public class Document implements Comparable{
	private String name;
	private String tag;
	private List<User> list_users;
	private int likes;
	private User uploader;
	public Document(String name, String taste, User uploader){
		this.name= name;
		this.tag = taste;
		this.uploader = uploader;
		list_users = new ArrayList<User>();
		likes = 0;
	}
	public List<User> get_users(){
		return list_users;
	}
	public User get_uploader(){
		return uploader;
	}
	public void add_user(User u){
		list_users.add(u);
	}
	public int get_likes(){
		likes = list_users.size();
		return likes;
	}
	public String getTag(){
		return tag;
	}
	@Override
	public int compareTo(Object o) {
		Document doc = (Document) o;
		if(this.get_likes() < doc.get_likes()){
			return -1;
		}
		return 1;
	}
}
