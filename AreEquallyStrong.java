//Two arms call equally strong if the heaviest weights they each are able to lift are equal.
//Two people call equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.
//Given two arms' lifting capabilities this function finds out if two are equally strong.

boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
      int yourLeftRightSum = yourLeft + yourRight;
        int friendsLeftRightSum = friendsLeft + friendsRight;
        if (yourLeftRightSum == friendsLeftRightSum && (yourLeft == friendsLeft || yourLeft == friendsRight))
            return true;
        return false;

}

