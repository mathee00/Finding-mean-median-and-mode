package mean_medium_mode;

import java.util.Scanner;

public class Final_solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N, sum = 0;
		
		double mean = 0;
		double median = 0;
		int mode = 0;
		int temp = 0;
		
		try (Scanner sc = new Scanner(System.in)) {                   //by this try{} method it removes the yellow warning
			System.out.print("Number of elements in array : \n");
			N = sc.nextInt();
			
			int a[] = new int[N];       //Creating and array with N number of elements
			
			System.out.print("Enter all the elements: \n");
			
			for(int i = 0; i < N; i++)
			{
			    a[i] = sc.nextInt();
			    sum = sum + a[i];
			}
			
			//Calculating the mean of array a.
	        mean = (double)sum / (double)N;
	        
			
	        //Sorts array in ascending order
			for (int i = 0; i < a.length; i++) {
		    	for (int j = i + 1; j < a.length; j++) {
		    	
		    		if(a[i] > a[j]) {
		    		
		    			temp = a[i];
		    			a[i] = a[j];
		    			a[j] = temp;
		    		}	
		    	}
		    }
		    
		    System.out.println();
		    
		    System.out.println("Modified array to ascending order : ");
		    
		    for(int i = 0; i < a.length; i++) {
		    	System.out.println(a[i] + " ");
		    }
		    
		    
			if((N % 2) == 1) {
				median = a[(N/2) % 10];
			}
			else {	
				int x = a[((N/2) - 1)];      //x and y is the 2 middle points of the array
				int y = a[(N/2)] ;
				
				median = (double)(x + y) / (double)2;							
			}
			
			
			
			
			//array fr will store frequencies of element  
	        int [] fr = new int [a.length];  
	        int visited = -1;  
	        
	        for(int i = 0; i < a.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < a.length; j++){  
	                if(a[i] == a[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    fr[j] = visited;  
	                }  
	            }  
	            if(fr[i] != visited)  
	                fr[i] = count;  
	        }  
	        
	        //Displays the frequency of each element present in array  
	        System.out.println("---------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------");  
	        for(int i = 0; i < fr.length; i++){  
	            if(fr[i] != visited)  
	                System.out.println("    " + a[i] + "    |    " + fr[i]);  
	        }  
	        System.out.println("---------------------");  
	    
		    
		    
		    //Finds the Mode of the array by finding the highest frequency
	        int max1 = fr[0];
	        int max2 = a[0];
	        
	        for(int k = 1; k < fr.length; k++) {
	        	if (fr[k] > max1) {
	        		max2 = a[k];
	            }
	        }
	        
	        mode = max2;
		}

//        System.out.printf("Mean: %.1f %n", mean);
//        
//        System.out.printf("Median: %.1f %n", median);
//        
//        System.out.println("Mode = "+mode);
		
        System.out.printf("%.1f %n", mean);
        
        System.out.printf("%.1f %n", median);
        
        System.out.println(mode);
	}

}
