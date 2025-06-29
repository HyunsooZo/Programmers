import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        var prefixSet = new HashSet<String>(Arrays.asList(phone_book));
        for(var phoneNumber : phone_book){
            for (var lenth = 1; lenth < phoneNumber.length(); lenth++) {
                if (prefixSet.contains(phoneNumber.substring(0, lenth))) {
                    return false;
                }
            }
        }
        return true;
    }
}