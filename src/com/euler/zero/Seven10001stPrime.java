package com.euler.zero;
import java.util.ArrayList;
import java.util.List;

public class Seven10001stPrime {

	public static void main(String[] args) {
		
		List<Long> listOfPrimes = new ArrayList<Long>();
		listOfPrimes.add(2L);//Only even prime
		Integer countOfPrimes = 1;
		Long sqrt = 1L;
		sqrt = sqrt + 1;
		//Long div = 2L;
		Boolean flag = false;
		
		for (Long i = 3L; ; i=i+2) {
			sqrt = (long) Math.sqrt(i);
			sqrt = sqrt + 1;
			for (Long div : listOfPrimes) {
				if(div >= sqrt){
					listOfPrimes.add(i);
					countOfPrimes++;
					if(countOfPrimes == 10001){
						flag = true;
						break;
					}
					break;
				}
				if(i % div == 0){
					break;
				}
			}
			if(flag){
				System.out.println(i);
				break;
			}
		}
		

	}

}
