package longestSubSequence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class SequenceAndLongestIncSubSequence {
	
	int [] arr;
	
	// methods to initialize array size and fill up with int inputs
	public int [] populateArray(int num) {
		arr = new int [num];
		for (int i =0; i< arr.length; i++) {
			int number = (int) (Math.random()*100 + 1);
			arr[i] =number;
		}
		return arr;
	}
	
	// methods to printArray
	public void printArray (int [] arr) {
		System.out.print("\n[ ");
		for (int i: arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
	
	
	public Integer[] findLongestIncreasingSubSequence(int [] arr) {
		List <Integer[]> subArray = new ArrayList<> ();
		Stack<Integer> stack = new Stack<> ();
		//go through the items in array
		for (int i =0; i< arr.length; i++ ) {
			Integer num = arr[i];
			if (stack.empty()) {
				stack.push(num);
				continue;
			}
			Integer preNum = stack.peek();
			
			if (preNum <num) {
				stack.push(num);
			}
			boolean l= (i == arr.length -1);
			if (preNum >= num || l ) {
				subArray.add(toArray(stack));
				stack.push(num);
			}
		}
		
		return longestSubSequence(subArray);
	}
	
	//
	public Integer[] longestSubSequence(List<Integer[]> outArr) {
		TreeMap <Integer, Integer[] > height = new TreeMap<>();
		for (Integer[] insideArr: outArr) {
			height.put(insideArr.length, insideArr);
		}
		return height.lastEntry().getValue();
	}
	
	// methods to change stack entries into array
	protected Integer[] toArray(Stack <Integer> stack){
		
		// create an array size equal of input stack size
		Integer[] subArray = new Integer[stack.size()];
		int i = stack.size()-1;// last index to be assign 
		// for your subArray since you will doing pop() for stack
		
		//declare and assign the items popping it from input stack
		Integer itemsInStack= stack.pop();
		// condition to stop while loop
		while(itemsInStack != null){
			subArray[i] = itemsInStack;
			try {
				itemsInStack = stack.pop();
			}catch(EmptyStackException e) {
				break;
			}
			
			i--; // decrement your index for subArray
		}
		return subArray;
			
	}
}
