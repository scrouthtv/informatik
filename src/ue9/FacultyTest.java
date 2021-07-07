package ue9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FacultyTest {

	@Test
	public void testFacultyValid() {
		final Integer ans = Math.faculty(4);
		assertEquals(4*3*2, ans);
	}
	
	@Test
	public void testFacultyZero() {
		final Integer ans = Math.faculty(0);
		assertEquals(1, ans);
	}
	
	@Test
	public void testFacultyNegative() {
		final Integer ans = Math.faculty(-3);
		assertEquals(ans, null);
	}
	
	@Test
	public void testFacultyOutOfRange() {
		final Integer ans = Math.faculty(11);
		assertEquals(ans, null);
	}

}
