package org.euler.problem;

public class Problem2 {

	public void compute() {
		int sum = 0;
		
		Long firstPredecessor = 1l;
		Long secondPredecessor = 0l;
		Long number = 0l;
		
		while ((number = firstPredecessor + secondPredecessor) < 4000000){
			
			secondPredecessor = firstPredecessor;
			firstPredecessor = number;
			
			if ((number % 2) == 0){
				sum += number;
			}
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Problem2().compute();
	}
}
