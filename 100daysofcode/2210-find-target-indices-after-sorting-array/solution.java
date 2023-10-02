class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int start =0;
        int end = nums.length-1;
        int ans1=0;
        int ans2=0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]==target){
                ans1=mid;
                end = mid-1;
            }
        }

        start =0;
        end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]==target){
                ans2 = mid;
                start = mid+1;
            }
        }

        while(ans1<=ans2){
            if(nums[ans1]==target){
              arr.add(ans1);
            }
            
            ans1++;
        }

        return arr;
    }
}
