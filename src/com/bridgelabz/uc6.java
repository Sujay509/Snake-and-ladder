package com.bridgelabz;
import java.util.Random;
public class uc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random ra = new Random();
		
		int pos = 0, max = 100, c, r=0, na, count=0;
		while( pos != max)
	    {
	        na = ra.nextInt(6);
	        int n = na+1;
	        System.out.println("Number on Die : "+(n));
	        c = ra.nextInt(3);
	        count++;
	        if(pos>100)
	        {
	            pos = pos - r;
	        }
	        
	        else if(pos <0)
	        {
	        	pos = pos + r;
	        }
	        
	        else{
	                switch(c+1)
	                {
	                    case 1:
	                    	// STAY
	                        break;
	                        
	                    case 2:
	                    	//	LADDER                   	
	                        pos = pos + n;
	                        r = n;
	                        break;
	                    
	                    case 3:
	                    	//	 SNAKE                   	
	                        pos = pos - n;
	                        r = n;
	                        break;
	                    
	                    default:
	                    	System.out.println("SOMETHING WENT WRONG !");
	                        break;
	                }
	        }
	        System.out.println("CURRENT POSITION : "+pos);
	        System.out.println();
	    }
		
		System.out.println("TOTAL TIMES DIE WAS THROWN : "+count);
		System.out.println("PLAYER WON !!");
	}

}
