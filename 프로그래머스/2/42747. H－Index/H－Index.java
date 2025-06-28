import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        var totalPapers = citations.length;
        var hIndex = 0;

        while (hIndex < totalPapers) {
            var citationCount = citations[totalPapers - 1 - hIndex];
            var requiredCount = hIndex + 1;
            if (citationCount < requiredCount) {
                break;  
            } 
            hIndex++;  
        }

        return hIndex;
    }
}
