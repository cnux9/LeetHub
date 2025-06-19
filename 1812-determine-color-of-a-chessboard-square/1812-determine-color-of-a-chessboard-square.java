class Solution {
    public boolean squareIsWhite(String coordinates) {
        int row = (int)coordinates.charAt(0);
        int col = (int)coordinates.charAt(1);
        // System.out.println(row + " " + col + "");
        return ((row % 2) + (col % 2)) % 2 == 1;
    }
}