class Solution {
    public boolean checkRecord(String s) {
        int a = 0;
        int c = 0;
        for (char record : s.toCharArray()) {
            if (record == 'A') {
                a++;
                if (a >=2 ) {
                    return false;
                }
                c = 0;
            } else if (record == 'L') {
                c++;
                if (c >= 3) {
                    return false;
                } 
            } else {
                c = 0;
            }
        }
        return true;
    }
}