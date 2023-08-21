package com.raghib.sort;

//Write a program to find largest and smallest element of array at particular location.

/**
*
 * Input: int intArray[] = {4,1,9,10,99,2};
 * Output:
Descending sort
3 Largest Element is 9
99 10 9 4 2 1 
Ascending sort
3 Smallest Element is 4
1 2 4 9 10 99 
*/ 

public class FindLargestAndSmallestElementOfArrayAtParticularPosition {
	
	public static void FindTheLargest(int intArray[]) {	
		
		int temp;
		int position = 3;
		
		for(int i = 0; i < intArray.length-1; i++) {
			for(int j = i+1; j < intArray.length; j++) {
				//For Descending order sort
				if(intArray[i] < intArray[j]) {
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}				
			}
			if(i == position-1) {
				System.out.println(position +" Largest Element is "+intArray[i]);
				//break;
			}
		}		
		//For Display
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println("");
	}
	
	public static void FindTheSmallest(int intArray[]) {	
		
		int temp;
		int position = 3;
		
		for(int i = 0; i < intArray.length-1; i++) {
			for(int j = i+1; j < intArray.length; j++) {
				//For Ascending order sort
				if(intArray[i] > intArray[j]) {
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}				
			}
			if(i == position-1) {
				System.out.println(position +" Smallest Element is "+intArray[i]);
				//break;
			}
		}	
		
		//For Display
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int intArray[] = {4,1,9,10,99,2};
		System.out.println("Descending sort");
		FindTheLargest(intArray);
		System.out.println("Ascending sort");
		FindTheSmallest(intArray);
		
	}
}
