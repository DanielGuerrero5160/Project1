public class Task4 {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},
                      {7,8,9},
                      {13,14,15},
        };

        for(int i=0;i<nums.length;i++){
            for(int j=0;j< nums.length;j++){
               if(nums[i][j]%2==0){
                   System.out.println(nums[i][j]);
               }
            }

        }

    }
}
