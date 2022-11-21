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
        System.out.println("check number");
    }
}