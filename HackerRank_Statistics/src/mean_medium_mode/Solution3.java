package mean_medium_mode;

import java.util.Scanner;

//This program finds the number of occurrences of all the elements in the array. 
// And Finds the mode
//This program is used in Final_solution.java file

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialize array   
       // int [] a = new int [] {1, 2, 8, 3, 2, 2, 6, 5, 1};
		
		int [] a = new int [] {1, 2, 8, 6, 3, 8, 6, 5, 3};
		
//			int N;
//		
//	    	Scanner sc = new Scanner(System.in);              
//			System.out.print("Number of elements in array : \n");
//			N = sc.nextInt();
//			
//			int a[] = new int[N];       //Creating and aay with N number of elements
//			
//			System.out.print("Enter all the elements: \n");
//			
//			for(int i = 0; i < N; i++)
//			{
//			    a[i] = sc.nextInt();
//			    //sum = sum + a[i];
//			}
		
		
			
			
			//Sort array in ascending order
	        int temp = 0;
	        
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
		    
		    System.out.println("Modified array to descending order : ");
		    
		    for(int i = 0; i < a.length; i++) {
		    	System.out.println(a[i] + " ");
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
        
        for(int k = 1, l = 0; (k < fr.length) && (l < a.length); k++, l++) {
        	if (fr[k] > max1) {
        		max1 = fr[k];
        		max2 = a[k];
            }
        	else if(fr[k] == max1){
        		System.out.println("Similar frequencies : "+max1);
        		//System.out.println(a[l]);    		
        	}
        }
        
        System.out.println("Largest frequency : "+max1);
        System.out.println("Mode = "+max2);
	}

}
