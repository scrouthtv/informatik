package ue6.propan;

public class IdealGas {
	
	/**
	 * R = 189 J/kg*K
	 */
	private static final float GAS_CONSTANT = 189;
	
	/**
	 * Calculates the pressure of an ideal gas using
	 * p = R * T / v
	 * @param v the gas's *specific* volume in m^3/kg
	 * @param t the temperature in K
	 * @return the pressure in Pa (1 Pa = 1 kg/m*s^2)
	 */
	public static float idealGasPressure(final float v, final float t) {
		return GAS_CONSTANT * t / v;
	}
	
}
