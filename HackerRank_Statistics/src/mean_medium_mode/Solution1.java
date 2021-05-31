package mean_medium_mode;

//This program finds the mean of the array
//This program is used in Final_solution.java file



import java.text.DecimalFormat;       //This import is used to, DecimalFormat class
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N, sum = 0;
		
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
		}
		
        double medium = (double)sum / (double)N;
        
        System.out.println("Sum:"+sum); 

        System.out.printf("Mean: %.1f %n", medium);
        
        //Below code is another method to round up numbers to 2 decimal places
        //This method uses the DecimalFormat class
//        DecimalFormat df = new DecimalFormat("###.##");
//        System.out.println(df.format(medium));
	}

}
