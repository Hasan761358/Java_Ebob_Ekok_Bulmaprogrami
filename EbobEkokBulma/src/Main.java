import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1, number2,small,ebob=0,ekok=0;

        System.out.print("Birinci sayıyı giriniz : ");
        number1= scan.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2= scan.nextInt();

        if(number1>number2){
            small=number2;
        }else {
            small=number1;
        }
        for(int i=1; i<=small;i++ ){
            if(number1 % i ==0 && number2 % i == 0){
                ebob=i;
            }
        }
        System.out.println("Ebob : " + ebob);

        for(int k=1 ; k <= (number1*number2);k++){
            if( k % number1 == 0 && k % number2 == 0){
                ekok=k;
                break;
            }
        }System.out.println("Ekok : "+ ekok );
    }
}