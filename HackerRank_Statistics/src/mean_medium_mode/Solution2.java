package mean_medium_mode;

//This program finds the median of the array (By sorting the array in to descending order)
//This program is used in Final_solution.java file

import java.util.Arrays;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N;
		
		double median = 0;
		int temp = 0;
		
		try (Scanner sc = new Scanner(System.in)) {                   //by this try{} method it removes the yellow warning
			System.out.print("Number of elements in array : \n");
			N = sc.nextInt();
			
			int a[] = new int[N];       //Creating and array with N number of elements
			
			System.out.print("Enter all the elements: \n");
			
			for(int i = 0; i < N; i++)
			{
			    a[i] = sc.nextInt();
			   // sum = sum + a[i];
			}
			
			System.out.println("Original array : ");
			
		    for (int i = 0; i < a.length; i++) {
		    	System.out.println(a[i] + " ");
		    }
	
		    
		    
   //Method 01  -  sort array in ascending order
		    //Below 2 line are used to sort the array in ascending order.
		    //In this method a separate class  "Array.java"  is used
//		    Arrays.sort(a);
//		    System.out.printf("Modified array to descending order : %s %n", Arrays.toString(a));
		    
		    
   //Method 02  -  sort array in descending order
		    for (int i = 0; i < a.length; i++) {
		    	for (int j = i + 1; j < a.length; j++) {
		    	
		    		if(a[i] < a[j]) {
		    		
		    			temp = a[i];
		    			a[i] = a[j];
		    			a[j] = temp;
		    		}	
		    	}
		    }
		    
		    System.out.println();
		    
		    System.out.println("Modified array to descending order : ");
		    
		    for(int i = 0; i < a.length; i++) {
		    	System.out.println(a[i] + " ");
		    }
		    
		    
   //I used this 2 lines to see if the sorted array (which has even number of elements),
  //returns the correct middle numbers from the sorted array.
		    System.out.println("The first array element  :- "+a[((N/2) - 1)]);
			System.out.println("The second array element  :- "+a[(N/2)]);
			System.out.println("======================================");
		    
			if((N % 2) == 1) {
				System.out.println(N);
				System.out.println("Array is odd");
				
				System.out.println("The point : "+(N/2) % 10);
				System.out.println();
				System.out.println("The array element  - "+a[(N/2) % 10]);
				System.out.println("==============================");
				
				median = a[(N/2) % 10];
				
//				System.out.println("Median of array = "+a[(N/2) % 10]);
			}
			else {
				System.out.println(N);
				System.out.println("Array is even");
				
				System.out.println("The first point : "+((N/2) - 1));
				System.out.println("The second point : "+(N/2));
				System.out.println();
				System.out.println("The first array element  - "+a[((N/2) - 1)]);
				System.out.println("The second array element  - "+a[(N/2)]);
				System.out.println("==============================");
				int x = a[((N/2) - 1)];
				int y = a[(N/2)] ;
				
				System.out.println(x);
				System.out.println(y);
				
				 median = (double)(x + y) / (double)2;
				//System.out.println("Median of array = " +median);
				
				 
				//System.out.printf("Median of array = %.1f %n", total);
				
		    
		    //Below lines dosen't give the expected output
		    //Therefore a separate variable (total) is used.
				//System.out.println("Median of array = "+((a[((N/2) - 1)] + a[(N/2)]) / 2));				
				//System.out.printf("Median of array = %.1f %n", (a[((N/2) - 1)] + a[(N/2)]) / 2);

				
			}
			
			System.out.printf("Median of array = %.1f %n", median);
		}
		
		
	}

}
