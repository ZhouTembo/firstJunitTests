package test;
import main.MathUtil;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;



@DisplayName("Math Util")
public class myJtest {
	
	MathUtil calc;
	
//	SET UP
	@BeforeEach
	void setUp() {
//	Create instance of class being tested
		System.out.println("Starting to create object");
	 calc= new MathUtil();
		System.out.println("Created object");
	
	}

//	Annotation
//	Identifies what methods run as tests
	@Test
	void testAdd() {
		
////		Create instance of class being tested
//		MathUtil calc= new MathUtil();
//		
//		Expected
		int expected=2;
		
//		Actual
		int actual= calc.add(1, 1);
		
//		Verify
		assertEquals(actual,expected, "add should return 2");
	}
	@Test
	@DisplayName("testIsOdd")
	void testIsOdd() {
////		Create instance of class being tested
//		MathUtil calc= new MathUtil();
//		
//		expected
		
//		actual
		boolean actual=calc.isOdd(3);
//		verify
		assertTrue(actual);
		
	}

}
