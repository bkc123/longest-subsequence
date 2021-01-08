package longestSubSequence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class AlternativeWaysToSolveLongestSubSequence extends SequenceAndLongestIncSubSequence {
	//int[] arr3=  { 10,22,9,33,21,50,41,60,80};
	Stack <Integer> preStack= new Stack<>();
	Integer[] longestArr1= new Integer[preStack.size()] ;
	//Stack <Integer> myLongestStack= new Stack<>();
	SequenceAndLongestIncSubSequence obj= new SequenceAndLongestIncSubSequence();

	//int stackSize= preStack.size();

	public Stack <Integer> subSequence(int [] arr) {
		//System.out.println("\nsize of the previous stack is: "+longestStack.size()+ '\n');
		Integer[] longestArr;
		Stack <Integer> preStack= new Stack<>();
		Stack<Integer> stack = new Stack<> ();
		for (int k=0; k < arr.length; k++) {
			int j =k;
			//System.out.println('\n');
			stack.push(arr[j]);
			//System.out.println(stack.peek());
			for (int i = k; i < arr.length-1 ; i++) {
				//j= i;
				if (arr[j] < arr[i+1]){
					stack.push(arr[i+1]);
					//System.out.println(stack.peek());
					j= i+1;		
				}	

			}
			
			//System.out.println("size of the stack is: "+ stack.size());
			longestArr= new Integer[stack.size()];
			longestArr= obj.toArray(stack);

			//System.out.println("size of the previous array is: "+ longestArr1.length);
			//System.out.println("size of the current array is: "+ longestArr.length);
			if (longestArr1.length <longestArr.length) {
				longestArr1= longestArr;

				for (Integer each: longestArr)
				{
					System.out.println(each + " ");
				}
			}
			
			while(!stack.isEmpty()) {
				stack.pop();
			}
		}

		return preStack;

	}

}
