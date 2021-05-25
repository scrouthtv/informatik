package ue5;

import java.util.Arrays;

/**
 * n-dimensional vector.
 */
public class VectorNd {
	private final double[] v;
	
	public VectorNd(double... v) {
		this.v = v;
	}
	
	public double size() {
		double inner = 0;
		for (double x : v) inner += x * x;
		
		return Math.sqrt(inner);
	}
	
	public void normalize() {
		for (int i = 0; i < v.length; i++) v[i] = v[i] / size();
	}
	
	/**
	 * If the dimensions of this and the other vector match,
	 * add the other vector to this one.
	 */
	public void add(VectorNd v2) {
		if (v2.v.length != v.length) return;
		
		for (int i = 0; i < v.length; i++)
			v[i] += v2.v[i];
	}
	
	@Override
	public String toString() {
		return Arrays.toString(v);
	}
}
