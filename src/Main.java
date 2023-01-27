public class Main {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        for(int i  = 1; i <= 10; i++) {
            System.out.println("\n");
            for(int j = 1; j <= 10; j++) {
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}