package org.euler.problem;

public class Problem3 implements IResult {
	
	@Override
	public void count() {
		Long number = new Long(600851475143l);
		long k = 2;
		
		long result = 0;
		while (number > 1){
			boolean b = true;
			while (b){
				if ((number % k) == 0){
					number = number / k;
					if (k > result){
						result = k;
					}
				}
				else {
					b = false;
				}
			}
			
			k++;
		}
		
		System.out.println(result);
	}

}
