class Solution {
    public int maximum69Number (int num) {

        ArrayList<Integer> list = new ArrayList<>();

        while(num>0){
            list.add(0,num%10);
            num/=10;
        }
        boolean flag = true;
        int ans = 0;
        for(int i =0; i< list.size(); i++){
            if(list.get(i)==6 && flag == true){
                list.set(i, 9);
                flag = false;
            }
            ans*=10;
            ans+=list.get(i);
        }

        return ans;
        
    }
}
