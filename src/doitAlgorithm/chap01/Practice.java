package doitAlgorithm.chap01;

import java.util.Scanner;

public class Practice {
    /**
     * Page.19 - Q1
     */
    static int max(int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }

    /**
     * Page.19 - Q2
     */
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    /**
     * Page.19 - Q3
     */
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    /**
     * Page.22 - Q4
     */
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if (a < c) {
                return a;
            } else if (c < b) {
                return b;
            } else {
                return c;
            }
        } else if (b < c) {
            return b;
        } else if (c < a) {
            return a;
        } else {
            return c;
        }
    }

    /* Method.med3() Test
    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + med3(3, 2, 1));
        System.out.println("med3(3,2,2) = " + med3(3, 2, 2));
        System.out.println("med3(3,1,2) = " + med3(3, 1, 2));
        System.out.println("med3(3,2,3) = " + med3(3, 2, 3));
        System.out.println("med3(2,1,3) = " + med3(2, 1, 3));
        System.out.println("med3(3,3,2) = " + med3(3, 3, 2));
        System.out.println("med3(3,3,3) = " + med3(3, 3, 3));
        System.out.println("med3(2,2,3) = " + med3(2, 2, 3));
        System.out.println("med3(2,3,1) = " + med3(2, 3, 1));
        System.out.println("med3(2,3,2) = " + med3(2, 3, 2));
        System.out.println("med3(1,3,2) = " + med3(1, 3, 2));
        System.out.println("med3(2,3,3) = " + med3(2, 3, 3));
        System.out.println("med3(1,2,3) = " + med3(1, 2, 3));
    }
     */

    /**
     * Page.31 - Q7
     */
    public static int gaussAdd(int n) {
        int i = 1;

        return (i + n) * (n / 2);
    }

    /**
     * Page.31 - Q8
     */
    public static int sumof(int a, int b) {
        int min = a;
        int max = b;
        int result = 0;

        if (a > b) {
            min = b;
            max = a;
        }

        for (int i = min; i <= max; i++) {
            result += i;
        }
        return result;
    }

    /**
     * Page.35 - Q9
     */
    public static void Q9() {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("a값: ");
        a = sc.nextInt();
        do {
            System.out.print("b값: ");
            b = sc.nextInt();

            if (a >= b)
                System.out.println("a보다 큰 값을 입력하세요!");

        } while (a >= b);
        sc.close();
        System.out.println("b - a는 " + (b - a) + "입니다.");
    }

    /**
     * Page.35 - Q10
     */
    public static void Q10() {
        Scanner sc = new Scanner(System.in);
        int n;
        int cnt = 0;

        do {
            System.out.print("입력: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("양의 정수를 입력해주세요.");
            }
        } while (n <= 0);

        for (int i = n; i != 0; i /= 10)
            cnt++;

        sc.close();
        System.out.print("그 수는 " + cnt + "자리입니다.");
    }

    public static void main(String[] args) {
        Q10();
    }
}
