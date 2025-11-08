package com.util;

import com.exceptionhandling.InvalidStringException;

public class ValidationUtil {

	public static boolean checkStirng(String str) throws InvalidStringException {

		if (str.length()>3) {
			return true;
		} else {

			throw new InvalidStringException(str + " ->is not valid...");
		}

	}
}
