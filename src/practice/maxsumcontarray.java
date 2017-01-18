package practice;

public class maxsumcontarray {
	    public int maxSubArray(int[] nums) {
	        if(nums == null || nums.length == 0)
	            return Integer.MIN_VALUE;
	            
	        int []sum = new int[nums.length];
	        int maxsum;// = Integer.min;
	        sum[0] = nums[0];
	        maxsum = sum[0];
	        for(int i=1;i<nums.length;i++){
	            sum[i] = Math.max(sum[i-1]+nums[i], maxsum);
	            maxsum = Math.max(sum[i], maxsum);
	        }
	        return maxsum;
	    }
}

