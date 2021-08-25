package com.techelevator;
import java.util.*;
import java.io.*;
public class FizzWriter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the destination file? ");
		String fileName = input.nextLine();

		try(PrintWriter dataOutPut = new PrintWriter(fileName)){
			for (int i = 1; i <=300; i++) {
				if(i%3==0 && i%5==0){
					dataOutPut.println("FizzBuzz");
				}
				else if(i%3==0 || Integer.toString(i).contains("3")){
					dataOutPut.println("Fizz");
				}
				else if(i%5==0 || Integer.toString(i).contains("5")){
					dataOutPut.println("Buzz");
				}
				else
					dataOutPut.println(i);
			}
		}
		catch (FileNotFoundException ex){
			System.err.println("File is not writable");
		}

	}

}
