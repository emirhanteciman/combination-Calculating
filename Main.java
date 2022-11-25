import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int r;
        System.out.print("Enter value for calculate combination:");
        n = inp.nextInt();
        System.out.print("Enter value for calculate combination:");
        r = inp.nextInt();
        int total = 1;
        int total2 = 1;
        int total3 = 1;


        for (int i = 1; i <= n; i++) {
            total = total * i;

        }
        System.out.println(n + " Faktoriel:" + total);
        for (int k = 1; k <= r; k++) {
            total2 = total2 * k;

        }
        System.out.println(r + " Faktoriel:" + total2);

        int m = n - r;
        for (int v = 1; v <= m; v++) {
            total3 = total3 * v;

        }
        System.out.println(m + " Faktoriel:" + total3);

        int toplam = total / (total2 * total3);
        System.out.println("Total:" + toplam);
    }
}