class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] size : sizes) {
            int w = size[0];
            int h = size[1];

            maxWidth = Math.max(maxWidth, Math.max(w, h));
            maxHeight = Math.max(maxHeight, Math.min(w, h));
        }

        return maxWidth * maxHeight;
    }
}
