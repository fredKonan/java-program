package com.techelevator;
import java.util.*;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.print("Enter a series of Earth weights (space-separated): ");
		int we1= input.nextInt();
		int we2= input.nextInt();
		int  we3= input.nextInt();
		System.out.println(we1+" lbs. on Earth, is "+(int)(we1*0.378)+" lbs. on Mars");
		System.out.println(we2+" lbs. on Earth, is "+(int)(we2*0.378)+" lbs. on Mars");
		System.out.println(we3+" lbs. on Earth, is "+(int)(we3*0.378)+" lbs. on Mars");

	}

}
