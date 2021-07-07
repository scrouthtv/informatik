package ue9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

	@Test
	public void testPrimeWithPrime() {
		assertEquals(true, Math.isPrime(7));
	}
	
	@Test
	public void testPrimeWithNoPrime() {
		assertEquals(false, Math.isPrime(25));
	}
	
	@Test
	public void testPrimeSmallNumbers() {
		assertEquals(false, Math.isPrime(0));
		assertEquals(false, Math.isPrime(1));
	}
	
	@Test
	public void testPrimeNegative() {
		assertEquals(false, Math.isPrime(-5));
	}

}
