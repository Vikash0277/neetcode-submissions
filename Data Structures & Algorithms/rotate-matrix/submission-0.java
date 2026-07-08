class Solution {
    public void rotate(int[][] matrix) {
        int row  = matrix.length;
        int col = matrix[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = i+1; j < col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int[] arr : matrix){
           int left = 0;
           int right  = row -1;
           while(left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
           }
        }
    }
}
