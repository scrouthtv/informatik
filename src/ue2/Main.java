package ue2;

public class Main {
	public static void main(String[] args) {
		final long start = System.currentTimeMillis();
		final double pi = PiCalculator.calculatePI(4);
		final long elapsed = System.currentTimeMillis() - start;
		System.out.printf("Approximated pi to %f (%d ms)\n", pi, elapsed);
		
		final MathematicalFunction sinxh = new MathematicalFunction() {
			@Override
			public double value(final double x) {
				return Math.cos(x/2);
			}
			
			@Override
			public double deriv(final double x) {
				return -Math.sin(x/2) / 2;
			}
		};
		
		final double xzero = ZeroFinder.findZero(sinxh, 1, 1e-6);
		System.out.printf("Approximated a zero at %f, f(x) = %f\n",
				  xzero, sinxh.value(xzero));
		
		BrakeSimulator sim = new BrakeSimulator(10, 36);
		BrakeAnalyzer analyze = new BrakeAnalyzer(10, 36);
		sim.run();
		System.out.println("Simulated: " + sim.current());
		System.out.println("Calculated: " + analyze.stateWhenStopped());
	}
	
}
