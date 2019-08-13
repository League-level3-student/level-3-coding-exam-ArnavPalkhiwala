import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub

		for (int i = 0; i < votes.size(); i++) {
			
			votes.set(i,votes.get(i).toLowerCase());
			System.out.println(votes.get(i));

		}

		int es = 0;
		int pf = 0;

		for (int i = 0; i < votes.size(); i++) {

			if (votes.get(i) == "pope francis") {

				pf += 1;
			}

			else if (votes.get(i) == "edward snowden") {
				
				es += 1;
			}

		}
		
		if (pf > es) {
			
			return "pope francis";
			
		}
		
		else if (pf == es) {
			
			return "TIE";
			
		}

		
		return votes;
	}

}
