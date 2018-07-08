import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println( "please input a number:" );
        Scanner number = new Scanner( System.in );
        int num = number.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num-1; j++) {
                System.out.print( " " );
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if(i == num -1)
                {
                    System.out.print( "wzzheng" );
                    break;
                }
                else {
                   System.out.print( "*" );
                }
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print( " " );
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print( "*" );
            }
            System.out.println();
        }
    }
}
