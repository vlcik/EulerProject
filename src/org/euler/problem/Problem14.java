package org.euler.problem;


public class Problem14 implements IResult {
	
	@Override
	public void count() {
		
		long longestChainNumber = 0;
		long result = 1;
		for (long i = 1; i < 1000000; i++){
			long j = i;
			long k = 0;
			while (j != 1){
				k++;
				if ((j % 2) == 0){
					j /= 2;
				}
				else {
					j = 3*j + 1;
				}
			}
			
			if (longestChainNumber < k){
				result = i;
				longestChainNumber = k;
			}
		}
		
		System.out.println(result);
	}

}
