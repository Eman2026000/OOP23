package org.howard.edu.lsp.hw5;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author @ Aeman Almotairi (@02959924)
 *
 */

public class IntegerSetTest {
	
	IntegerSet set;
	
	@BeforeEach
	protected void setUp() {
		set = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for IntegerSet default constructor.")
	public void testIntegerSet() {
		assertEquals(set.length(), 0, "The length of the must be 0 when initialized");
	}

	
	
	
	@Test
	@DisplayName("Test case for clear method")
	public void testClear() {
		set.add(1);
		assertEquals(set.length(), 1, "Adding item to integer set must increment the length.");
		set.add(2);
		assertEquals(set.length(), 2, "Adding item to integer set must increment the length.");
		set.clear();
		assertEquals(set.length(), 0, "Clearing the IntegerSet must set the length of the IntegerSet to 0");
		assertTrue(set.isEmpty(), "isEmpty must return true after clearing.");
	}
	
	@Test
	@DisplayName("Test case for length method")
	public void testLength() {
		assertEquals(set.length(), 0, "Must return the current length of the IntegerSet.");
		set.add(1);
		assertEquals(set.length(), 1, "Adding item to integer set must increment the length.");
	}
	

	@Test
	@DisplayName("Test case for equals method")
	public void testEquals() {
		
		IntegerSet temp = new  IntegerSet();
		set.add(1);
		set.add(2);
		set.add(3);
		temp.add(1);
		temp.add(2);
		temp.add(3);
		assertTrue(set.equals(temp), "Two IntegerSets having same elements must be equal.");
	}
	
	@Test
	@DisplayName("Test case for contains method")
	public void testContains() {
		assertFalse(set.contains(1), "Empty IntegerSet must return False for any call to contains method.");
		set.add(1);
		assertTrue(set.contains(1), "Must return True when calling with the integer number added to the IntegerSet.");
	}
	
	@Test
	@DisplayName("Test case for largest method")
	public void testLargest() throws IntegerSetException {
		Throwable exception = assertThrows(IntegerSetException.class, () -> {set.largest();});
		assertNotNull(exception.getMessage());
		
		set.add(1);
		assertEquals(set.largest(), 1, "Must return the largest element of the IntegerSet.");
		set.add(4);
		assertEquals(set.largest(), 4, "Must return the largest element of the IntegerSet.");
		set.add(2);
		assertEquals(set.largest(), 4, "Must return the largest element of the IntegerSet.");
	
	}
	
	
	@Test
	@DisplayName("Test case for smallest method")
	public void testSmallest()  throws IntegerSetException {
		
		Throwable exception = assertThrows(IntegerSetException.class, () -> {set.smallest();});
		assertNotNull(exception.getMessage());
		
		
		set.add(2);
		assertEquals(set.smallest(), 2, "Must return the smallest element of the IntegerSet.");
		set.add(4);
		assertEquals(set.smallest(), 2, "Must return the smallest element of the IntegerSet.");
		set.add(1);
		assertEquals(set.smallest(), 1, "Must return the smallest element of the IntegerSet.");
	}
	

	@Test
	@DisplayName("Test case for add method")
	public void testAdd() {
		set.add(1);
		assertTrue(set.contains(1), "IntegerSet must contain the added element.");
		assertEquals(set.length(), 1, "Adding Element to IntegerSet must increment Length.");
		
		set.add(2);
		assertTrue(set.contains(2), "IntegerSet must contain the added element.");
		assertEquals(set.length(), 2, "Adding Element to IntegerSet must increment Length.");
		
		set.add(2);
		assertTrue(set.contains(2), "IntegerSet must contain the added element.");
		assertEquals(set.length(), 2, "Adding Duplicate Element must keep the length of IntegerSet same.");
	}
	
	
	@Test
	@DisplayName("Test case for remove method")
	public void testRemove() {
		set.add(1);
		set.add(2);
		set.add(3);
		
		set.remove(1);
		assertFalse(set.contains(1), "IntegerSet must not contain the removed element.");
		assertEquals(set.length(), 2, "Removing Element to IntegerSet must decrement Length.");
		
		set.remove(2);
		assertFalse(set.contains(2), "IntegerSet must not contain the added element.");
		assertEquals(set.length(), 1, "Adding Element to IntegerSet must increment Length.");
		
		set.remove(2);
		assertEquals(set.length(), 1, "Removing non existing element must keep the length of IntegerSet same.");
	}
	
	@Test
	@DisplayName("Test case for union method")
	public void testUnion() {
		
		
		IntegerSet resultSet = new  IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		resultSet.add(1);
		resultSet.add(2);
		resultSet.add(3);
		resultSet.add(4);
		resultSet.add(5);
		set2.add(4);
		set2.add(5);
		set2.add(1);
		set2.add(2);
		
		set.union(set2);
		
		assertTrue(set.equals(resultSet), "Union of two IntegerSets must perform union operation of two sets.");
	}
	
	@Test
	@DisplayName("Test case for intersect method")
	public void testIntersect() {
		
		
		IntegerSet resultSet = new  IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		resultSet.add(1);
		resultSet.add(2);
		set2.add(4);
		set2.add(5);
		set2.add(1);
		set2.add(2);
		
		set.intersect(set2);
		
		assertTrue(set.equals(resultSet), "Intersection of two IntegerSets must replace the current elements of the set with common elements between two sets.");
	}
	
	@Test
	@DisplayName("Test case for Diff method")
	public void testDiff() {
		
		
		IntegerSet resultSet = new  IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		resultSet.add(3);
		resultSet.add(4);
		resultSet.add(5);
		
		set2.add(4);
		set2.add(5);
		set2.add(1);
		set2.add(2);
		
		set.diff(set2);
				
		assertTrue(set.equals(resultSet), "Difference of two IntegerSet must remove the elements that is common to the set2 from the first set.");
	}
	
	@Test
	@DisplayName("Test case for toString method")
	public void testToString() {
		IntegerSet set2 = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		assertTrue(set.toString() instanceof String, "must return the setList as String");

		assertEquals(set.toString(), set2.toString());
		
		set.add(4);
		set2.add(4);
		assertEquals(set.toString(),set2.toString());

	}

}