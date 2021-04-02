package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testMethod2() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafa", "Silva");
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testMethod3() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafae", "Silva");
		assertEquals("The result should be 2", i, 2);
	}
	@Test
	public void testMethod4() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testMethod5() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testMethod6() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('O');
		assertEquals("The result should be 2", i, 2);
	}
	@Test
	public void testMethod7() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(25);
		assertEquals("The result should be 0", i, 0);
	}
	@Test
	public void testMethod8() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(35);
		assertEquals("The result should be 1", i, 1);
	}
	@Test
	public void testMethod9() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("a");
		assertEquals("The result should be 0", i, 0);
   }
	@Test
	public void testMethod10() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("b");
		assertEquals("The result should be 1", i, 1);
   }
	@Test
	public void testMethod11() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("c");
		assertEquals("The result should be 2", i, 2);
   }
	@Test
	public void testMethod12() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("d");
		assertEquals("The result should be 3", i, 3);
   }
	@Test
	public void testMethod13() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("e");
		assertEquals("The result should be 4", i, 4);
   }
	@Test
	public void testMethod14() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("f");
		assertEquals("The result should be 5", i, 5);
   }
	@Test
	public void testMethod15() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("g");
		assertEquals("The result should be 6", i, 6);
   }
	@Test
	public void testMethod16() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("h");
		assertEquals("The result should be 7", i, 7);
   }
	@Test
	public void testMethod17() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("i");
		assertEquals("The result should be 8", i, 8);
   }
	@Test
	public void testMethod18() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("j");
		assertEquals("The result should be 9", i, 9);
   }
	@Test
	public void testMethod19() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("k");
		assertEquals("The result should be 10", i, 10);
   }
	
}