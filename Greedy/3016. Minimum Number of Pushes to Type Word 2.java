class Solution {
    public int minimumPushes(String word) {
      int[] f = new int[26];
      for(char ch : word.toCharArray()){
        f[ch - 'a']++;
      }  
      Arrays.sort(f);
      int idx = 0;
      int ans = 0;
      for(int i = 25; i >= 0; i--){
        if(f[i] == 0) break;
        ans += f[i] * ((idx / 8) + 1);
        idx++;
        }
        return ans;
    }
}
