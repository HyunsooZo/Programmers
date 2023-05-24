class Solution {
    public String[] solution(String[] picture, int k) {
        int rows = picture.length;
        int cols = picture[0].length();

        int newRows = rows * k;
        int newCols = cols * k;

        String[] newPicture = new String[newRows];

        for (int i = 0; i < rows; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < cols; j++) {
                char pixel = picture[i].charAt(j);
                for (int m = 0; m < k; m++) {
                    sb.append(pixel);
                }
            }
            for (int n = 0; n < k; n++) {
                newPicture[i * k + n] = sb.toString();
            }
        }

        return newPicture;
    }
}
