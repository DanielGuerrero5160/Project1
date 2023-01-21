public class Task9 {
    public static void main(String[] args) {
        int[][] numbers={{2,4,55,67,8},
                {44,56,783,89,},
                {1,2,3,4,45,6,},
        };
        int max=numbers[0][0];
        int min=numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]>max){
                    max=numbers[i][j];
                }
                if(numbers[i][j]<min){
                    min=numbers[i][j];
                }

            }

        }
        System.out.println("The largest number in the array is "+max);
        System.out.println("The smalles number in the array is "+min);

    }
}
