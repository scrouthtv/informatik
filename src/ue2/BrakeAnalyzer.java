package ue2;

/**
 * Analyzes a braking scenario.
 */
public class BrakeAnalyzer {
	private final double R;
	private final double v0;
	
	public BrakeAnalyzer(final double R, final double v0) {
		this.R = R;
		this.v0 = v0;
	}
	
	/**
	 * Calculates distance and time when the vehicle has fully stopped.
	 * Speed will obviously be 0.
	 */
	public State stateWhenStopped() {
		return new State(
				  v0 / R,
				  v0 * v0 / (2.0 * R),
				  0
		);
	}
	
}
