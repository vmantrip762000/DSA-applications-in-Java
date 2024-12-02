class SplitArray {
    public int splitArray(int[] nums, int k) {

        int start = 0;
        int end = nums.length - 1;

        for(int i = 0; i < nums.length; i++){

            start = Math.max(start, nums[i]);
            end += nums[i];

        }

        while(start < end){

            //try for middle as potential answer
            int mid = start + (end - start)/2;

            int sum = 0;
            int pieces = 1;
            for(int num:nums){

                if(sum + num > mid){

                    //So you cannot exceed this mid value.
                    //If the mid value is exceeded you will make a new array.
                    pieces++;
                    sum = num;

                } else{
                    sum += num;
                }
            }

            if(pieces > k){

                start = mid + 1;

            } else{
                end = mid;
            }
        }

        return end;
        
    }
}
