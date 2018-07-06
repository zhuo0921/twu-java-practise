import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("please input a number:");
        Scanner number = new Scanner( System.in );
        int num  = number.nextInt();
        for (int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print( "*" );
            }
            System.out.println(  );
        }
    }
}
