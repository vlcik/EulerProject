package org.euler.problem;

import org.euler.IResult;

import java.util.ArrayList;
import java.util.List;

public class Problem10 implements IResult {
	
	@Override
	public void compute() {
		
		List<Long> primeNumbers = new ArrayList<>();
		primeNumbers.add(2l);
		Long number = 3l;
		boolean iteration = true;
		Long sum = 2l;
		while (iteration){
			
			boolean isPrimeNumber = true;
			for (int i = 0; i < primeNumbers.size(); i++){
				
				if ((number % primeNumbers.get(i)) == 0){
					isPrimeNumber = false;
					break;
				}
			}
			
			if (isPrimeNumber){
				primeNumbers.add(number);
				System.out.println(number);
				sum += number;
			}
			
			number++;
			
			if (number == 2_000_000){
				iteration = false;
			}
		}
		
		System.out.println(sum);
		
	}

}
