package org.euler.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem9 implements IResult {
	
	@Override
	public void count() {
		
		Set<Double> set = new HashSet<>();
		Point3D[] points = new Point3D[]{
				new Point3D(0, 5, 4),
				new Point3D(0, 0, -3),
				new Point3D(-2, 1, -6),
				new Point3D(1, 1, 1),
				new Point3D(1, 1, 5),
				new Point3D(0, 2, 7),
				new Point3D(4, -4, 3), 
				new Point3D(0, 0, 5),
				new Point3D(0, -4, 3),
		};
		
		for (Point3D point : points){
			set.add(Math.pow((double)point.x, 2) + Math.pow((double)point.y, 2) + Math.pow((double)point.z, 2));
		}
		System.out.println(set.size());
	}

}

class Point3D {
	public int x;
	public int y;
	public int z;
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
