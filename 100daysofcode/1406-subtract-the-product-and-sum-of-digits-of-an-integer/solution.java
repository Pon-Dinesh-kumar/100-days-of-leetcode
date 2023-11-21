class Solution {
    public int subtractProductAndSum(int n) {
        int pod =1;
        int sod =0;

        while(n>0){
            int temp = n%10;
            pod*=temp;
            sod+=temp;
            n/=10;
        }

        return pod - sod;
    }
}
