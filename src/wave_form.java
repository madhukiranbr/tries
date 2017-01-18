import java.util.ArrayList;
import java.util.Collections;

public class wave_form {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	    ArrayList<Integer> res = new ArrayList<>();
	    Collections.sort(a);
	    int i=0;
	    while (true){
	        if(i < a.size() ) {
	            int n1 = a.get(i);
	            int n2 = 0;
	            boolean n2_present = false;
	            if (i+1 < a.get(i+1)){
	            	n2 = a.get(i+1);
	            	n2_present = true;
	            }
	            if(n2_present){
	            	res.add(n2);
	            }
	            res.add(n1);
	            i=i+2;
	        }
	        else {
	            break;
	        }
	    }
	    return res;
	}
	public static void main(String [] args){
		ArrayList<Integer> res = new ArrayList<>();
		res.add(1);
		res.add(2);
		res.add(3);
		res.add(4);
		wave_form wf = new wave_form();
		System.out.println(wf.wave(res));
	}
}
