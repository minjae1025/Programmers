import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        while (true) {
            int[] temp = arr.clone();
            for (int i = 0; i<arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] > 50) {
                    arr[i] /= 2;
                }
                else if (arr[i] % 2 == 1 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(arr, temp)) {
                break;
            }
            cnt++;
        }
        return cnt;
    }
}