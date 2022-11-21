public class Main {

    public static double Largest(double a,double b,double c){
        double largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;

    }
    public static double Smallest(double a,double b,double c){
        double Smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        return Smallest;
    }
    public static void reverseNumber(int number)
    {
        if (number < 10)
        {
//prints the same number if the number is less than 10
            System.out.println(number);
            return;
        }
        else
        {
            System.out.print(number % 10);
            reverseNumber(number/10);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("check number");
    }
}