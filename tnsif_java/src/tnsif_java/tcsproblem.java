package tnsif_java;

public class tcsproblem {
	

	    public static void main(String[] args) {

	        int[] scores = {49, 68, 53, 98, 63, 72, 84};

	        int a = 0, b = 0, c = 0, d = 0, e = 0, fail = 0;

	      	       for ( int i =0 ; i<scores.length; i++){
      	     int score = scores[i]; 
	      	     if (score >=90 && score<=100) {
	      	    	 a++;
	      	     }
	      	     else if (score>=80) {
	      	    	 b++;
	      	     }
	      	     else if (score>=70) {
	      	    	 c++;
	      	     }
	      	     else if (score>=60) {
	      	    	 d++;
	      	     }
	      	     else if (score>=50) {
	      	    	 e++;
	      	    	 
	      	     }
	      	     else if (score<49 && score >0) {
	      	    	 fail++;
	      	     }
	      	       }
	      	     System.out.println("Grade Count");
	      	     System.out.println("A:"+a);
	      	   System.out.println("B:"+b);
	      	 System.out.println("C:"+c);
	      	System.out.println("D:"+d);
	      	System.out.println("E:"+e);
	      	System.out.println("Fail:"+fail);
	    
	    
	      	      int max = a;
	      	      if (b>max) {
	      	    	max=b;	   
	      	      }
	      	      if (c >max ) {
	      	      
	      	     max= c;
	      	      }
	      	      
	      	      if ( d>max ) {
	      	    	  max=d;
	      	      }
	      	      if (e>max) {
	      	    	  max=e;
	      	      }
	      	      if(fail>max) {
	      	    	  max=fail;
	      	    	  
	      	      }
	      	      
	      	      
	    
	    if (a==max) {
	    	System.out.println("Highest grade is: A");
	    }
	    else if (b==max) {
	    	System.out.println("Highest grade is:B");
	    }
	    else if (c==max) {
	    	System.out.println("Highest grade is:C");
	    }
	    else if (d==max) {
	    	System.out.println("Highest grade is:D");
	    }
	    else if (e==max) {
	    	System.out.println("Highest grade is:E");
	    }
	    else {
	    	System.out.println("Highest grade is: Fail");
	    }
}}