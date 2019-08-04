package practice;

import java.util.ArrayList;

public class PrintDiceSum {
	static int functionCallNumber=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rollCounter = 4;
		int diceSum = 9;
		
		ArrayList<Integer> prefixList = new ArrayList<Integer>();

		prtDiceSum(rollCounter, diceSum, prefixList);

		System.out.println(functionCallNumber);
	}

	public static void prtDiceSum(int rollCounter, int diceSum, ArrayList<Integer> prefixList) {
		functionCallNumber=functionCallNumber+1;
		if (rollCounter == 0) {

			if (diceSum == 0)
				System.out.println(prefixList);
			//return;
		} else {
			for (int i = 1; i <= 6; i++) {
				if (diceSum - i >= 0 && diceSum<=rollCounter*6) {
					// Choose
					prefixList.add(i);
					// Explore
					prtDiceSum(rollCounter - 1, diceSum - i, prefixList);
					// Un-choose
					prefixList.remove(prefixList.size() - 1);
				}
			}

		}

	}

}
