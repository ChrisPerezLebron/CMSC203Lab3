import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook book1, book2; 
	@BeforeEach
	void setUp() throws Exception {
		book1 = new GradeBook(5);
		book1.addScore(77.0);
		book1.addScore(94.0);
		book1.addScore(66.0);
		book1.addScore(67.0);
		book1.addScore(98.0);
		
		
		book2 = new GradeBook(5);
		book2.addScore(95.0);
		book2.addScore(63.0);
		book2.addScore(40.0);
		book2.addScore(77.0);
		book2.addScore(87.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
		book2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(book1.toString().equals("77.0 94.0 66.0 67.0 98.0 "));
		assertTrue(book2.toString().equals("95.0 63.0 40.0 77.0 87.0 "));
		
		
		assertEquals(5, book1.getScoreSize(), .001);
		assertEquals(5, book2.getScoreSize(), .001);
		
		
	}

	@Test
	void testSum() {
		assertEquals(402.0, book1.sum(), .001);
		assertEquals(362.0, book2.sum(), .001);
	}

	@Test
	void testMinimum() {
		assertEquals(66.0, book1.minimum(), .001);
		assertEquals(40.0, book2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(336.0, book1.finalScore(), .001);
		assertEquals(322.0, book2.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		//task 4 did not specify tests for this method 
		//presumably because it is tested within the addScore test
	}

	@Test
	void testToString() {
		//task 4 did not specify tests for this method 
		//presumably because it is tested within the addScore test
	}

}
