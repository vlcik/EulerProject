package org.euler.problem;

import java.math.BigDecimal;


public class Problem16 implements IResult {
	
	@Override
	public void count() {
		
		BigDecimal result = new BigDecimal(1);
		for (int i = 1; i <= 1000; i++){
			//result.pow(1000);
		}
		result.pow(1000);
		System.out.println(result.toString());
	}
	
	private long getDigitSum(Double d){
		long count = 0;
		String number = d.toString();
		for (int i = 0; i < number.length(); i++){
			char ch = number.charAt(i);
			count += Long.valueOf(ch);
		}
		
		return count;
	}

}
