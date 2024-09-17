package Strog;

import java.util.Random;

public class Randomno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<= 5; i++)
		{
        double x =  Math.random()*10;
         System.out.println(x);
		}
		Random r = new Random();
		int  y = r.nextInt(150);
		//r.nextInt(100)
		System.out.println(y);
		
		
	}

}
