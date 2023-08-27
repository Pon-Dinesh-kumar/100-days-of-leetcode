class Solution {
public:
    vector<int> moveZeroes(vector<int>& nums) {
        int n=nums.size();
        int l=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                l=i;
                break;
            }
        }
        if(l==-1) return nums;
        for(int j=l+1;j<n;j++){
            if(nums[j]!=0){
                swap(nums[j],nums[l]);
                l++;
            }
        }
        return nums;
    }
};
