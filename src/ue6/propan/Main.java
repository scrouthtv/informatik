package ue6.propan;

public class Main {
	
	public static void main(String[] args) {
		BottleTester rustyBottle = new BottleTester(30e5f);
		for (float t : new int[]{20, 30, 40, 50, 60, 70, 80, 90, 100}) {
			if (rustyBottle.willSurvive(Temperature.CelsiusToKelvin(t), BottleTester.SPECIFIC_VOLUME_PROPANE)) {
				System.out.printf("Flasche hält dem Druck bei %f °C nicht stand. Lebensgefahr!\n", t);
				System.out.printf(" (%f > %f)\n",
						IdealGas.idealGasPressure(BottleTester.SPECIFIC_VOLUME_PROPANE,
								Temperature.CelsiusToKelvin(t)), rustyBottle.getMaxPressure());
			} else
				System.out.printf("Flasche hält dem Druck bei %f °C stand!\n", t);
		}
	}
	
}
