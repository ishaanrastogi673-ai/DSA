class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0, right=m-1;
        int top=0, bottom=n-1;

        while(top<=bottom && left<=right){
            // left to right chanlenge
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            // topt se bottom jayenge
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            // right se left jayenge
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}