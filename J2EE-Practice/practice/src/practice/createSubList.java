package practice;

import java.util.ArrayList;

public class createSubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jane");
		names.add("bob");
		names.add("matt");
		names.add("sara");

		ArrayList<String> selected = new ArrayList<String>();

		permuteSubList(names, selected);
	}

	private static void permuteSubList(ArrayList<String> names, ArrayList<String> selected) {

		if (names.size() == 0) {
			System.out.println(selected);
		}

		else {
			
				String choosenName = names.remove(0);

				// the selected names has not been included
				permuteSubList(names, selected);
				selected.add(choosenName);
				// the selected names has been included
				permuteSubList(names, selected);

				selected.remove(choosenName);
				names.add(0, choosenName);

		}
	}

}
