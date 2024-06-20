class Solution {
    public int integerBreak(int n) {
        if(n<=3) return n-1;
        int div = n/3;
        int plus = n%3;
        return plus == 0 ? (int)Math.pow(3,div) : (plus == 1) ? (int)Math.pow(3,div-1)*4 : (int)Math.pow(3,div)*2; 
    }
}