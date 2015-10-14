package sysc3110_project;

import java.util.*;

public abstract class User  {
	protected String name;
	protected String taste;
	protected Set<Document> likedDocuments;
	protected Set<User> following;
	protected Set<User> followers;
	protected int payoff;
		
	public User(String name, String taste){
		this.name = name;
		this.taste = taste;
		likedDocuments = new HashSet<Document>();
		following = new HashSet<User>();
		followers = new HashSet<User>();
		payoff = 0;
		
	}
	public void addFollower(User u){
		followers.add(u);
	}
	public void addLikedDocuments(Document d )
	{
		likedDocuments.add(d);
	}
	public Set<User> getFollowers(){
		return followers;
	}
	public Set<User> getFollowing(){
		return following;
	}
	
	//public void set_Strategy(Strategy s);
	//public Graph graph_payoff(int time);
	public String getName(){
		return name;
	}
	public String getTaste(){
		return taste;
	}
	public abstract void act(Set<Document> l, int k);
	
}
