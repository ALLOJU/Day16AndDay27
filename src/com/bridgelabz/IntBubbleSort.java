package com.bridgelabz;

public class IntBubbleSort {

	/**
	 * sorting array elements in ascending order using bubble sort
	 * @param array- input array to perform sorting
	 */
	private static void intBubbleSort(int[] array) {
		
		  int temp = 0;  
	      for(int i=0;i<array.length;i++)
	      {
	    	  for(int j=1;j<array.length - i;j++)
	    	  {
	    		  if(array[j-1]>array[j])
	    		  {
	    			  temp=array[j-1];
	    			  array[j-1]=array[j];
	    			  array[j]=temp;
	    		  }
	    	  }
	      }
	}
	/**
	 * display array elements
	 * @param array-input array for sorting
	 */
	private static void printArray(int[] array) {
		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
		}
		System.out.println();
		
	}

	/**
	 * Main method to performing bubble sort for integer array
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]= {12,3,15,4,2};
		System.out.println("before sorting array");
		printArray(array);
		System.out.println("After sorting array");
		intBubbleSort(array);
		printArray(array);

	}
}
