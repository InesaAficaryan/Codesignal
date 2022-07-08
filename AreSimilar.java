 //Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
 //This function checks if two arrays are similar
 
 boolean solution(int[] a, int[] b) {
        if (a.length != b.length)
            return false;

        int count = 0;
        int a1 = 0, a2 = 0, b1 = 0, b2 = 0;
        int index1 = 0; // index of first not equal element
        boolean flag = false;
        for (int i = 0; i < a.length; ++i)
        {
           if (a[i] != b[i])
               ++count;
           if (count == 1)
               index1 = i;
        }

        if (count <= 2)
        {
            for (int i = 0; i <= index1; ++i)
            {
                if (a[i] != b[i])
                {
                    a1 = a[i];
                    b1 = b[i];
                }
            }

            for (int i = index1; i < a.length; ++i)
            {
                if (a[i] != b[i])
                {
                    a2 = a[i];
                    b2 = b[i];
                }
            }

            if (a1 == b2 && a2 == b1)
                flag = true;
        }

        return flag;
    }
