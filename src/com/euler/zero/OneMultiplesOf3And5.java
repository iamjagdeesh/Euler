package com.euler.zero;

public class OneMultiplesOf3And5 {

	public static void main(String[] args) {
		
		Integer sum3 = 0;
		Integer sum5 = 0;
		Integer sum = 0;
		Integer iter = 0;
		Integer limit = 1000;
		
		for (int i = 1; (i*3)<limit || (i*5)<limit ; i++) {
			
			if((i*3) % 5 != 0){
				sum3 = sum3 + i*3;
			}
			sum5 = sum5 + i*5;
			iter = i;//Copy the iterator to a local variable so it can be used further
			
		}
		
		while((iter*5) >= limit){
			sum5 = sum5 - iter*5;
			iter--;
		}
		
		sum = sum3 + sum5;
		System.out.println("Sum : "+sum);

	}

}
