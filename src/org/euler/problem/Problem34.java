package org.euler.problem;

import org.euler.IResult;

import java.util.HashMap;
import java.util.Map;
import org.euler.IResult;


public class Problem34 implements IResult {
	
	@Override
	public void compute() {

		long start = 24;//1000000000;
		long max = 10000;//10000000000L;
		Map<Long, Long> factorials = new HashMap<>();
		factorials.put(0L, 0L);
		factorials.put(1L, 1L);
		factorials.put(2L, 2L);
		factorials.put(3L, 6L);
		factorials.put(4L, 24L);
		factorials.put(5L, 120L);
		factorials.put(6L, 720L);
		factorials.put(7L, 5040L);
		factorials.put(8L, 40320L);
		factorials.put(9L, 362880L);
		for (long number = start; number < max; number++){
			long sum = 0;
			long tmp = number;
			while(tmp != 0){
				long digit = tmp % 10;
				sum += factorials.get(digit);

				if (sum >= number) {
					tmp = 0;
				}

				tmp /= 10;
			}

			if (sum == number && tmp == 0){
				System.out.println(number);
			}
		}
	}
}
