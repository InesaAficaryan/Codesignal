//Given a string, this function finds out if its characters can be rearranged to form a palindrome.

boolean solution(String inputString) {
 
       if (inputString.length() == 1)
            return true;

        boolean flag = false;
        int count = 0;
        int[] freq1 = new int[26];
        Arrays.fill(freq1, 0);
        for (int i = 0; i < inputString.length(); ++i)
            freq1[inputString.charAt(i) - 'a']++;
        for (int i = 0; i < freq1.length; ++i)
        {

            if (freq1[i]%2 == 0)
                flag = true;
            else ++count;
        }
        if (count > 1)
            flag = false;

    return flag;
}
