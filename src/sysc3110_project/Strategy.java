package sysc3110_project;

import java.util.*;

public interface Strategy {
	
	@SuppressWarnings("unchecked")
	public Set<Document> rankAlgo(Set<Document> s, int k);
	
	public void LFPopAlgo(Set<Document> l, User me);

}
