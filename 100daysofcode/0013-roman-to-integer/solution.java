class Solution 
{
    public int romanToInt(String s) 
    {
        int result = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            char cc = s.charAt(i);
            int cv = v(cc);
            if (i < s.length() - 1) 
            {
                char nextChar = s.charAt(i + 1);
                int nextValue = v(nextChar);
                if (cv < nextValue) 
                {
                    result -= cv;
                } else 
                {
                    result += cv;
                }
            } 
            else 
            {
                result += cv;
            }
        }
        return result;
    }
    private int v(char rc) 
    {
        switch (rc) 
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
