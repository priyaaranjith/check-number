public class Main {

    public static double Largest(double a,double b,double c){
        double largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;

    }
    public static void main(String[] args)
    {
        System.out.println("check number");
    }
}