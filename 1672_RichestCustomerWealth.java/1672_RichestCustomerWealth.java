class Solution {
    public int maximumWealth(int[][] a) {
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            int c = 0;
            for (int j = 0; j < a[i].length; j++) {
                c = c + a[i][j];
            }
            if (c > b) {
                b = c;
            }
        }
        return b;
    }
}
