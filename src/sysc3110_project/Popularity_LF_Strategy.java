package sysc3110_project;

import java.util.List;

public class Popularity_LF_Strategy implements LF_Strategy{

	@Override
	public void perform_algorithm(List<Document> l, User me) {
		for(Document d : l){
			if(d.get_uploader().getName().equals(me.getName())){
				d.add_user(me);
				for(User u: d.get_users()){
					u.addFollower(me);
				}
			}
			if(d.getTag().equals(me.getTaste())){
				d.add_user(me);
			}
		}
		
	}

}
