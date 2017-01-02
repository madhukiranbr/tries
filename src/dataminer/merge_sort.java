package dataminer;

import java.util.Arrays;

public class merge_sort {
	public merge_sort()
	{
		
	}
	public static void main(String [] args){
		Integer[] arr = {213,24,3,44,52,4,45,4,2,534,532,1};
		mergesort(arr);
	}
	static void mergesort(Integer[] alist){
		if(alist.length > 1) {
			int mid = alist.length /2;
			Integer [] lower = new Integer[mid];
			Integer [] higher= new Integer[alist.length - mid];
			int i=0,j=0,k=0;
			for(i=0;i<alist.length;i++){
				if(i < mid){
					lower[j] = alist[i];
					j++;
				}
				else{
					higher[k] = alist[i];
					k++;
				}
			}
			mergesort(lower);
			mergesort(higher);
			//System.out.println(Arrays.toString(lower) );
			//System.out.println(Arrays.toString(higher) );
			
			i=0;j=0;k=0;
			while(j<lower.length && k<higher.length){
				if(lower[j] < higher[k]){
					alist[i] = lower[j];
					i++;
					j++;
				}
				else{
					alist[i] = higher[k];
					i++;
					k++;
				}
			}
			
			while(j<lower.length){
				alist[i] = lower[j];
				i++;
				j++;
			}
			while(k<higher.length) {
				alist[i] = higher[k];
				i++;
				k++;
			}
		}
		System.out.println(Arrays.toString(alist));
	}
}
