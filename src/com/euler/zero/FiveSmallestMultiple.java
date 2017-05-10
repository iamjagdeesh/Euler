package com.euler.zero;

public class FiveSmallestMultiple {

	public static void main(String[] args) {
		
		for(int i=20; ;i=i+20){
			if(i % 19 == 0){
				if(i % 18 == 0){
					if(i % 17 == 0){
						if(i % 16 == 0){
							if(i % 15 == 0){
								if(i % 14 == 0){
									if(i % 13 == 0){
										if(i % 12 == 0){
											if(i % 11 == 0){
												System.out.println(i);
												break;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
