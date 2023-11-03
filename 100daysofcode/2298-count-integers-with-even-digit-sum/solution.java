class Solution {
    public int countEven(int num) {
        int temp = num;
        int temp1 = 0;

        while (num > 0) {
            temp1 += num % 10;
            num = num / 10;
        }

        if (temp1 % 2 == 0) {
            return temp / 2;
        }

        if (temp % 2 == 0) {
            return temp / 2 - 1;
        }

        return temp / 2;
    }
}

