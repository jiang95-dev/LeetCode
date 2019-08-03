class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int res = 0, n = x;
        while(x != 0){
            res = res * 10 + x % 10;
            x /= 10;
        }
        return n == res;
    }
}