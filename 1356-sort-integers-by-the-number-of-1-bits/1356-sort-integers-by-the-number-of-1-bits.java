class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Comparator<Integer> comparator = Comparator
            .comparing(Integer::bitCount)
            .thenComparing(x -> x);

        Arrays.sort(boxedArr, comparator);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = boxedArr[i];
        }

        return arr;
    }

    // private int countOnes(int n) {
    //     int count = 0;
    //     while (n > 0) {
    //         count++;
    //         if (n%2 == 0) {
    //             n = n/2;
    //         } else {
    //             n--;
    //         }
    //     }
    //     return count;
    // }
}