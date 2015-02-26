package com.chan.stanley;

public class Exercise1b1 {

	public static void main(String[] args){
		int x =1;
		while (x < 10) {
			x = x + 1; // this line changing the value of int x was not defined so the function would have no output
			if (x > 3) {
				System.out.println("big x");
			}
		}
	}
}




