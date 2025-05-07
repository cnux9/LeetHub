class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int cursor = 0;

        int pieceIndex = 0;

        while (cursor < arr.length) {
            boolean hasNum = false;
            for (int i = 0; i < pieces.length; i++) {
                if (arr[cursor] == pieces[i][0]) {
                    hasNum = true;
                    pieceIndex = i;
                    break;
                }
            }
            if (!hasNum) {
                return false;
            }

            for (int i = 0; i < pieces[pieceIndex].length; i++) {
                if (arr[cursor + i] != pieces[pieceIndex][i]) {
                    return false;
                }
            }

            cursor += pieces[pieceIndex].length;
        }

        return true;
    }
}