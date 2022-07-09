 //Given a string, this function finds out if it satisfies the IPv4 address naming rules.
    boolean solution(String inputString) {
        int countOfDots = 0;
        for (int i = 0; i < inputString.length(); ++i)
            if (inputString.charAt(i) == '.')
                ++countOfDots;

        if (countOfDots != 3)
            return false;

        for (int i = 0; i < inputString.length(); ++i)
            if (inputString.charAt(i) != '.' && inputString.charAt(i) != '0' && inputString.charAt(i) != '1' && inputString.charAt(i) != '2' && inputString.charAt(i) != '3' && inputString.charAt(i) != '4' && inputString.charAt(i) != '5' && inputString.charAt(i) != '6' && inputString.charAt(i) != '7' && inputString.charAt(i) != '8' && inputString.charAt(i) != '9')
                return false;

        if (inputString.charAt(0) == '.' || inputString.charAt(inputString.length() - 1) == '.')
            return false;
        if (inputString.charAt(0) == '0' && inputString.charAt(1) != '.')
            return false;
        if (inputString.length() > 15)
            return false;
        int[] countOfNumbers = new int[4];

        for (int i = 0; i < 3; ++i)
            if (countOfNumbers[i] > 3)
                return false;

        for (int i = 0; i < inputString.length() - 1; ++i)
            if (inputString.charAt(i) == inputString.charAt(i + 1) && inputString.charAt(i) == '.')
                return false;
        for (int i = 1; i < inputString.length() - 2; ++i)
            if (inputString.charAt(i) == '.' && inputString.charAt(i + 1) == '0' && inputString.charAt(i + 2) != '.')
                return false;

        int[] numbers = new int[4];
        int j = 0;
        StringTokenizer st = new StringTokenizer(inputString,".");
        while (st.hasMoreTokens()) {
            numbers[j] = Integer.parseInt(st.nextToken());
            ++j;
        }

        boolean flag = true;
        for (int i = 0; i < numbers.length; ++i)
        {
            if (numbers[i] < 0 || numbers[i] > 255)
                flag = false;
        }

        return flag;

    }
