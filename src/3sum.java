package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class three_sum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		//Leave room for i+1
		for(int i = 0; i < nums.length -2 ;i++) {
			//similar to binary search, start at both ends
			int l = i+1;
			int r = nums.length -1;
			while(l < r) {
				if (nums[i] + nums[l] + nums[r] == 0) {
					Integer[] arr = {nums[i], nums[l], nums[r]};
					Arrays.sort(arr);
					List<Integer> lst = Arrays.asList(arr);
					res.add(lst);
					// break will not detect subsequent conditions input : [-2, 0 ,1, ,1,2] : expected: [[-2,0,2],[-2,1,1]] op: [[-2,0,2]]
					//break;
				}

				if (nums[i] + nums[l] + nums[r] > 0) {
					r = r - 1;
				}
				else {
					l = l + 1;
				}
			}
		}
		List<List<Integer>> value = new ArrayList<List<Integer>>(); 
		value.addAll(res); 
		return value;

	}
}
