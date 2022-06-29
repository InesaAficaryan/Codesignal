//Some people are standing in a row in a park. There are trees between them which cannot be moved.
//need to rearrange the people by their heights in a non-descending order without moving the trees.

int[] solution(int[] a) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < a.length; i++)
            arr.add(a[i]);

        Collections.sort(arr);
        for (int i = 0; i < a.length; i++){
            if (arr.get(i) == -1)
                ++count;
        }

        for (int i = 0; i < a.length; i++){
            if (a[i] != -1){
                a[i] = arr.get(count);
                ++count;
            }
        }

        return a;
}

