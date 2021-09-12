package ru.practice_5;


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


    public static void main(String[] args) {
        System.out.println("Номер 1");
        System.out.println(recursion_1(10));
        System.out.println("\n\nНомер 2\n" + recursion_2(10));
        System.out.println("\nНомер 3\n" + recursion_3(20, 15) + "\n" + recursion_3(10, 20));
        System.out.println("\nНомер 4\n" + recursion_4(0,0,3,15));
        System.out.println("\nНомер 5\n" + recursion_5(25));
        System.out.println("\nНомер 6");
        System.out.println((recursion_6(18, 2)) ? "YES" : "NO");
        System.out.println("\nНомер 7");
        recursion_7(150,2);
        System.out.println("\nНомер 8\n" + recursion_8("radar"));

    }
}

