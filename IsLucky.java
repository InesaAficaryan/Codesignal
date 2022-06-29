//Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
//Given a ticket number n, determine if it's lucky or not.

boolean solution(int n) {
    ArrayList<Integer> arr = new ArrayList<>();
           int r = 0;
           int sum_left = 0;
           int sum_right = 0;
           while (n > 0){
               r = n % 10;
               n /= 10;
               arr.add(r);
           }

           for (int i = 0; i < arr.size()/2; i++)
               sum_left += arr.get(i);

           for (int i = arr.size()/2; i < arr.size(); i++)
               sum_right += arr.get(i);

           if (sum_right == sum_left)
               return true;
           return false;
}

