//Given an array of strings, this function return another array containing all of its longest strings.



String[] solution(String[] inputArray) {
        int maxCount = 0;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++){
            for (int j = 0; j < inputArray[i].length(); j++)
            {
                ++count;
            }
            arr.add(count);
            count = 0;
        }
        for (int i = 0; i < inputArray.length; i++){
            if (arr.get(i) >= maxCount)
                maxCount = arr.get(i);
        }

        for (int i = 0; i < inputArray.length; i++)
        {
            if (inputArray[i].length() == maxCount)
                array.add(inputArray[i]);
        }
        String[] newString = new String[array.size()];

        for (int i = 0; i < array.size(); i++)
        {
            newString[i] = array.get(i);
        }

        return newString;

}

