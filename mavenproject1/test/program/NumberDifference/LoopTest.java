package program.NumberDifference;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class LoopTest extends NumberDifferenceTest {
        
	@Test
	public void loop1_01() { // TC07
		// (1) setup (arrange, build)
        ArrayList<Integer> series;
		int actual, expected;
        series = new ArrayList<Integer>(Arrays.asList(500, 200));
        expected = 300;

		// (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(series);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

    
	@Test
	public void loop2_01() { // TC17
		// (1) setup (arrange, build)
        ArrayList<Integer> series;
		int actual, expected;
        series = new ArrayList<Integer>(Arrays.asList(300, 200, 100));
        expected = 200;

		// (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(series);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

    @Test
	public void loopN1_01() { // TC16
		// (1) setup (arrange, build)
        ArrayList<Integer> series;
		int actual, expected;
        series = new ArrayList<Integer>(Arrays.asList(900, 800, 700, 600, 500, 400, 300, 200, 100, 0));
        expected = 900;

		// (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(series);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
}