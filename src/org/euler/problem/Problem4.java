package org.euler.problem;

import org.euler.IResult;

public class Problem4 implements IResult {
	
	@Override
	public void compute() {
		long result = 0;
		
		for (int k = 999; k > 100; k--){
			for (int l = 999; l > 100; l--){
				int r = k * l;
				if (isStringPalindrom(String.valueOf(r))){
					if (result < r){
						result = r;
					}
				}
			}
		}
		
		System.out.println(result);
		
	}

	private boolean isStringPalindrom(String word) {
		int w = word.length();
		boolean isPalindrom = true;
		for (int i = 0; i < (word.length() / 2); i++){
			if (word.charAt(i) != word.charAt(--w)){
				isPalindrom = false;
				break;
			}
		}
		
		return isPalindrom;
	}

}
