package ru.practice_5;


import java.util.Scanner;

public class Main {
    public static String recursion_1(int n) {
        int s = 0, j = 0;
        if (n == 1) {
            return "1";
        }
        else {
            for (int i = 1; s < n; i++) {
                s += i;
                j = i;
            }
            System.out.print(recursion_1(n-1) + " " + j);
        }
        return "";
    }

    public static String recursion_2(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion_2(n - 1) + " " + n;
    }

    public static String recursion_3(int a, int b) {
        if (a > b) {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion_3(a - 1, b);
        }
        else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion_3(a + 1, b);
        }
    }

    public static int recursion_4(int length, int sum, int k, int s) {
        int result = 0;
        if (length == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (length == 0 ? 1 : 0);
        for (int i = c; i < 10; i++) {
            result += recursion_4(length + 1, sum + i, k, s);
        }
        return result;
    }

    public static int recursion_5(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion_5(n / 10);
        }
    }

    public static boolean recursion_6(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return recursion_6(n, i + 1);
        } else {
            return true;
        }
    }

    public static void recursion_7(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion_7(n / k, k);
        }
        else {
            recursion_7(n, ++k);
        }
    }

    public static String recursion_8(String s) {
        if (s.length() == 1) {
            return "YES";
        }
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return recursion_8(s.substring(1, s.length() - 1));
            }
            else {
                return "NO";
            }
        }
    }

    public static int recursion_9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion_9(a, b - 1) + recursion_9(a - 1, b - 1);
    }

    public static int recursion_10(int n, int i) {
        return (n==0) ? i : recursion_10( n/10, i*10 + n%10 );
    }

    public static int recursion_11() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        if (n == 1) {
            if (m == 1) {
                return recursion_11() + n + m;
            }
            else {
                int k = input.nextInt();
                if (k == 1) {
                    return recursion_11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        }
        else {
            if (m == 1) {
                return recursion_11() + n + m;
            }
            else {
                return n + m;
            }
        }
    }

    public static void recursion_12() {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if (n > 0) {
                if (n % 2 == 1) {
                    System.out.println(n);
                    recursion_12();
                }
                else {
                    recursion_12();
                }
            }
    }

    public static void recursion_13() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int m = input.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion_13();
            }
        }
    }

    public static String recursion_14(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return recursion_14(n / 10) + " " + n % 10;
        }
    }

    public static int recursion_15(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursion_15(n / 10);
        }
    }

    public static void recursion_16(int max, int count) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion_16(n, 1);
            }
            else if (n == max) {
                recursion_16(max, ++count);
            }
            else {
                recursion_16(max, count);
            }
        }
        else {
            System.out.println(count);
        }
    }

    public static int recursion_17() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, recursion_17());
        }
    }


    public static void main(String[] args) {
        System.out.println("Номер 1");
        System.out.println(recursion_1(10));
        System.out.println("\n\nНомер 2\n" + recursion_2(10));
        System.out.println("\nНомер 3\n" + recursion_3(20, 15) + "\n" + recursion_3(10, 20));
        System.out.println("\nНомер 4\n" + recursion_4(0,0,3,15));
        System.out.println("\nНомер 5\n" + recursion_5(25));
        System.out.println("\nНомер 6");
        System.out.println((recursion_6(6, 2)) ? "YES" : "NO");
        System.out.println("\nНомер 7");
        recursion_7(150,2);
        System.out.println("\nНомер 8\n" + recursion_8("radar"));
        System.out.println("\nНомер 9\n" + recursion_9(2, 4));
        System.out.println("\nНомер 10\n" + recursion_10(123, 0));
        System.out.println("\nНомер 11\n");
        System.out.println(recursion_11());
        System.out.println("\nНомер 12\n");
        recursion_12();
//        System.out.println("\nНомер 13\n");
//        recursion_13();
        System.out.println("\nНомер 14\n" + recursion_14(186));
        System.out.println("\nНомер 15\n");
        System.out.println(recursion_15(123));
        System.out.println("\nНомер 16\n");
        recursion_16(0, 0);
        System.out.println("\nНомер 17\n" + recursion_17());
    }
}