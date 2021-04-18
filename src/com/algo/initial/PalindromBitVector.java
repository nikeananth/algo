package com.algo.initial;

public class PalindromBitVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(isPermutationOfPalindrome("civic"));
	}
	
	static boolean isPermutationOfPalindrome(String phrase) {
		int bitVector = createBitVector(phrase);
		return bitVector == 0 || checkExactlyOneBitSet(bitVector);
	}

	/* Create a bit vector for the string. For each letter with value i, toggle the ith bit. */
	static int createBitVector(String phrase) {
		int bitVector = 0;
		for (char c : phrase.toCharArray()) {
			int x = c;
			bitVector = toggle(bitVector, x);
		}
		return bitVector;
	}

	static int toggle(int bitVector, int index) {
		if (index < 0)	return bitVector;
		int mask = 1 << index;

		if((bitVector & mask) == 0)
			bitVector |= mask;
		else
			bitVector &= ~mask;
		return bitVector;
	}

	/* Check that exactly one bit is set by subtracting one from the integer and ANDing it with the original integer */
	static boolean checkExactlyOneBitSet(int bitVector) {
		return (bitVector & (bitVector-1)) == 0;
	}


}
