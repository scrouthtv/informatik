package ue6.propan;

public class BottleTester {
	
	public static final float SPECIFIC_VOLUME_PROPANE = 22.87e-3f;
	private final float maxPressure;
	
	/**
	 * @param maxPressure the maximum pressure this bottle will survive in Pa.
	 */
	public BottleTester(final float maxPressure) {
		this.maxPressure = maxPressure;
	}
	
	public float getMaxPressure() {
		return maxPressure;
	}
	
	/**
	 * Tests if this bottle will "survive" the specified gas at the specified
	 * temperature.
	 * The bottle is considered broken if the pressure is equal to or exceeds
	 * the specified max pressure.
	 *
	 * @param temperature     the temperature in K
	 * @param specific_volume the specific volume in m^3/kg
	 */
	public boolean willSurvive(final float temperature, final float specific_volume) {
		return IdealGas.idealGasPressure(specific_volume, temperature) >= maxPressure;
	}
	
}
