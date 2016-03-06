/**
 * NchooseK
 *
 * @author David Liu
 *
 */

import java.util.*;
import java.lang.*;

public class NchooseK{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		
		while(input.hasNextInt()){
			if(input.hasNextInt()){
				input1 = input.nextInt();
				if(input.hasNextInt()){
					input2 = input.nextInt();
				}
			}
			System.out.println(nCk(input1, input2));
		}
	}
    
	private static long nCk(int n, int k){
        if(k > n-k){
            k = n-k;
		}
		/* Checks for symtery between the nominator and denominator */
        long b=1;
        for(int i=1, m=n; i<=k; i++, m--){
            b = b*m/i;
		}
        return b;
    }
}