import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int a = 0; a < numRows; a++) {
            List<Integer> b = new ArrayList<>();
            int c = 1;
            
            for (int d = 0; d <= a; d++) {
                b.add(c);
                c = c * (a - d) / (d + 1);
            }
            
            result.add(b);
        }
        
        return result;
    }
}

