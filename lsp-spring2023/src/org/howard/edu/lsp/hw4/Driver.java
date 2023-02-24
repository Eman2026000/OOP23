package org.howard.edu.lsp.hw4;

import java.util.Arrays;



/**
 * 
 * @author @ Aeman Almotairi (@02959924)
 *
 */


public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(10);
		set2.add(20);
		set2.add(30);
		
		set3.add(1);
		set3.add(2);
		set3.add(3);
		
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Value of Set3 is: " + set3.toString());
		
		
	
		set1.remove(3);
		System.out.println("Value of Set1 after removing 3 is: " + set1.toString());
		set1.clear();
		System.out.println("Value of Set1 after clear is: " + set1.toString());
		System.out.println("Set1 is empty: " + set1.isEmpty());
		
		
		
		System.out.println(" ");
		
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Length of Set2 is: " + set2.length());
		System.out.println("Set2 contains 5 is: " + set2.contains(5));
		System.out.println("Set2 contains 20 is: " + set2.contains(20));
		System.out.println("Set2 maximum: " + set2.largest());
		System.out.println("Set2 minimum: " + set2.smallest());
		
		
		System.out.println(" ");
		
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("Value of Set3 is: " + set3.toString());
		System.out.println("Set2 equals Set3: " + set2.equals(set3));
		System.out.println("Set2 equals Set1: " + set2.equals(set1));
		System.out.println("Set1 equals Set3: " + set1.equals(set3));
		
		
		
		System.out.println(" ");

	try
    {
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("The largest value in Set1 is " + set1.largest());
    }
	
	catch(IntegerSetException ex)
    {
        System.out.println("IntegerSetException: Integer set is empty");
    }
	try
    {
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("The smallest value in Set1 is " + set1.smallest() );
    }
     
    catch(IntegerSetException ex)
    {
        System.out.println("IntegerSetException: Integer set is empty");
    }

	
	System.out.println(" ");
	
	
	try
    {
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("The largest value in Set2 is " + set2.largest());
        
    }
	
	catch(IntegerSetException ex)
    {
        System.out.println("IntegerSetException: Integer set is empty");
    }
	try
    {
		System.out.println("Value of Set2 is: " + set2.toString());
		System.out.println("The smallest value in Set2 is " + set2.smallest() );
      
    }
     
    catch(IntegerSetException ex)
    {
        System.out.println("IntegerSetException: Integer set is empty");
    }
	
	
	System.out.println(" ");
	System.out.println("value of Set2 is:" + set2.toString());
	System.out.println("Value of Set3 is:" + set3.toString());

	set2.union(set3);
	
	System.out.println("Union of Set2 and Set3 " + set2.toString());
	
	set1.add(1);
	set1.add(2);
	set1.add(3);
	
	System.out.println(" ");
	System.out.println("value of Set1 is:" + set1.toString());
	System.out.println("Value of Set3 is:" + set3.toString());
	set1.intersect(set3);
	System.out.println("Set1 intersect set 3 is " + set1.toString());
	
	System.out.println(" ");
	System.out.println("value of Set1 is:" + set1.toString());
	System.out.println("Value of Set2 is:" + set2.toString());
	set1.diff(set2);
	System.out.println("set1 is different from set2 " + set1.toString());
	
	
}
	
	
	
}

