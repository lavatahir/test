package sysc3110_project;

import java.util.Collections;
import java.util.List;

public class Popularity_Strategy implements Rank_Strategy{
	@Override
	public void perform_algorithm(List<Document> l, User me) {
		sortList(l);
		
	}
	@SuppressWarnings("unchecked")
	private void sortList(List<Document> l){
		Collections.sort(l);
	}

}
