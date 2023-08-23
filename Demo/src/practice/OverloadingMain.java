package practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

		 public class OverloadingMain {
		  
		     public static void main(String[] args) {
		    	 int n,m,q1,q2,i,j;
		    	 int [][] a=new int [20][50];
		    	 Scanner sc =new Scanner(System.in);
		        n=sc.nextInt();
		        for ( i=0;i<n;i++){
		            m=sc.nextInt();
		            for( j=0;j<m;j++){
		                a[i][j]=sc.nextInt();
		            }        
		        }
		       int  q=sc.nextInt();
		        for( i=0;i<q;i++){
		            q1=sc.nextInt();
		            q2=sc.nextInt();
		            try{
		                System.out.println(a[q1][q2]);
		            }
		            catch(ArrayIndexOutOfBoundsException e){
		                System.out.println("ERROR!");
		            }
		        }}}
		     
