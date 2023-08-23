package oopl;
import java.util.*;
class Factorial{  
	
	int factorial(int n){    
	  if (n == 0)    
	    return 1;    
	  else    
	    return(n * factorial(n-1));    
	 }    
	 
	public static void main(String args[]){  
	  int fact=1;
	  System.out.print("Enter the number : ");
	  Scanner sc=new Scanner(System.in);
	 // String input = sc.nextLine();
	//  int number = Integer.parseInt( input );
	  int number = sc.nextInt();
	  sc.close();
	  Factorial facto =new Factorial();
	  fact = facto.factorial(number);   
	  System.out.println("Factorial of "+number+" is : "+fact);    
	 }  
	} 