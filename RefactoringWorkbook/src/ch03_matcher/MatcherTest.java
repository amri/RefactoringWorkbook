package ch03_matcher;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherTest {
	@Test
	public void testMatch() {
        Matcher matcher = new Matcher();

        int[] expected = new int[] {10, 50, 30, 98};
        int clipLimit = 100;
        int delta = 5;

        int[] actual = new int[] {12, 55, 25, 110};

        assertEquals(true, matcher.match(expected, actual, clipLimit, delta));

        actual = new int[] {10, 55, 30, 98};
        assertEquals(true, matcher.match(expected, actual, clipLimit, delta));

        actual = new int[] {10, 50, 30};
        assertEquals(true,matcher.match(expected, actual, clipLimit, delta));
    }
}
