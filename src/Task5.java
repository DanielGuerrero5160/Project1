public class Task5 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3,1},
                       {7, 8, 9,4},
                       {13, 14, 15,16},
                       {240,122,33,111},
        };
int sumOdd=0;
int sumEven=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] % 2 == 0) {
                    sumEven+=nums[i][j];
                }else if(nums[i][j]%2!=0){
                    sumOdd+=nums[i][j];
                }
            }


        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
