class Solution {
    public String kthDistinct(String[] arr, int k) {

        Set<String> blackSet = new HashSet<>();
        Set<String> allSet = new HashSet<>();

        for (String s : arr) {
            if (allSet.contains(s)) {
                blackSet.add(s);
            } else {
                allSet.add(s);
            }
        }
        int i = 1;
        for (String s : arr) {
            if (!blackSet.contains(s)) {;
                if (i == k) {
                    return s;
                }
                i++;
            }
        }
        return "";
    }
}