package org.euler.problem;

public class Problem9 implements IResult {
	
	@Override
	public void count() {
		for (int i = 1000; i > 0; i--){
			for (int j = i; j > 0; j--){
				for (int k = j; k > 0; k--){
					//System.out.println(i + " - " + j + " - " + k);
					int a = j * j;
					int b = k * k;
					if ((a + b) == i*i){
						if (i + j + k == 1000){
							System.out.println(i + " - " + j + " - " + k);
						}
					}
				}
			}
		}
	}

}
