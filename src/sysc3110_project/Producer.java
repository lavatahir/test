package sysc3110_project;

import java.util.*;

public class Producer implements User {
	private String name;
	private String taste;
	private List<Document> liked_Documents;
	private int payoff;
	private Strategy strategy;
	private Strategy_L_F slf;
	public Producer(String name, String taste){
		this.name = name;
		this.taste = taste;
		liked_Documents = new ArrayList<Document>();
		payoff = 0;
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
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
	public void set_Strategy(Strategy s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Graph graph_payoff(int time) {
		// TODO Auto-generated method stub
		return null;
	}

}
