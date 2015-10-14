package sysc3110_project;
import java.util.*;
public class Simulation {
	
	private int rounds;
	private List<User> users;
	private Set<Document> documents;
	
	public Simulation(int rounds)
	{
		this.rounds = rounds;
		users = new ArrayList<>();
		documents= new HashSet<>();
	}
	
	private void addUser(User user)
	{
		users.add(user);
		
	}
	

}
