package ArrayConcept;

import java.util.Arrays;

public class BasicArray {
	
	 public static void main(String[] args) {
		 
	   int num[]= new int[5];
	   num[0]= 20;
	   num[1]= 30;
	   num[2]= 200;
	   num[3]= 300;
	   num[0]=56;
	  
	   Arrays.asList(num);
	   
	   System.out.println(num[0]);
	   int t= num.length;
	   System.out.println(t);
	   
	   /* for(int p=0;p<t;p++) {                     
		  
		  System.out.println(num[p]);
	  }
	  */
	   
	   for(int l:num) {
		   System.out.println(l);
	   }
	 }
	 }