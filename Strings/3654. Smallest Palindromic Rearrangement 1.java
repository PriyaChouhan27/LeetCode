/*
LeetCode 3654 - Smallest Palindromic Rearrangement I

Approach:
- Frequency Array
- Build left half, middle character (if any), and reverse the left half.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String smallestPalindrome(String s) {
    int[] f = new int[26];
    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        f[ch - 'a']++;
    }
    StringBuilder l = new StringBuilder();
    StringBuilder m = new StringBuilder();

    for(int i = 0; i < 26; i++){
        for(int j = 0; j < f[i]/2; j++)
            l.append((char)('a' + i));
        if(f[i] % 2 == 1)
        m.append((char)('a' + i));
    }
    StringBuilder r = new StringBuilder(l);
    r.reverse();
    return l.toString() + m.toString() + r.toString();
    }
}
