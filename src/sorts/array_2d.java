package sorts;

import java.util.ArrayList;
import java.util.Arrays;

public class array_2d {

	static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());
        
            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
                //B.get(i).set(index, element)
            }
        }
        return B;
	}
	
	static ArrayList<Integer> performOps2(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
                B.set(i, A.get(i));
                B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
}
	

 public static void main(String[] args){
	 ArrayList<ArrayList<Integer>> group = new ArrayList<>();
	 ArrayList<Integer> ar =new ArrayList<>();
	 for(int i=1;i<5;i++)
		 ar.add(i);
	 group.add(ar);
	 ar = new ArrayList<>();
	 for(int i=5;i<9;i++)
		 ar.add(i);
	 group.add(ar);
	 
	 ar = new ArrayList<>();
	 for(int i=9;i<13;i++)
		 ar.add(i);
	 
	 group.add(ar);
	 ArrayList<ArrayList<Integer>> B = performOps(group);
	 for (int i = 0; i < B.size(); i++) {
	     for (int j = 0; j < B.get(i).size(); j++) {
	            // System.out.print(B.get(i).get(j) + " ");
	     }
	 }
	 
	 ArrayList<Integer> ar1 =new ArrayList<>();
	 ar1.add(5);ar1.add(10);ar1.add(2);ar1.add(1);
	 ArrayList<Integer> c =new ArrayList<>();
	 
	 c = performOps2(ar1);
	 for (int i = 0; i < c.size(); i++) {
	         System.out.print(c.get(i) + " ");
	 }

 }
}