package practice;

import java.util.ArrayList;

public class PrintDiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rollCounter=3;
		ArrayList <Integer>prefixList=new ArrayList<Integer>();

		prtDiceRool(rollCounter, prefixList);

	}

	public static void prtDiceRool(int rollCounter, ArrayList<Integer> prefixList) {
		if (rollCounter == 0) {

			System.out.println(prefixList);
			return;
		} else {
			for (int i = 1; i <= 6; i++) {
				//Choose
				prefixList.add(i);
				//Explore
				prtDiceRool(rollCounter - 1, prefixList);
				//Un-choose
				prefixList.remove(prefixList.size()-1);
			}

		}

	}

}
