package ue6.propan;

public class Temperature {
	
	private static final float ctok = 273.15F;
	
	public static float CelsiusToKelvin(final float celsius) {
		return celsius + ctok;
	}
	
}
