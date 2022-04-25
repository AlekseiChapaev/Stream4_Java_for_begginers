package homework;

public class HW6 {

    public static void printLine(int taskNumber) {
        System.out.println("\n*****************************************\n\t\t\t\tTask#" + taskNumber);
    }

    public static void task16(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task1StringBuilder(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
    }

    public static void task2(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = num; i > -1; i--) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
    }

    public static void task3(int lowBorder, int highBorder, int stepRange) {
        for (int i = lowBorder; i < highBorder + 1; i += stepRange) {
            System.out.print(i + " ");
        }
    }

    public static void task4(int lowBorder, int highBorder, int multipleNum) {
        for (int i = highBorder; i > lowBorder - 1; i--) {
            if (i % multipleNum == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task5(double lowBorder, double highBorder, double stepRange) {
        for (double i = lowBorder; i <= highBorder; i += stepRange) {
            System.out.println(Math.round(i * 10) / 10.0);
        }
    }

    public static void task6(int lowBorder, int highBorder, int multiple) {
        StringBuilder sb = new StringBuilder();
        for (int i = lowBorder; i <= highBorder; i++) {
            if (i % multiple == 0) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }

    public static void task7(int lowBorder, int highBorder, int multiple) {
        for (int i = lowBorder + 1; i < highBorder; i++) {
            if (i % multiple == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task8(int lowBorder, int highBorder) {
        for (int i = lowBorder; i <= highBorder; i++) {
            if (i == 0) {
                System.out.println("ZERO");
            } else if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            }
        }
    }

    public static void printDecNumbers(double start, double end, double step) {
        for (; start < end; start += step) {
            System.out.print(Math.round(start * 100) / 100.0 + " || ");
        }
    }

    public static void printPowNumber(int num, int pow) {
        System.out.print("Все степени числа " + num + " до степени " + pow + " = ");
        for (int i = 0; i <= pow; i++) {
            System.out.print((int) Math.pow(num, i) + " ");
        }
    }

    public static void printNumbers13() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(i);
        }
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(i).append(i);
        }
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(i).append(i).append(i);
        }

        System.out.println(sb);
    }

    public static void printNumbers14(int num) {
        System.out.print("0 ");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
            System.out.print(-i + " ");
        }
    }

    public static void printNumbers15(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void task16(int n, int m, int l) {
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println("Incorrect data");
        } else {
            while (l > 0) {
                if (n % 3 == 0) {
                    System.out.print(n + " ");
                    l--;
                }
                n = n + m;
            }
        }
    }

    public static void task17(int n) {
        int l = n + 5;
        for (; n < l; n++) {
            System.out.println("[" + (n + 1) + "] = " + (n + 2));
        }
    }

    public static void task18(int n, int l) {
        if (n < l) {
            System.out.println("[" + (n) + "] = " + (n));
            for (; n < l; n++) {
                System.out.println("[" + (n + 1) + "] = " + (n * 2));
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    public static void printNumbersTask19(int n) {
        StringBuilder sb = new StringBuilder();

        for (; n < 100; n++) {
            int a = n / 10;
            int b = n - a * 10;
            if (Math.abs(a - b) <= 3) {
                sb.append(n).append(" ");
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {

        printLine(1);
        task16(10);
        task1StringBuilder(10);

        printLine(2);
        task2(9);

        printLine(3);
        task3(50, 55, 2);

        printLine(4);
        task4(300, 327, 7);

        printLine(5);
        task5(12, 13, 0.1);

        printLine(6);
        task6(215, 237, 2);

        printLine(7);
        task7(7, 14, 7);

        printLine(8); // вопрос по нулю !!
        task6(Short.MIN_VALUE, Short.MAX_VALUE, 15001);

        printLine(9);
        task8(-10, 34);

        printLine(10);
        printDecNumbers(15.5, 20, 0.3);

        printLine(11);
        task6(10, 100, 2);

        printLine(12);
        printPowNumber(2, 3);

        printLine(13);
        printNumbers13();

        printLine(14);
        printNumbers14(5);

        printLine(15);
        printNumbers15(25);

        printLine(16);
        task16(3, 3, 5);

        printLine(17);
        task17(5);

        printLine(18);
        task18(1, 6);

        printLine(19);
        printNumbersTask19(10);
    }
}