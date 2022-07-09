//Given an array of integers, this function finds the maximal absolute difference between any two of its adjacent elements.
    static int solution(int[] inputArray) {
        int diff = 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; ++i)
        {
            diff = Math.abs(inputArray[i] - inputArray[i + 1]);
            result = Integer.max(result, diff);
        }

        return result;
    }
