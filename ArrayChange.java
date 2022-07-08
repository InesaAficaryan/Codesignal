 //You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. This function finds the minimal number of moves required to obtain a strictly increasing sequence from the input.


 int solution(int[] inputArray) {
        int count = 0;
        for (int i = 0; i < inputArray.length - 1; ++i)
        {
            while (inputArray[i] >= inputArray[i + 1])
            {
                ++inputArray[i + 1];
                ++count;
            }
        }

    return count;
}
