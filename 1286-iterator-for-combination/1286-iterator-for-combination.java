// import java.util.stream.IntStream;

class CombinationIterator {
    // String characters;
    int[] charactersArray;
    int[] indexArray;
    boolean hasNext = true;

    public CombinationIterator(String characters, int combinationLength) {
        // this.charactersArray = characters.chars().sorted().toArray();
        this.charactersArray = characters.chars().toArray();

        // this.characters = characters;
        this.indexArray = IntStream.range(0, combinationLength).toArray();
    }
    
    public String next() {
        if (!this.hasNext) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indexArray.length; i++) {
            sb.append((char) charactersArray[indexArray[i]]);
        }

        System.out.println(sb.toString());
        hasNext = false;
        for (int i = indexArray.length-1; i >= 0; i--) {
            System.out.println("loop " + i);
            if (indexArray[i] != charactersArray.length - (indexArray.length - i)) {
                indexArray[i]++;
                for (int j = 1; j + i < indexArray.length; j++) {
                    System.out.println("    loop " + i + " : " + j);
                    indexArray[j + i] = indexArray[i] + j;
                    System.out.println("        " + indexArray[j + i]);
                }
                hasNext = true;
                break;
            }
        }
        // if (hasNext == false) {
        //     return null;
        // }
        
        System.out.println("loop end ");
        return sb.toString();
    }
    
    public boolean hasNext() {
        return this.hasNext;
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */