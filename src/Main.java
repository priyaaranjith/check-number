import java.util.Scanner;

public class Main {

    public static double Largest(double a, double b, double c) {
        double largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;

    }

    public static double Smallest(double a, double b, double c) {
        double Smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        return Smallest;
    }

    public static void reverseNumber(int number) {
        if (number < 10) {
//prints the same number if the number is less than 10
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }


        public static void prime(int j) {
            int flag = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
            public static void evenOrNot(int i)
            {
            if(i%2==0){
                System.out.println("Even no");
            }
            else{
                System.out.println("No Not even");
            }
        }

    public static void main(String[] args)
    {
        int flag =0;
        while(flag ==0){

        }
        System.out.println("1.Find largest among three numbers\n"+
                "2.Find smallest among three numbers\n"+
                "3.Check prime or not\n"+
                "4.Check even or not\n"+
                "5.Reverse the number\n");
        System.out.println("Enter your choice");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter first no");
                int a = input.nextInt();
                System.out.println("Enter second no");
                int b = input.nextInt();
                System.out.println("Enter third no");
                int c = input.nextInt();
                double large = Largest(a,b,c);
                System.out.println(large);
                break;
            case 2:
                System.out.println("Enter first no");
                int j = input.nextInt();
                System.out.println("Enter second no");
                int k = input.nextInt();
                System.out.println("Enter third no");
                int l = input.nextInt();
                double small = Smallest(j,k,l);
                System.out.println(small);
                break;
            case 3:
                System.out.println("Enter no to check prime or not");
                int no = input.nextInt();
                prime(no);
                break;
            case 4:
                System.out.println("Enter no to check even or not");
                int cho = input.nextInt();
                evenOrNot(cho);
                break;
            case 5:
                System.out.println("Enter no to be reversed");
                int choi = input.nextInt();
                reverseNumber(choi);
                break;

            default:
                System.out.println("invalid input");
        }
        System.out.println("Do you want to repeat the process if yes enter 1 else 0");
        int option2 = input.nextInt();
        if(option2 == 1){
            flag = 0;
        }
        else{
            flag = 1;
            System.out.println("Happy computing bbye");
        }

    }

}
