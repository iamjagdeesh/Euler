package com.euler.zero;

public class TwoEvenFibonacciNumbers {

	public static void main(String[] args) {
		
		Integer limit = 4000000;
		Integer lastTerm = 0;
		Integer sum = 0;
		
		for (int i = 0, j = 1; lastTerm < limit; i=j,j=lastTerm) {
			if(lastTerm % 2 == 0){
				sum = sum + lastTerm;
			}
			lastTerm = i + j;
		}
		
		System.out.println(sum);

	}

}
