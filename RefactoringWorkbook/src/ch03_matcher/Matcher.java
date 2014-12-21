package ch03_matcher;

public class Matcher {
    public Matcher() {}
   
    public boolean match(int[] expected, int[] actual, 
        int clipLimit, int delta) 
    {
        actual = clipLargeValues(actual, clipLimit);

        boolean isMatching = checkLengthDifference(expected, actual);

        isMatching = checkWithinDelta(expected, actual, delta);

        return isMatching;
    }

	private boolean checkWithinDelta(int[] expected, int[] actual, int delta) {
		for (int i = 0; i < actual.length; i++)
            if (Math.abs(expected[i] - actual[i]) > delta)
                return false;
		return true;
	}

	private boolean checkLengthDifference(int[] expected, int[] actual) {
		return actual.length != expected.length ? false : true;
	}

	private int[] clipLargeValues(int[] actual, int clipLimit) {
		for (int i = 0; i < actual.length; i++)
            if (actual[i] > clipLimit)
                actual[i] = clipLimit;
		
		return actual;
	}
}