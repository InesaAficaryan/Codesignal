//Given two strings, this function finds the number of common characters between them.

int solution(String s1, String s2) {
       int[] freq1 = new int[26];
       int[] freq2 = new int[26];
       int count = 0;
       Arrays.fill(freq1, 0);
       Arrays.fill(freq2, 0);
       for (int i = 0; i < s1.length(); i++)
           freq1[s1.charAt(i) - 'a']++;

       for (int i = 0; i < s2.length(); i++)
           freq2[s2.charAt(i) - 'a']++;

       for (int i = 0; i < 26; i++)
           count += Math.min(freq1[i], freq2[i]);

       return count;
}

