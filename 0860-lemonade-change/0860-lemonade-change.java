class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            System.out.println(five + " " + ten);

            if (bill == 5) {
                five += 1;
            } else if (bill == 10) {
                if (five < 1) {
                    return false;
                }
                five -= 1;
                ten += 1;
            } else {
                if (five < 1 || ten < 1) {
                    if (five < 3) {
                        return false;
                    } else {
                        five -= 3;
                    }
                } else {
                    five -= 1;
                    ten -= 1;
                }
            }
        }
        return true;
    }
}