package ue2;

/**
 * Fully describes the modeled vehicle at one point in time.
 */
public class State {
	public final double time, position, speed;
	
	public State(final double time, final double position, final double speed) {
		this.time = time;
		this.position = position;
		this.speed = speed;
	}
	
	@Override
	public String toString() {
		return String.format("After %.2f s, the car has %.2f m/s and traveled %.2f m.",
				  time, speed, position);
	}
}
