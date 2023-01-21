public class Task8 {
    public static void main(String[] args) {
        /*
        Write a Java Program to print the first 10 numbers of Fibonacci series.
         */
int number1=0;
int number2=1;
int number3;
        System.out.print(number1+" "+number2+" ");
        for (int i = 2; i <= 10; i++) {
              number3=number1+number2;
                System.out.print(number3+" ");
                number1=number2;
                number2=number3;




        }
    }
}
