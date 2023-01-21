public class Task10 {
    public static void main(String[] args) {
        int[][] numbers={{2,4,55,67,8},
                {44,56,783,89},
                {1,2,3,4,45,6},
        };
        int max=numbers[0][0];
        int secondMax=numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] > max) {
                    secondMax=max;
                    max = numbers[i][j];
                }else if(numbers[i][j]>secondMax){
                    secondMax=numbers[i][j];
                }
                }

            }
        System.out.println("The largest numbers is "+max);
        System.out.println("The second largest number is " +secondMax);
    }
}
