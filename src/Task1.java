import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 10 whole numbers");
int sum=0;
        int[]numbers=new int[10];
        for(int i=0;i< numbers.length;i++){
            numbers[i]= input.nextInt();
        }
        for(int i=0;i< numbers.length;i++){
            sum+=numbers[i];
        }
        System.out.println("The sum of all entered numbers is "+sum);


    }
}
