package com.euler.zero;

public class SixSumSquareDifference {

	public static void main(String[] args) {
		
		Integer n = 100;
		Integer sumOfSquares = (n*(n+1)*(2*n+1))/6;
		Integer sumOfNIntegers = (n*(n+1))/2;
		Integer squareOfsumOfNIntegers = (int) Math.pow(sumOfNIntegers, 2);
		Integer sumSquareDifference = squareOfsumOfNIntegers - sumOfSquares;
		System.out.println(sumSquareDifference);

	}

}
