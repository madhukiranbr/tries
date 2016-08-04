import java.util.Comparator;
import java.util.PriorityQueue;


public class sort_preserve_order {

	public sort_preserve_order() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={
				"-100",
				"50",
				"0",
				"56.6",
				"90",
				"0.12",
				".12",
				"02.34",
				"000.000"};
		int n=9;
        //Write your code here
        int length=s.length;
        for(int i=0;i<n;i++){
            double max = Double.parseDouble(s[i]); 
            for(int j=i+1;j<n;j++){
                //System.out.println(j);
                double elem = Double.parseDouble(s[j]);
                //System.out.println("Comparing "+max +" with "+ elem);
                if(max < elem) {
                    String tmp = s[i];
                    s[i] = s[j];
                    //s[j] = tmp;
                    //do shift by one
                    for(int k=j;k>i;k--){
                        s[k]=s[k-1];
                        if(k==i+1){
                            s[k]=tmp;
                        }
                    }
                    max = Double.parseDouble(s[i]);
                    //elem = Double.parseDouble(s[j]); 
                }
                /*else if( max == elem){
                   int pos_max = -1;
                   int pos_elem = -1;
                   for(int ix=0;ix< n;ix++){
                       if (s[ix].equals(s[i])){
                           pos_max=ix;    
                       }
                       if (s[ix].equals(s[j])){
                           pos_elem=ix;    
                       }
                   }
                   if(pos_elem < pos_max){
                      String tmp = s[i];
                      s[i] = s[pos_elem];
                      s[pos_elem] = tmp;
                      // should not matter
                      max = Double.parseDouble(s[i]);
                      //elem = Double.parseDouble(s[pos_elem]); 
                    }
                       /*else if(pos_max < pos_elem ){
                          String tmp = s[i];
                          s[i] = s[pos_max];
                          s[pos_max] = tmp;                           
                       }//end of comment
                    
                 }*/
             }
          }
        
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
        VowelComparator v = new VowelComparator();
        PriorityQueue<Integer> pq= new PriorityQueue<>(10,v );
        pq.add(new Integer(4));
        pq.add(new Integer(5));
        pq.add(new Integer(6));
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        
	}

}

class VowelComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if (o1>o2){
		return 1;
		}
		else if(o1 < o2){
			return -1;
		}
		return 0;
	}
}

