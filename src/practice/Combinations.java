package practice;

import java.util.ArrayList;

public class Combinations {
    private StringBuilder output = new StringBuilder();
    private final String inputstring;
    public Combinations( final String str ){
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
    }
    
    
    public static void main (String args[])
    {
        System.out.println("");
        System.out.println("");
        System.out.println("All possible combinations are :  ");
        System.out.println("");
        System.out.println("");
        System.out.println(combine(3, "111".toCharArray()));
    }
    
    
    private static ArrayList<Integer> combine(int len, char[] ip ){
    	ArrayList<Integer> ar = new ArrayList<>();
    	int max = count_1(ip);
    	for(int i=0;i<len-1;i++){
    		for(int j=i;j<len;j++){
    			 System.out.println((i+1)+","+(j+1));
    			int value = count_1(flip(i,j,ip));
    			if( value > max){
    				max = value;
    				ar.add(i+1);
    				ar.add(j+1);
    			}
    			
    			
    		}
    	}
    	return ar;
    	
    }


	private static int count_1(char[] flipped) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<flipped.length;i++)
		{
			if(flipped[i] == '1') {
				count++;
			}
		}
		return count;
	}


	private static char[] flip(int i, int j, char[] ip) {
		// TODO Auto-generated method stub
		if (ip[i] == '0') ip[i] = '1'; else ip[i] = '0';
		if (ip[j] == '0' && i!= j) ip[j] = '1'; else ip[j] = '0';
		System.out.println(ip);
		return ip;
	}
} 