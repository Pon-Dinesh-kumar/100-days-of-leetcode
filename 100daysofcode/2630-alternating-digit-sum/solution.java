class Solution {
    public int alternateDigitSum(int n) {

    ArrayList<Integer> list = new ArrayList<>();

    int ans = 0;

    while(n>0){
        list.add(0, n%10);
        n=n/10;
    }

    for(int i =list.size()-1; i>=0; i--){
        if(i%2==0){
            ans+=list.get(i);
        }
        else{
            ans-=list.get(i);
        }
    }

    return ans;


        
    }
}
