package com.euler.zero;

public class FourLargestPalindromeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer largePalin = 0;
		Integer palin = 0;
		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				palin = i*j;
				if(checkPalindrome(palin) && (palin) > largePalin){
					largePalin = palin;
				}
			}
		}
		System.out.println(largePalin);

	}
	
	public static Boolean checkPalindrome(Integer number){
		
		Integer rem = 0;
		Integer revNum = 0;
		Integer num = number;//Just to keep a copy as it gets changed in the loop
		
		while(number > 0){
			rem = number % 10;
			number = number / 10;
			revNum = revNum * 10 + rem;
		}
		if(num.equals(revNum)){
			return true;
		}else{
			return false;
		}
		
	}

}
