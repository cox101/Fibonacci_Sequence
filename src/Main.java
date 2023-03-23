public class Main {
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int a = 1, b = 2, c = 3;

        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            a = b;
            b = c;
            c = a + b;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        int a = 1, b = 2, c;

        System.out.print(a + ", " + b); // Print the first two terms

        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(", " + c); // Print the current term
            a = b;
            b = c;
        }
        sumEvenFibonacci(4000000);
    }
}