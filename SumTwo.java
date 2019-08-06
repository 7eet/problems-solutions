import java.util.stream.*;
import java.util.*;
//Write a program that, given an array A[] of n numbers and another number x, determines whether or not there exist two elements in S whose sum is exactly x. 


public class SumTwo{

	static boolean  flag = true;

    private static void input(int[] arry, int target){
	for(var i=0;i<arry.length;i++){
	    for(var j=i+1;j<arry.length;j++){
	if( (arry[i] + arry[j]) == target){
		
			flag = true;

		    System.out.format("Indexes are %d and %d \tValues are %d and %d respectively.%n",i,j,arry[i],arry[j]);
 		    break;
		}else{
		    continue;
 		} 
		
	    }
	    	
	    if(flag){
	    	break;
	    }
	    continue;
 	}
	
     }

    
    public static void main(String[] args){
 	int[] ar = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
 	int tar = 7;
 	input(ar,tar);
 	System.out.println("Done");
    }
}
