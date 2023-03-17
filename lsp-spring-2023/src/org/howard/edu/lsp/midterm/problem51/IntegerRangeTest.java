package org.howard.edu.lsp.midterm.problem51;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import org.howard.edu.lsp.hw5.IntegerSetException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author @ Aeman Almotairi (@02959924)
 *
 */


public class IntegerRangeTest {
	
	@BeforeEach
	protected void setUp() {
		Range range = new IntegerRange(1, 10);
		
	}
	
	
	@Test
	@DisplayName("Test case for Contains")
	
    public void testContains() {
		Range range = new IntegerRange(1, 10);
        assertTrue(range.contains(3));
        assertTrue(range.contains(5));
        assertTrue(range.contains(7));
        assertFalse(range.contains(30));
        assertFalse(range.contains(12));
    }
	
	@Test
	@DisplayName("Test case for overlap")
	 public boolean testoverlaps() throws EmptyRangeException {
		Throwable exception = assertThrows(IntegerSetException.class);
		assertNotNull(exception.getMessage());
		
		
		Range range1 = new IntegerRange(1, 10);
		 
		if (range1  == null) {
	            throw new EmptyRangeException();
	        }
	        int otherLower = ((IntegerRange)range1 ).getLower();
	        int otherUpper = ((IntegerRange)range1 ).getUpper();
	        
	        return (10 <= otherLower && 20 >= otherUpper) ||
	                (10 >= otherLower&& 10 <= otherUpper) ||
	                (otherLower <= 12 && otherUpper >= 1);
	    }
		
	


	private Throwable assertThrows(Class<IntegerSetException> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test
	@DisplayName("Test case for size")
	 public int testsize() {
	        return 10 - 2 + 1;
	    }
}
