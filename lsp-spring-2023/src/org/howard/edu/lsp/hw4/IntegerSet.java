package org.howard.edu.lsp.hw4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class IntegerSet {
/* member variable */
	
	ArrayList<Integer> integerset;
	  
	
	  /* construct a new empty IntegerSet object */
	  public IntegerSet() {
			this.integerset = new ArrayList<Integer>();

	  }

	  /* Removes all values  */
		public void clear() {
			this.integerset.clear();
			
		}
		/*Returns length of the set*/
		public int length() {
			return this.integerset.size();
			
		}
		
		
		/* Returns true if the set contains the exact same values*/
		public boolean equals(IntegerSet set2) {
			boolean equalto = true;
			for (Integer i : this.integerset) {
				if(set2.contains(i) == false) {
					equalto = false;
				}
				
			}
			return equalto;
			
		}
		
		
		/* Returns true if the value exists in the set */

		public boolean contains(int value) {
			return this.integerset.contains(value);
			
		}
		
		
		/* Returns the maximum value in the set */
		public Integer largest() throws IntegerSetException {
			
			if (this.integerset.isEmpty()) {
				throw new IntegerSetException("Integer set is empty");
			}
			return Collections.max(this.integerset);
			
		}
		
		
		/* Returns the minimum value in the set */
		public Integer smallest() throws IntegerSetException {
			if (this.integerset.isEmpty()) {
				
				throw new IntegerSetException("Integer set is empty");
			}
			return Collections.min(this.integerset);
			
		}
		
		/* Adds the item to the set*/
		public void add(Integer item) {
			
			if(this.integerset.contains(item)) {
				return;
			}
			this.integerset.add(item);
			
		}
		
		/* Removes the item from the set */
		public void remove(Integer item) {
			if(this.integerset.contains(item) == false) {
				return;
			}
			this.integerset.remove(Integer.valueOf(item));
			
		}
		
		/* Finds the union of the sets */
		public void union(IntegerSet set2) {
			
			ArrayList<Integer> array = new ArrayList<Integer>();
			array = set2.toArrayList();

			HashSet<Integer> unionSet = new HashSet<Integer>();
			unionSet.addAll(array);
			unionSet.addAll(this.integerset);
			
			this.integerset.clear();
			this.integerset.addAll(unionSet);

		}
		
		/* Finds the intersection of the sets */
		public void intersect(IntegerSet set2) {
			
			ArrayList<Integer> intersect = new ArrayList<Integer>();
			
			for (Integer i : this.integerset) {
				if(set2.contains(i)) {
					intersect.add(i);
				}
				
			}
			this.integerset = intersect;
			
		}
		
		/* Finds the difference of the sets */
		public void diff(IntegerSet set2) {
			
			ArrayList<Integer> diff = new ArrayList<Integer>();
			
			for (Integer i : this.integerset) {
				if(set2.contains(i) == false) {
					diff.add(i);
				}
			}
			for (Integer i : set2.toArrayList()) {
				if(this.integerset.contains(i) == false) {
					diff.add(i);
				}
			}
			this.integerset = diff;
			
		}
		
		/* Returns true if the set is empty */
		public boolean isEmpty() {
			
			return this.integerset.isEmpty();
			
		}
		
		
		/* Converts the set into a string.
		 */
		public String toString() {
		
			return this.integerset.toString();
			
		}
		
		
		/* Converts the set into an ArrayList.*/
		public ArrayList<Integer> toArrayList() {
			
			
			return this.integerset;
			
		}
		
		/* Adds the elements of an ArrayList to the set */
		public void addAll(ArrayList<Integer> arr) {
			
			this.integerset.addAll(arr);
		}
		
	

}
