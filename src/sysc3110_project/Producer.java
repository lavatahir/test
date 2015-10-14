package sysc3110_project;

import java.util.*;

public class Producer extends User implements Strategy {

	
	public Producer(String name, String taste){
		super(name, taste);
	}
	@Override
	public void act(Set<Document> l, int k) {
		
		int size = likedDocuments.size();
		HashSet<Document> documents = (HashSet<Document>) rankAlgo(l,k);
		LFPopAlgo(documents,this);
		payoff = likedDocuments.size() - size;	
	}
	
	@SuppressWarnings("unchecked")
	public Set<Document> rankAlgo(Set<Document> s, int k){
		ArrayList<Document> l = new ArrayList<Document>(s);
		Collections.sort(l);
		HashSet<Document> hs = new HashSet<Document>();
		for(int i = 0; i < k; i++){
			hs.add(l.get(i));
		}
		return hs;
	}
	
	public void LFPopAlgo(Set<Document> l, User me) {
		for(Document d : l){
			if(d.getTag().equals(me.getTaste())){
				d.add_user(me);
				me.addLikedDocuments(d);
				for(User u: d.get_users()){
					u.addFollower(me);
				}
			}
		}
		
	}


}
