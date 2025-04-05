class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int a = arr[i];
                int b = arr[j];
                if (a*2 == b || a == b*2) {
                    return true;
                }
            }
        }
        return false;
    }
}