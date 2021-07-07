package ue9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class IAUTest {
	
	private static final Integer[] A1 = { 0, 4, 2, 5, 9, 3, 2, 10 };
	private static final Integer[] A2 = { null, 4, 2, 3, null, 9, 3 };
	
	private IntegerArrayUtil iat;
	
	@BeforeEach
	public void init() {
		iat = new IntegerArrayUtil();
	}
	
	@Test
	public void testSumIfParameterUebergabe() {
		// npe for array == null
		try {
			iat.sumIf(null, 5, "=");
			fail();
		} catch (NullPointerException ex) { /* success */ }
		
		// npe for compare == null
		try {
			iat.sumIf(A1, null, "==");
			fail();
		} catch (NullPointerException ex) { /* success */ }
		
		// npe for op == null
		try {
			iat.sumIf(A1, 5, null);
			fail();
		} catch (NullPointerException ex) { /* success */ }
	}
	
	@Test
	public void testSumIfOperatoren() {
		// unknown operator
		try {
			iat.sumIf(A1, 5, "?");
			fail();
		} catch (UnsupportedOperationException ex) { /* success */ }
		
		// another unknown operator
		try {
			iat.sumIf(A2, 8, "==");
			fail();
		} catch (UnsupportedOperationException ex) { /* success */ }
		
		// correct impl for op "="
		assertEquals(4, iat.sumIf(A1, 2, "="));
		
		// correct impl for op ">
		assertEquals(0, iat.sumIf(A1, 10, ">"));
		
		// correct impl for op "<"
		assertEquals(7, iat.sumIf(A1, 4, "<"));
	}
	
	@Test
	public void testSumIfArrayMitNull() {
		try {
			iat.sumIf(A2, 3, "=");
			fail();
		} catch (NullPointerException ex) { /* success */ }
	}
	
}
