class Solution {
    public String reverseVowels(String s) {
        List<Integer> vowelIndices = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = Character.toLowerCase(charArray[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelIndices.add(i);
            }
        }

        for (int i = 0; i < vowelIndices.size() / 2; i++) {
            int targetIndex = vowelIndices.get(i);
            int oppositeIndex = vowelIndices.get(vowelIndices.size() - i - 1);
            System.out.println(i + " " + (vowelIndices.size() - i - 1));
            System.out.println(targetIndex + " " + oppositeIndex);
            char temp = charArray[oppositeIndex];
            charArray[oppositeIndex] = charArray[targetIndex];
            charArray[targetIndex] = temp;
        }
        
        return String.valueOf(charArray);
    }
}