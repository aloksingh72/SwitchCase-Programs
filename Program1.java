import java.util.Scanner;

/**
 * Dated->15/10/2024
 * Program1
 */
public class Program1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 3");
        int x = sc.nextInt();
        // int x = 3;
        switch (x) {
            case 1:
                System.out.println("this is case 1");
                break;
            case 2:
                System.out.println("this is case 2");
                break;
            case 3:
                System.out.println("this is case 3");
                break;
             default:
             System.out.println("this is default case");   

        }

        sc.close();
    }

}