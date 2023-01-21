import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] countries=new String[5];
        System.out.println("Please enter 5 countries");
        for(int i=0;i< countries.length;i++){
            countries[i]= input.next();
            switch(countries[i]){
                case "USA":
                    System.out.println("The capital of "+countries[i]+" is WashingtonDC");
                    break;
                case "Spain":
                    System.out.println("The capital of "+countries[i]+" is Madrid");
                    break;
                case "Mexico":
                    System.out.println("The capital of "+countries[i]+ " is Mexico City");
                    break;
                case "Australia":
                    System.out.println("The capital of "+countries[i]+" is Sydney");
                case "Guatemala":
                    System.out.println("The capital of "+countries[i]+" is Tegucigalpa");
                    break;
                default:
                    System.out.println("We do not know the capital of "+countries[i]);
            }
        }
        for(String x:countries){
            switch(x){
                case "USA":
                    System.out.println("WashingtonDC");
                    break;
                case "Spain":
                    System.out.println("Madrid");
                    break;
                case "Mexico":
                    System.out.println("Mexico City");
                    break;
                case "Australia":
                    System.out.println("Sydney");
                case "Guatemala":
                    System.out.println("Tegucigalpa");
                    break;
                default:
                    System.out.println("We do not know the capital of that country");
            }
        }



    }
}
