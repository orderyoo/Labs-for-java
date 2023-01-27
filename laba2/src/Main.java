import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Значение х: ");
        int x = in.nextInt();
        System.out.print("Значение n: ");
        int n_max = in.nextInt();
        double rez = 1;
        for (int n = 1; n <= n_max; n++) {
            rez -= Math.pow(x, n * 2) / factorial(n * 2);
            int m = ++n;
            rez += Math.pow(x, m * 2) / factorial(m * 2);
        }
        System.out.printf("Результат: %f", rez);
    }
    static int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);

    }
}