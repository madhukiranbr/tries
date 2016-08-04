import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            for (int nu=0;nu<T;nu++) {
            	//System.out.println("run "+nu);
                int n=sc.nextInt();
                int m=sc.nextInt();
                //System.out.println(n+"|"+m);
                int[] a= new int[n];
                for (int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                int loc=-1;
                for(int i=0;i<a.length;){
                    if(i == loc){
                        System.out.println("NO");
                        break;
                    }
                    int fwd=0;
                    int rev=0;                    
                    if (i>=n-1||i+1>n-1||i+m>n-1){
                        System.out.println("YES");
                        break;
                    }
                   
                    if(a[i+1]==0 || a[i+m]==0){
                    	if (i>loc)
                    	  loc=i;
                        if(a[i+m]==0) i=i+m;
                        else i++;
                        fwd=1;
                    }
                    /*else if(a[i+m]==0){
                    	if (i>loc)
                    	  loc=i;
                        i=i+m;
                        fwd=1;
                    }*/
                    if(i!=0 && a[i-1]==0 && fwd==0 ){
                    	if (i>loc)
                          loc=i;
                        i--;
                        rev=1;
                    }

                    if(fwd==0 && rev==0){
                        System.out.println("NO");
                        break;
                    }
                    //System.out.println(i+" is the value");        
                }
                //System.out.println("NO");
            }
    }
    
    
}

/* inet 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static int[] A;
public static   int m;
public static int n;
public static boolean[] visitedArray;
private static boolean result=false;
public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   int T = sc.nextInt();
   for (int c_i = 0; c_i < T; c_i++) {

       n = sc.nextInt();
       A= new int[n];
       visitedArray= new boolean[n];
       Arrays.fill(visitedArray,false);
       m = sc.nextInt();
       for (int n_i = 0; n_i < n; n_i++) {
           A[n_i]= sc.nextInt();
       }
       int temp =0;
       result=false;
       isPossible(temp);
       if(result) System.out.println("YES");
       else System.out.println("NO");
   }

}
private static void isPossible( int i) {
   if(i>n || i+m >= n || i==n-1){
       result =true;
       return; 
   }
   if(visitedArray[i] == true){
       return;
   }
   visitedArray[i]= true;
   if (i+1 < n && A[i+1]==0){
       isPossible(i+1);            
   }
   if (i-1>=0 && A[i-1]==0){
   isPossible(i-1);
   }
   if(i+m < n && A[i+m]==0){
       isPossible(i+m);
   }
}
}
*/