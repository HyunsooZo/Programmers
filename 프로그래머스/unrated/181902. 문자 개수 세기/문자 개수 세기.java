class Solution {
    public int[] solution(String my_string) {
        int[] alphabet = new int[52];
        for (char c : my_string.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int num = c - 'a' +26;
                alphabet[num]++;
            } else if (c >= 'A' && c <= 'Z') {
                int num = c - 'A';
                alphabet[num]++;
            }
        }
        return alphabet;
    }
}
