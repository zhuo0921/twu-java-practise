import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("please input a number:");
        Scanner number = new Scanner( System.in );
        int num  = number.nextInt();
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i+"，");
                num= num/i;
                i=2;
            }
        }
        if(num==1)
        {
            System.out.print("");
        }
        else {
            System.out.print(num);
        }
    }
}

