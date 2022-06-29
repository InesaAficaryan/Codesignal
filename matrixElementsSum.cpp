//Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, need to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).

int solution(vector<vector<int>> matrix) {
    int sum = 0;
    int count;
    for (int i = 0; i < matrix.size(); ++i)
    {  
        for (int j = 0; j < matrix[i].size(); ++j)
        {
            if (i == 0 && matrix[i][j] != 0)
                sum += matrix[i][j];
            else if (matrix[i][j] != 0) {
                count = 0;
                for (int k = i - 1; k >= 0; --k) {
                    if (matrix[k][j] != 0)
                        ++count;
                }
                if (count == i)
                    sum += matrix[i][j];
            }
        }
    }
    return sum;
}
