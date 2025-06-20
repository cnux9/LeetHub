class Solution {
    char[] charArray;

    public String removeDigit(String number, char digit) {
        boolean isRemoved = false;
        List<Integer> indices = new ArrayList<>();
        charArray = number.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == digit) {
                if (i != charArray.length-1 && charArray[i+1] > digit) {
                    return getRemovedString(i);
                }
                indices.add(i);
            }
        }

        
        String max = "";
        for (int i : indices) {
             String val = getRemovedString(i);
             if (max.compareTo(val) < 0) {
                max = val;
             }
        }
        return max + "";
    }

    private String getRemovedString(int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (index != i) {
                sb.append(charArray[i]);
            }
        }
        return sb.toString();
    }
}