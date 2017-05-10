package com.euler.zero;

public class NineSpecialPythagoreanTriplet {

	public static void main(String[] args) {
		
		Boolean found = false;
		
		for (int i = 499; ; i--) {
			for (int j = i-1; j > i/2; j--) {
				Integer k = 1000 - (i + j);
				Double c2 = Math.pow(i, 2);
				Double b2 = Math.pow(j, 2);
				Double a2 = Math.pow(k, 2);
				if(c2 == (a2 + b2)){
					System.out.println(i*j*k);
					found = true;
					break;
				}
			}
			if(found){
				break;
			}
		}

	}

}
