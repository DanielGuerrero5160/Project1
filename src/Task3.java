public class Task3 {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},
                      {7,8,9},
                      {13,14,15},
        };
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j< nums.length;j++){
                sum+=nums[i][j];
            }

        }
        System.out.println(sum);
    }
}
