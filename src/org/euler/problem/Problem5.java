package org.euler.problem;

public class Problem5 implements IResult {
	
	@Override
	public void count() {
		long result = 0;
		boolean iteration = true;
		long number = 20;
		
		while (iteration){
			int l = 1;
			while (l <= 20){
				
				if (!((number % l) == 0)){
					break;
				}
				if (l == 20){
					result = number;
					iteration = false;
				}
				l++;
			}
			number++;
		}
		
		System.out.println(result);
		
	}

}
