class Solution {
  int countCharacters(List<String> words, String chars) {
    int result = 0;
    for (int i = 0; i < words.length; i++) {
        List<String> word = words[i].split('');
        bool isGood = true; 
        for (int j = 0; j < chars.length; j++) {
            // print(" " + chars[j]);
            // print(word);
            word.remove(chars[j]);
            // if ( == false) {
            //     isGood = false;
            //     break;
            // }
        }
        if (isGood = true && word.length == 0) {
            result += words[i].length;
            // print("     " + i.toString());
        }
    }
    return result;
  }
}