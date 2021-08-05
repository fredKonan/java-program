package com.techelevator;

import java.util.ArrayList;
import java.util.List;


public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {
		List<String> newArray = new ArrayList<String>();
		if(stringArray.length>0){
			for(String string : stringArray){
				newArray.add(string);
			}
		}
		else
			return null;
		return newArray;
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		String [] container = new String [stringList.size()];
		for(int i=0; i<stringList.size();i++){
			container[i]=stringList.get(i);
		}
		return container;
	}

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */
	public List<String> no4LetterWords(String[] stringArray) {
		List <String> keyArray = new ArrayList<String>();
		for(String keys: stringArray) {
			if (keys.length() != 4)
				keyArray.add(keys);
		}
		return keyArray;
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		List <Double> numbers = new ArrayList<Double>();
		for(int number : intArray){
			numbers.add((double)number/2);
		}
		return numbers;
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 64362
	 */
	public Integer findLargest(List<Integer> integerList) {
		int maxNumber =0;
		for(int value: integerList){
			if(value>maxNumber)
				maxNumber = value;
		}
		return maxNumber;
	}

	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List<Integer> oddNumbers = new ArrayList<Integer>();
		for(int number: integerArray){
			if(number%2!=0){
				oddNumbers.add(number);
			}
		}
		return oddNumbers;
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 23, 44, 2, 88, 44], 44) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		int count =0;
		for(int number : integerList){
			if(number ==intToFind)
				count= count +1;
		}
		if(count >=2)
			return true;
		return false;
	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	must be replaced by the String "Fizz", any multiple of 5 must be replaced by the String "Buzz",
	and any multiple of both 3 and 5 must be replaced by the String "FizzBuzz."
	** INTERVIEW QUESTION **

	fizzBuzzList( {1, 2, 3} )  ->  ["1", "2", "Fizz"]
	fizzBuzzList( {4, 5, 6} )  ->  ["4", "Buzz", "Fizz"]
	fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  ["7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

	HINT: To convert an Integer x to a String, you can use x.toString() in your code. For example, if x = 1, then x.toString() returns "1."
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		List <String> fizBuzz = new ArrayList<String>();
		for( int number : integerArray){
			if(number %3==0 && number%5 ==0){
				fizBuzz.add("FizzBuzz");
			}
			else if(number% 5==0){
				fizBuzz.add("Buzz");
			}
			else if(number% 3==0){
				fizBuzz.add("Fizz");
			}
			else{
				fizBuzz.add(Integer.toString(number));
			}
		}
		return fizBuzz;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		List<Integer> finalList = new ArrayList<Integer>();
		if(listOne.size()==listTwo.size()){
			for(int i =0; i<listOne.size();i++){
				finalList.add(listOne.get(i));
				finalList.add(listTwo.get(i));
			}
		}
		else if(listOne.size()>listTwo.size()){
			for(int i=0;i<listTwo.size();i++){
				finalList.add(listOne.get(i));
				finalList.add(listTwo.get(i));
			}
			for(int i=listTwo.size();i<listOne.size();i++){
				finalList.add(listOne.get(i));
			}

		}
		else{
			for(int i=0;i<listOne.size();i++){
				finalList.add(listOne.get(i));
				finalList.add(listTwo.get(i));
			}
			for(int i=listOne.size();i<listTwo.size();i++){
				finalList.add(listTwo.get(i));
			}
		}
		return finalList;
	}

}
