public class Main {
    public static void main(String[] args) {
        int number = 100;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}