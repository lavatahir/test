package sysc3110_project;

import java.util.*;

public class Producer implements User {
	private String name;
	private String taste;
	private List<Document> liked_Documents;
	private List<User> followers;
	private int payoff;
	private Strategy strategy;
	private Strategy_L_F slf;
	public Producer(String name, String taste){
		this.name = name;
		this.taste = taste;
		liked_Documents = new ArrayList<Document>();
		followers = new ArrayList<User>();
		payoff = 0;
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	private void upload(){
		Document d = new Document(this.name, this.taste, this);
		
		
	}
	@Override
	public List<Document> search(List<Document> l) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void payoff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void liking_or_following(List<Document> l, Strategy s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Document> rank_Documents(List<Document> l, Strategy s) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addFollower(User u) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void set_Strategy(Strategy s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getTaste() {
		return this.taste;
	}
	@Override
	public void addFollower(User u) {
		followers.add(u);
	}
	@Override
	public Graph graph_payoff(int time) {
		// TODO Auto-generated method stub
		return null;
	}

}
