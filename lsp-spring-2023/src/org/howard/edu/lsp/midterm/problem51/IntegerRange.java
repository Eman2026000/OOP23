package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range {

    private int lower;
    private int upper;

    
    /*Constructor*/
    
    public IntegerRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }
    
    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }
    
    @Override
    public boolean contains(int value) {
        return value >= lower && value <= upper;
    }

    @Override
    public boolean overlaps(Range other) throws EmptyRangeException {
    	
        if (other == null) {
            throw new EmptyRangeException();
        }
        int otherLower = ((IntegerRange)other).getLower();
        int otherUpper = ((IntegerRange)other).getUpper();
        
        return (lower <= otherUpper && upper >= otherLower) ||
                (lower >= otherLower && upper <= otherUpper) ||
                (otherLower <= upper && otherUpper >= lower);
    }

    @Override
    public int size() {
        return upper - lower + 1;
    }
    
}