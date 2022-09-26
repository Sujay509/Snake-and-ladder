package com.bridgelabz;
import java.util.Random;
public class uc3 {

	public static void main(String[] args) {
		Random r = new Random();
		int pos = 10;
		int option = r.nextInt(3);
		int die = r.nextInt(6);
		System.out.println("Original Position : "+pos);
		System.out.println("Number on Die : "+(die+1));
		switch((option+1))
		{
    		case 1:
    			System.out.println("No Play");
    			break;
    			
    		case 2:
    			System.out.println("Ladder");
    			pos = pos + (die+1);
    			break;
    			
    		case 3:
    			System.out.println("Snake");
    			pos = pos - (die+1);
    			break;
    			
    		default:
    		    System.out.println("Something went wrong!!");
    		    break;
		}
		
		System.out.println("Current Position : "+pos);
	}

}
