package longestSubSequence;

import java.util.Stack;

public class LongestIncreasingSubSequence {

	public static void main(String[] args) {
		
		longestSequence();

		
	}

	public static void longestSequence() {
		SequenceAndLongestIncSubSequence myObj= new SequenceAndLongestIncSubSequence();
		AlternativeWaysToSolveLongestSubSequence myObj1= new AlternativeWaysToSolveLongestSubSequence();
		
		int [] numbers = {2,3,4,6,1,9,12,14,16,37,99,98,97,10,13,11,67,4,5,3,0,-1,3,6,8,100,111,-6,3,8};
		int [] arr1st = {10,22,9,33,21,50,41,60,80};
		int [] myArr= myObj.populateArray(15);
		
		
		System.out.print("numbers array is: \n");
		myObj.printArray(numbers);
		//testing class AlternativeWays.... 
		Integer[] longestArr1 =   myObj1.subSequence(numbers);
		System.out.println("\nHere is possible longest increasing subSequence of numbers: \n");
		System.out.print("[ ");
		for (Integer each: longestArr1) {
			System.out.print( each+ " ");
			}
		System.out.print("]");
		System.out.println("\n\n##################################################\n");
		
		
		System.out.print("arr1st array is: \n");
		myObj.printArray(arr1st);
		Integer[]  longestArr2=   myObj1.subSequence(arr1st);
		System.out.println("\nHere is possible longest increasing subSequence of arr1st: \n");
		System.out.print("[ ");
		for (Integer each: longestArr2) {
		System.out.print(each + " " );
		}
		System.out.print("]");
		System.out.println("\n\n##################################################\n");
		
		System.out.print("Auto generted myArr is: \n");
		myObj.printArray(myArr);
		Integer[] longestArr3 =   myObj1.subSequence(myArr);
		System.out.println("\nHere is possible longest increasing subSequence of myArr: \n");
		System.out.print("[ ");
		for (Integer each: longestArr3) {
		System.out.print( each + " ");
		}
		System.out.print("]");
		
		//testing class SequenceAndLongest....
		System.out.println("\n\n##################################################\n");
		Integer [] result1 = myObj.findLongestIncreasingSubSequence(numbers);
		System.out.println("Here is my longest sub Sequence of numbers: ");
		System.out.print("[ ");
		for (Integer i: result1) {

			System.out.print(i+ " ");

		}
		System.out.print("]");
		
		System.out.println("\n\n##################################################\n");
		Integer [] result2 = myObj.findLongestIncreasingSubSequence(arr1st);
		System.out.println("\nHere is my longest sub Sequence of arr1st");
		System.out.print("[ ");
		for (Integer i: result2) {

			System.out.print(i+ " ");

		}
		System.out.print("]");
		
		System.out.println("\n\n##################################################");
		Integer [] result3 = myObj.findLongestIncreasingSubSequence(myArr);
		System.out.println("\nHere is my longest sub Sequence of auto generated myArr: ");
		System.out.print("[ ");
		for (Integer i: result3) {

			System.out.print(i+ " ");

		}
		System.out.print("]");
	
	}
}
