class Solution {
public int missingNumber(int[] nums) {
	   int numb= 0;
	    int n= nums.length;
	    int sum= n*(n+1)/2;
	    System.out.println(sum);
	    Arrays.sort(nums);
		/*
		 * if (nums[0]==0) { n= nums.length; System.out.println(n); sum = n * (n + 1) /
		 * 2; System.out.println(sum);
		 * 
		 * }
		 */
	    
	   for(int num:nums)
	   { 
		   numb+=num;


	   }
       
	return (sum-numb);
	  
	        
	    }

	      public static void main(String[] args)
	    {
	      int[] nums= {1,2,3,4,6,7,8,9};
	     
	      Solution sol= new Solution();
	      int missingnum=sol.missingNumber(nums);
	      System.out.println(missingnum);
	      
	    }
	}
