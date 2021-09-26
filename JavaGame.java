import java.util.Scanner;

class JavaGame{
    public static void main(String args[]){
        int a , seconds, res ;
        int digit, sum=0;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
        JavaGame game1 = new JavaGame();
        JavaGame game2 = new JavaGame();
        System.out.println("1. Sum of digits\n");
        System.out.println("2. Convert seconds to time\n");
        System.out.println("3. Exit\n");
        choice = scan.next().charAt(0);

            switch(choice)
            {
                case '1' : 
                System.out.println("Enter number : ");
                a = scan.nextInt();
                game1.sumDigit();
                break;

                case '2' : System.out.println("Input Seconds : ");
                seconds = scan.nextInt();
                game2.convertTime();
                break;

                case '3' : System.exit(0);
                break;

                default : System.out.println("Wrong choices");
           }
        


           int sumDigit(){
               while(a > 0){
                    digit = a % 10;  
                    sum = sum + digit;  
                    a = a / 10;  
                }
                return (sum);
           }

           int convertTime(){
               int p1 = seconds % 60;
                int p2 = seconds / 60;
                int p3 = p2 % 60;
                p2 = p2 / 60;
                return(p2 + ":" + p3 + ":" + p1);
           }
    }
}