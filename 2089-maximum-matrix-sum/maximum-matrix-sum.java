class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        long sum = 0;
        int negCount = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                int val = matrix[i][j];

                if (val < 0){
                    negCount++;
                }
                list.add(Math.abs(val));
            }
        }
        Collections.sort(list);

        for (int index : list){
            sum += index;
        }

        if (negCount % 2 == 1){
            sum -= (long) 2 * list.get(0);
        }
        return sum;
    }
}