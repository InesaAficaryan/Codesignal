// a function that reverses characters in (possibly nested) parentheses in the input string.

String solution(String inputString) {
         StringBuilder str = new StringBuilder();
        int start = 0;
        int end = inputString.length() - 1;
        str.setLength(0); //This method accepts one parameter newLength which is Integer type value refers to the new length of sequence you want to set.
        if (inputString.contains("(")){
            start = inputString.lastIndexOf("("); //return ( -s index
            end = inputString.indexOf(")", start);
            str.append(inputString, start + 1, end);
            return solution(inputString.substring(0, start) + str.reverse().toString() + inputString.substring(end+1));
        }

        return inputString;

}
