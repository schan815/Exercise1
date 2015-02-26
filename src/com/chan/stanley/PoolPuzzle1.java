package com.chan.stanley;

public class PoolPuzzle1 {
	public static void main(String[]args){
		int x = 0;
		while (x < 4){					
			System.out.print("a");		
			if (x < 1){					//don't change, given
				System.out.print(" ");
			}
			System.out.print("n");		
			if(x > 1){
				System.out.print(" oyster");
				x = x + 2;
			}
			if(x == 1){					//don't change, given
				System.out.print("noys");
			}
			if(x < 1){
				System.out.print("oise");
			}
			System.out.println("");		//don't change, given
			x = x + 1;
		}
	}

}
