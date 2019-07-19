package org.euler.problem;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

	public void compute() {
		
		List<Long> primeNumbers = new ArrayList<>();
		primeNumbers.add(2L);
		Long number = 3L;
		boolean iteration = true;
		Long sum = 2L;
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

	public static void main(String[] args) {
		new Problem10().compute();
	}

}
