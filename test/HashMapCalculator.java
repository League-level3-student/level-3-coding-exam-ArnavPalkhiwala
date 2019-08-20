import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub

		int matching = 0;

		for (String s : hashmap1.keySet()) {

			if (hashmap1.containsKey(s) && hashmap2.containsKey(s)) {

				if (hashmap1.get(s) == hashmap2.get(s)) {

					matching += 1;

				}
				
				

			}
			
			System.out.println(s);
			System.out.println(matching);
		}

		return matching;
	}

}
