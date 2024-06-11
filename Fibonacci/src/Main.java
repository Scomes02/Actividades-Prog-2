import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero para realizar la suseción: ");
        int num = sc.nextInt();

        System.out.println("Los primeros " + num + " números de la sucesión de Fibonacci son: ");
        for (int i = 0; i < num; i++) {
            System.out.print(metoFibo(i) + " ");
        }
    }

    public static int metoFibo(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return metoFibo(num - 1) + metoFibo(num - 2);
        }

    }
}