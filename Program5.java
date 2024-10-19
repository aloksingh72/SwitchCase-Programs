import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("To find Factorial press 1:-");
        System.out.println("To find Power press 2:-");
        System.out.println("To find Prime Number press 3:-");
        System.out.println("To find Reverse Number press 4:-");
        System.out.println("To find Plaindrome number press5 :-");
        System.out.println("To Print Pyramid shape press 6:-");
        System.out.println("To Print Diamond shape press 7:-");
        System.out.print("Enter your option:-> ");
        int x = sc.nextInt();

        //method calling
        switchCaseOperations(x);


        
        sc.close();
    }

    // maethod declaration
    public static void switchCaseOperations(int x){
        Scanner sc = new Scanner(System.in);

        switch (x) {
            case 1:
        //    -----> for factorial -----
            // using while loop
            // int i =1;
            // int fact =1;
            // while(i<=n){
            //     fact  = fact*i;
            //     i++;
            // }
            
            System.out.println("Enter the number");
            int  n = sc.nextInt();
            
            
            // using for loop
            int fact =1;
            for(int i =1;i<=n;i++){
                fact = fact*i;
            }
            System.out.println("the factorial is "+fact);
            break;




            case 2:
            // ----> for power
           
                System.out.println("Enter the first number");
                int a = sc.nextInt();
                System.out.println("Enter the second number");
                int b = sc.nextInt();

                int pow = 1;
                int i=1;
                while(i<=b){
                    pow = pow *a;
                    i++;
                }
                System.out.println("the power is:"+pow);
                break;



            case 3:
            // for prime number
            System.out.println("Enter the number");
            int c = sc.nextInt();
            int j =2;
            while(j <=c/2){
                if(c%j == 0){
                    
                    System.out.println("it is not a prime number");
                }
                j++;

            }
            System.out.println("it is primenumber");
            
            break;
        




            // case 4:
            // case 5:
            // case 6:
            // case 7:

                
                //break;
        
            default:
            System.out.println("You enter wrong option");
              
        }
sc.close();
    }
    
}
