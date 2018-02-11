// My solution to the HackerRank.com problem "Jumping On The Clouds."
// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem

import java.util.Arrays;
import java.util.Scanner;

public class JumpinOnTheCloudsApp {
    static int jumpingOnClouds(int[] c) {
    	
    	System.out.println("Array c = "+ Arrays.toString(c));
    	
    	int result = 0;
    	int i = 0;
    	for(i = 0; i < (c.length-2); i++) {
    		result++;
    		if( c[i + 2] != 1) {
    			i++; 
    		}
    	}

    	if(i == c.length - 2) {
    		result++;
    	}

    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of clouds, n (integer 2-25): "); 
        int n = in.nextInt();
        int[] c = new int[n];
        c[0]= 0;
        c[n-1]=0;
        System.out.println("Note: The value for the first cloud (#0) and last cloud (#n-1) is always zero.");
        for(int c_i = 1; c_i < (n-1); c_i++){
            System.out.print("Enter a '0'('normal cloud') or '1' ('thounder cloud') for cloud #"+ (c_i)+": "); 
            c[c_i] = in.nextInt();
        }
        int result = jumpingOnClouds(c);
        System.out.println(result);
        in.close();
    }
}
