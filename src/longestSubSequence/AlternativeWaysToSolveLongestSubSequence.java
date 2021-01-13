package longestSubSequence;


import java.util.ArrayList;

import java.util.Stack;


public class AlternativeWaysToSolveLongestSubSequence extends SequenceAndLongestIncSubSequence {
	
	Stack <Integer> preStack= new Stack<>();
	Integer finalLongestArr[];
	ArrayList<Integer[]> longestArr1 ; // declare the arrayList  of the array to record all the increasing subarray 
	// && to find the length of the each array within the list
	SequenceAndLongestIncSubSequence obj= new SequenceAndLongestIncSubSequence();

	// method to find the possible longest subArray from the array
	public Integer[] subSequence(int [] arr) {
		this.longestArr1= new ArrayList<Integer[] >(arr.length);
		Integer[] longestArr;
		int len = 0;
		Stack<Integer> stack = new Stack<> ();
		for (int k=0; k < arr.length; k++) {
			int j =k;
			stack.push(arr[j]);
			for (int i = k; i < arr.length-1 ; i++) {
			
				if (arr[j] < arr[i+1]){
					stack.push(arr[i+1]);
					j= i+1;		
				}	

			}
		
			longestArr= new Integer[stack.size()];
			longestArr= obj.toArray(stack);
			// add the Integer[] in to the longestArr
			this.longestArr1.add(longestArr);
			while(!stack.isEmpty()) {
				stack.pop();
			}
		}
		// loop to find the longest possible subsequence 
		for (int i=0; i< this.longestArr1.size(); i++) {
			Integer [] arrIndex= this.longestArr1.get(i);
		
			int l= arrIndex.length;
			/*System.out.println("\nlength of "  +i+ " index is : " + l);
			System.out.print("[");
			for(Integer p : arrIndex) {
			System.out.print( " " + p);
			}
			System.out.print(" ]");
			System.out.print("\n**************************************");
			*/
			if (len <l) {
				len= l;
				this.finalLongestArr= arrIndex;
			}
			
		}
		
		System.out.println("\nlongest length of possible increasing sub sequence is: "+ len );
		return finalLongestArr;

	}

}
