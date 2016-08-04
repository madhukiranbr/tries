import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class second_least_common {

	public second_least_common() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=6;
		int []arr= {1,2,3,4,5,6,7,89,1,2,3,4,56,7,8,9,77,77,77,77,44,44,44,};
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean available =hash.containsKey(new Integer(arr[i]));
			if(available){
				int val =hash.get(new Integer(arr[i]));
				hash.put(new Integer(arr[i]), new Integer(++val));
			}
			else {
				hash.put(new Integer(arr[i]), new Integer(1));
			}
			
		}
		//System.out.println(hash);

	    HashMap<Integer,ArrayList<Integer>> sortedMap = new HashMap<>();

	    for (Map.Entry<Integer,Integer> entry : hash.entrySet())
	    {
	    	Boolean b = sortedMap.containsKey(entry.getValue());
	    	if (b){
	    		ArrayList<Integer> a =sortedMap.get(entry.getValue());
	    		a.add(new Integer(entry.getKey()));
	    		
	    		sortedMap.put(entry.getValue(),a);
	    	}
	    	else{
	    		ArrayList<Integer> a = new ArrayList<>();
	    		a.add(new Integer(entry.getKey()));
	    		sortedMap.put(entry.getValue(),a);
	    	}
	    	
	    }
	    System.out.println(sortedMap);
        for (int key :sortedMap.keySet()) 
        	if(--k==0) 
        	System.out.println(sortedMap.get(key));

}

}
