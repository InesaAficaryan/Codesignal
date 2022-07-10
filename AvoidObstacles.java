    //You are given an array of integers representing coordinates of obstacles situated on a straight line.
    //Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.
    //This function finds the minimal length of the jump enough to avoid all the obstacles.
    int solution(int[] inputArray) {

        boolean flag = false;
        int minCountOfJumps = 0;
        int count = 0;
        while (!flag) {
            ++minCountOfJumps;
            for (int j = 0; j < inputArray.length; ++j)
            {
                if (inputArray[j] % minCountOfJumps != 0)
                    ++count;
            }
            if (count == inputArray.length)
                flag = true;
            count = 0;
        }


        return minCountOfJumps;
    }

