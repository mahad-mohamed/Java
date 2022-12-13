

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Arrays Lab task methods.
 *
 * @author your name here
 * @version 2021-05-20
 */
public class ArrayTest {

    /**
     * Tests arrays.
     *
     * @param args unused default parameter
     */
    public static void main(final String[] args) {
	System.out.println("Task 1");
	System.out.println(ArrayTest.task1());
	System.out.println("Task 2");
	System.out.println(ArrayTest.task2());
	System.out.println("Task 3");
	System.out.println(ArrayTest.task3());
	System.out.println("Task 4");
	System.out.println(ArrayTest.task4());
	System.out.println("Task 5");
	System.out.println(Arrays.toString(ArrayTest.task5()));
    }

    /**
     * Print the contents of the arrays first and second using a standard for loop.
     *
     * @return true if second contains the same values as first, false otherwise
     */
    public static boolean task1() {
	final int[] first = { 1, 3, 5, 7, 9 };
	final int[] second = first;

	System.out.println("Values in first:");

	  for (int i = 0; i < first.length; i++) {
	      System.out.println(first[i]);
	  }
	  System.out.println("Values in second:");

	  for (int i = 0; i < second.length; i++) {
	      System.out.println(second[i]);
	      if(first[i] != second[i]) {
			  return false;
	  }
	  // return true; - or - return false;
	  }
	  return true;
	  }
	
    

    /**
     * Double the contents of the array first with a standard for loop.
     *
     * @return true if second contains the same values as first, false otherwise
     */
    public static boolean task2() {
	final int[] first = { 1, 3, 5, 7, 9 };
	final int[] second = first;
	
	 System.out.println("Values in first: ");
	 
	for (int i= 0; i < first.length; i++) {
		first[i]= first[i]*2;
		System.out.println(first[i]);
	 }
	
   
    
    System.out.println("Values in second : ");
    for (int i= 0; i < second.length; i++)  {
    	System.out.println(second[i]);
    	if(first[i] != second[i]) {
    		return false;
      }
    	
      }
    
    return true;
    
    }
    


    /**
     * Double the contents of the array first with an enhanced for loop.
     *
     * @return true if the values in first are permanently changed, false otherwise
     */
    public static boolean task3() {
    	final int[] first = { 1, 3, 5, 7, 9 };

    	// your code here
    	 System.out.println("Values in first:");
    	 
    	for (int i : first) {
    		i= i * 2;
    		System.out.println(i);
//    		 if(first[i] != second[i]) {
    			  return true;
    		 }
    	  // return true; - or - return false;
         return false;
    	  }

    /**
     * Attempt to assign the array first to a row of the 2D array third.
     *
     * @return true if this is allowed, false otherwise
     */
    public static boolean task4() {
    	final int[] first = { 1, 3, 5, 7, 9 };
    	final int[][] third = new int[2][first.length];
    	third[0] = first;
        for (int i : third[0]) {
           
            System.out.println(i);
            return true;
        }
    	return false;
       
    }
    
    public static Integer[] task5() {
	final ArrayList<Integer> values = new ArrayList<>();

	// your code here

    }
}