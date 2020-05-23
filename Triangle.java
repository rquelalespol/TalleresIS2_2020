package Talleres;
import java.util.Scanner;

public class Triangle {
	 public static void main(String[] parametro) {
			int a = 0;
			int b = 0;
			int c = 0;
			int match = 0;
	        System.out.println("Enter 3 integers which are sides of a triangle");
	    	Scanner reader = new Scanner(System.in);
	    	a = reader.nextInt();
	    	b = reader.nextInt();
	    	c = reader.nextInt();
	    	if ( a == b ) {
	    		match = match + 1; 
	    	}
	    	if ( a == c ) {
		    	match = match + 2; 
		    	}
	    	if ( b == c ) {
		    	match = match + 3; 
		    	}
	    	
	    	if ( match == 0 ) {
		    	if (( b + c ) <= a ) {
			        System.out.println("Not a Triangle");
		    	}else {
		    		if (( a + c ) <= b ) {
				        System.out.println("Not a Triangle");
			    		}else{
					        System.out.println("Scalene");
				    		}
			        }			        
		    	}else{
			    	if ( match == 1 ) {
				    	if (( a + c ) <= b ) {
					        System.out.println("Not a Triangle");
				    	}else {
					        System.out.println("Isosceles");
					        }					        
			    	}else{
				    	if ( match == 2 ) {
					    	if (( a + c ) <= b ) {
						        System.out.println("Not a Triangle");
					    	}else {
						        System.out.println("Isosceles");
						        }	
				    	}else{
					    	if ( match == 3 ) {
						    	if (( b + c ) <= a ) {
							        System.out.println("Not a Triangle");
						    	}else {
							        System.out.println("Isosceles");
							        }	
					    	}else {
						        System.out.println("Equilateral");
						        }
				    	}	
			    	}	
		    	}	
 	}	
}	

