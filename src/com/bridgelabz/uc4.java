package com.bridgelabz;
import java.util.Random;
public class uc4 {

	
		static int[] check(int pos)
		{
			Random r = new Random();
			int option = r.nextInt(3);
			int[] ans = new int[2];
			int die = r.nextInt(6);
			System.out.println("Original Position : "+pos);
			System.out.println("Number on Die : "+(die+1));
			switch((option+1))
			{
	    		case 1:
	    			pos = pos + 0;
	    			break;
	    			
	    		case 2:
	    			pos = pos + (die+1);
	    			break;
	    			
	    		case 3:
	    			pos = pos - (die+1);
	    			break;
	    			
	    		default:
	    		    break;
			}
			ans[0]=die;
			ans[1]=pos;
			return ans;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int pos = 0,b=0;
			int[] a = new int[2];
			while(pos <= 100)
			{
				a = check(pos);
				pos = a[1];
				b = a[0];
			}
			System.out.println("Final Position : "+pos);
			if(pos>100)
			{
				pos = pos - b - 1;
			}
			
			System.out.println("POSITION SHOULD BE : "+pos);
	}

}
