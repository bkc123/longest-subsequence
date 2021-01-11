package longestSubSequence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class AlternativeWaysToSolveLongestSubSequence extends SequenceAndLongestIncSubSequence {
	
	Stack <Integer> preStack= new Stack<>();
	Integer finalLongestArr[];
	ArrayList<Integer[]> longestArr1 ;
	SequenceAndLongestIncSubSequence obj= new SequenceAndLongestIncSubSequence();

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
			this.longestArr1.add(longestArr);
			while(!stack.isEmpty()) {
				stack.pop();
			}
		}
		for (int i=0; i< this.longestArr1.size(); i++) {
			Integer [] arrIndex= this.longestArr1.get(i);
		
			int l= arrIndex.length;
			System.out.println("\nlength of "  +i+ " index is : " + l);
			for(Integer p : arrIndex) {
			System.out.println(p);
			}
			System.out.println("**************************************");
			
			if (len <l) {
				len= l;
				this.finalLongestArr= arrIndex;
			}
			
		}
		
		System.out.println("\nlongest length of possible increasing sub sequence is: "+ len );
		return finalLongestArr;

	}

}
