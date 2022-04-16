package program.NumberDifference;

import static org.junit.Assert.*;

import org.junit.Test;

public class GroupTest extends NumberDifferenceTest {
    
    private String messageBuilder(int diff) {
        String message;

        message = "Difference: " + diff;

        if (diff == 0) {
            message = message + "\nNon group, There's no difference";
        } else if ((diff >= 1) && (diff <= 10)) {
            message = message + "\nGroup 1, Small Difference";
        } else if ((diff >= 11) && (diff <= 50)) {
            message = message + "\nGroup 2, Medium Difference";
        } else if (diff >= 51) {
            message = message + "\nGroup 3, Large Difference";
        } 

        return message;
    }

    @Test
	public void nonGroup() { // TC09
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 0;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

    @Test
	public void Group1() { // TC2
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 1;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

    @Test
	public void Group2() { // TC5
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 11;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

    @Test
	public void Group3() { // TC7
		// (1) setup (arrange, build)
		int diff;
		String actual, expected;
		diff = 300;
        expected = messageBuilder(diff);

		// (2) exercise (act, operate)
		actual = sut.groupingDifference(diff);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

}
