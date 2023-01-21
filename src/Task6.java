public class Task6 {
    public static void main(String[] args) {
        int num1=50;
        int num2=20;
        num1=num1+num2;//num1=30
        num2=num1-num2;//num2=10
        num1=num1-num2;//num1=20 because the new value of number 2 is 10,so 30-10 is 20
        System.out.println("After swapping,num1= "+num1+" and num2= "+num2);
    }
}
