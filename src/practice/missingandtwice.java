package practice;

import java.util.ArrayList;
import java.util.List;

public class missingandtwice {
		// DO NOT MODIFY THE LIST
		public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		    int last = a.size();
		    ArrayList<Integer> res = new ArrayList<>();
		    int osum = 0;
		    int oprod = 1;
		    int nsum = 0;
		    int nprod = 1;
		    for(int i=1;i<=last;i++) {
		    	osum = osum+i;
		    	oprod = oprod*i;
		    	nsum = nsum + a.get(i);
		    	nprod = nprod * a.get(i);
		    }
		    
		    return res;
		}
		
		public ArrayList<Integer> flip(String A) {
			ArrayList<Integer> res = new ArrayList<>();
			char[] ip = A.toCharArray();
			boolean all1 = true;
			for (int i=0;i<ip.length;i++){
				int v = ip[i] - '0';
				if(v == 0) all1 = false;
			}
			if (all1) return res;
			
			for(int i=1; i <= ip.length;i++){
				
			}
			
		    return res;
		}
}
