package org.howard.edu.lsp.midterm.problem51;
/**
 * 
 * @author @ Aeman Almotairi (@02959924)
 *
 */

public interface Range {
	
	/* returns true if v is ≥ lower bound and ≤ upper bound, and false otherwise  */
    public boolean contains(int value);
    
    /*  returns true if the receiver contains at least 
    one value in common with other, and false otherwise */
    public boolean overlaps(Range other) throws EmptyRangeException;
    
    /* returns the number of integers in the range*/
    public int size();
    
}