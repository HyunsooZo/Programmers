class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] c = my_string.toCharArray();     
        for(int[] i : queries){
            reverse(c,i[0],i[1]);
        } 
        return new String(c);
    }
    public char[] reverse(char[] arr , int left , int right){
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}