/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return firstBadVersionInternal(0, n);
    }

    private int firstBadVersionInternal(int start, int end) {
        // System.out.println(start + " " + end);
        if (end - start == 1) {
            return end;
        }
        int mid = start + ((end - start) / 2);
        // System.out.println(mid);
        if (isBadVersion(mid)) {
            return firstBadVersionInternal(start, mid);
        } else {
            return firstBadVersionInternal(mid, end);
        }
    }
}