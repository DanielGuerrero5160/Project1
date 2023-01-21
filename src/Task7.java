import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean prime=true;
        System.out.println("Please enter any whole number");
        int number= input.nextInt();
        for(int i=2;i<=number/2;i++){
            if(number%i==0) {
                prime = false;
                break;
            }
        }
        if(!prime){
            System.out.println(number+" is not prime");
        }else{
            System.out.println(number+" is prime");
        }
    }
}
