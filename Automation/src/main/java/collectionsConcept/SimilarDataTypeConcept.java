package collectionsConcept;

import java.util.ArrayList;
import java.util.List;

public class SimilarDataTypeConcept {

	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(899);
		ls.add(765);
		ls.add(7865);
		ls.add(7659);
		ls.set(1,123);
		System.out.println(ls.get(1)); 
	}
}
