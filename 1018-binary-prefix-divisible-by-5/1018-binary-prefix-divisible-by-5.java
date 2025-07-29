class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int val = 0;
        List<Boolean> answers = new ArrayList<>(nums.length);
        for (int n : nums) {
            val = (val * 2 + n) % 5;
            answers.add(val == 0);
            // System.out.println(val + " : " +  answers.get(answers.size() - 1));
        }
        return answers;
    }
}