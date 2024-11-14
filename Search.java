package Java_Oops;

import java.util.Scanner;

public class Search {
	public static void main(String[] args) {
		System.out.println("Enter your Array_Size");
	       
	       Scanner sc = new Scanner (System.in);
	              int size = sc.nextInt();
	              int numbers[] = new int[size];
	        
	        // input 
	              System.out.println("Enter your Elements Of Array");
	        for (int i=0; i<size; i++) {
	        	numbers[i]=sc.nextInt();
	        	
	        }
	          System.out.println("Search your Elements in Array");
	        int x = sc.nextInt();
	        
	        // out put
	          
	        
	        for(int i=0; i<numbers.length; i++) {
	        	if(numbers[i]==x) {
	        	System.out.println("X found at index : " + i);
	        }
		}

	}
	}

	


