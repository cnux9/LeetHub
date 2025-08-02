class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> result = new ArrayList<>();
        String[] words = text.split(" ");
        boolean[] firstCheck = new boolean[words.length];
        boolean[] secondCheck = new boolean[words.length];

        for (int i = 0; i < words.length - 2; i++) {
            firstCheck[i] = words[i].equals(first);
        }
        for (int i = 1; i < words.length - 1; i++) {
            if (firstCheck[i - 1]) {
                secondCheck[i] = words[i].equals(second);
            }
        }
        for (int i = 2; i < words.length; i++) {
            if (firstCheck[i - 2] && secondCheck[i - 1]) {
                result.add(words[i]);
            }
        }
        return result.stream().toArray(String[]::new);
    }
}