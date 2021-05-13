package Classes;

import Exceptions.LessThanZeroException;

/**
 * @author Leela
 *
 */
public class MyCalculator {
	public long Power(int num1, int num2) throws LessThanZeroException {
		if (num1 == 0 && num2 == 0) {
			// throw new LessthanZeroException();
			throw new LessThanZeroException("java.lang.Exceptions : The Number1 and Number2 should not be Zero");

		} else if (num1 < 0 || num2 < 0) {
			throw new LessThanZeroException("java.lang.Exception : The Number1 or Number2 should not be Negative");
		} else {
			return (long) Math.pow(num1, num2);
		}
	}

}
