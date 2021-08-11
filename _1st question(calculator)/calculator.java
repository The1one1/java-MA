import java.util.Scanner;
import java.lang.System;

class calculator {
    public static void main(String args[]) {
        System.out.println("Select\n 1 for bit calcutation \n 2 arithmatic caluclation \n 3 Exit");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 1) {
            System.out.println("Enter value");
            boolean kl=true;
            int b = in.nextInt();
            char symbol;
            do {
                symbol = in.next().charAt(0);
                if (symbol == '+') {
                    int a = in.nextInt();
                    b += a;
                } else if (symbol == '-') {
                    int a = in.nextInt();
                    b -= a;
                } else if (symbol == '*') {
                    int a = in.nextInt();
                    b *= a;
                } else if (symbol == '/') {
                    int a = in.nextInt();
                    b /= a;
                } else if (symbol == '=') {
                    System.out.println(b);
                    b = 0;
                    kl=false;
                }
            } while (kl);
        } else {
            if (x == 3) {
                System.exit(0);
            }
            System.out.println("Enter value");
            int b = in.nextInt();
            char symbol;
            boolean kl=true;
            do {
                symbol = in.next().charAt(0);
                if (symbol == '&') {
                    int a = in.nextInt();
                    b &= a;
                } else if (symbol == '|') {
                    int a = in.nextInt();
                    b |= a;
                } else if (symbol == '~') {
                    b = ~b;
                } else if (symbol == '=') {
                    System.out.println(b);
                    b = 0;
                    kl=false;
                }
            } while (kl);
        }
    }
}
