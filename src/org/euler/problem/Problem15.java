package org.euler.problem;


import org.euler.IResult;

public class Problem15 implements IResult {
	
	private static int count = 0;
	
	@Override
	public void compute() {
		
		traceGrid(0, 0, 2);
		
	}
	
	private void traceGrid(int x, int y, int gridSize){
		Problem15.count++;
		System.out.println(Problem15.count + ": [" + x + ", " + y + "]");
		if (x != gridSize){
			traceGrid(x+1, y, gridSize);
		}
		if (y != gridSize){
			traceGrid(x, y+1, gridSize);
		}
		
	}

}
