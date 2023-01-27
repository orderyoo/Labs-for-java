import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество элементов массива: ");
        int[] mas = new int[in.nextInt()];
        for(int i = 0; i <= mas.length - 1; i++) {
            System.out.printf("%d элемент массива: ", i + 1);
            mas[i] = in.nextInt();
        }
        int sum = 0;
        double averge = 0.0;
        int min = mas[0];
        for(int i : mas) {
            sum += i;
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);
        averge = (double) sum / mas.length;
        double rez  = averge + min;
        System.out.println("Сумма минимального элемента и среденего арифметичеческого = " + rez);
    }
}