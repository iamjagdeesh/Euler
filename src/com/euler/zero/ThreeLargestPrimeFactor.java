package com.euler.zero;

public class ThreeLargestPrimeFactor {

	public static void main(String[] args) {
		
		Long number = 600851475143L;
		Long factor = 2L;
		Long lastFactor = 1L;
		
		//Since 2 is the only even prime, check in the beginning, so v can jump 2 places like (3,5,7,9..)
		if(number % 2 == 0){
			number = number / 2;
			lastFactor = 2L;
			while(number % 2 == 0){
				number = number / 2;
			}
		} else{
			lastFactor = 1L;
		}
		
		factor = 3L;
		Long maxFactor = (long) Math.sqrt(number);
		while(number > 1 && factor <= maxFactor){
			if(number % factor == 0){
				number = number / factor;
				lastFactor = factor;
				while(number % factor == 0){
					number = number / factor;		
				}
				maxFactor = (long) Math.sqrt(number);
			}
			factor = factor + 2;			
		}
		if(number == 1){
			System.out.println("Largest Prime factor = "+lastFactor);
		}else{
			System.out.println("Largest Prime factor = "+number);
		}
		

	}
	
	public static Boolean checkPrime(Long number){
		
		Integer sqrt = (int) Math.sqrt(number);
		sqrt = sqrt + 1;
		Integer div = 2;
		
		while(div <= sqrt){
			if(number % div == 0){
				return false;
			}
			div++;
		}
		
		return true;
	}

}
