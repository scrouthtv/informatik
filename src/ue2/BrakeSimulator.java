package ue2;

/**
 * Simulates a braking vehicle with constant deceleration R.
 * The simulation calculates discreet points in time.
 * The time step is configured through SIM_STEP [s].
 *
 * Every state specifies
 *  - the current time in seconds
 *  - the traveled way in meters
 *  - the current speed in m/s
 *
 * It is possible to either perform a single time step
 * or run the simulation until the vehicle halts.
 */
public class BrakeSimulator {
	
	/**
	 * Specifies how many seconds the simulation should advance
	 * with every tick.
	 */
	public static final double SIM_STEP = 1e-3;
	
	private final double R;
	private State current;
	
	public BrakeSimulator(final double R, final double v0) {
		this.R = R;
		current = new State(0, 0, v0);
	}
	
	/**
	 * canTick tests whether this process can still tick.
	 * It essentially tests, whether the vehicle is still driving
	 * ( current().speed > 0 ).
	 */
	public boolean canTick() {
		return current.speed > 0;
	}
	
	public void tick() {
		if (!canTick()) return;
		
		current = new State(
				  current.time + SIM_STEP, // tn + Dt
				  current.position + current.speed * SIM_STEP, // xn + vn * Dt
				  current.speed - R * SIM_STEP // vn - R * Dt
		);
	}
	
	public void run() {
		while (canTick()) tick();
	}
	
	public State current() {
		return current;
	}
	
}
