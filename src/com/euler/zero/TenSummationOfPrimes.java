package com.euler.zero;

import java.util.ArrayList;
import java.util.List;

public class TenSummationOfPrimes {

	public static void main(String[] args) {
		
		List<Long> listOfPrimes = new ArrayList<Long>();
		listOfPrimes.add(2L);//Only even prime
		//Integer countOfPrimes = 1;
		Long sqrt = 1L;
		sqrt = sqrt + 1;
		//Long div = 2L;
		//Boolean flag = false;
		Long sum = 2L;
		
		for (Long i = 3L; i < 2000000; i=i+2) {
			sqrt = (long) Math.sqrt(i);
			sqrt = sqrt + 1;
			for (Long div : listOfPrimes) {
				if(div >= sqrt){
					listOfPrimes.add(i);
					sum = sum + i;
					/*countOfPrimes++;
					if(countOfPrimes == 10001){
						flag = true;
						break;
					}*/
					break;
				}
				if(i % div == 0){
					break;
				}
			}
			/*if(flag){
				System.out.println(i);
				break;
			}*/
		}
		System.out.println(sum);

	}

}
