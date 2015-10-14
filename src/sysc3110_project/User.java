package sysc3110_project;

import java.util.*;

public interface User {
	public void act();
	public List<Document> search(List<Document> l);
	public void payoff();
	public void liking_or_following(List<Document> l, Strategy s);
	public List<Document> rank_Documents(List<Document> l, Strategy s);
	public void set_Strategy(Strategy s);
	public Graph graph_payoff(int time);
}
