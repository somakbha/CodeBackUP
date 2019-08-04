package org.somak.lambda.uni1;

import org.somak.lambda.inter.StringLengthLambdaInterf;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
		StringLengthLambdaInterf i=s->s.length();
		System.out.print("given string length is: "+i.getStringLength("Somak Bhattacharya"));

	}

}
