package homework;

public class HW6 {

    public static void printLine(int taskNumber) {
        System.out.println("\n*****************************************\n\t\t\t\tTask#" + taskNumber);
    }

    public static void printNumbers(int num) {

        for (int i = 0; i < num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumbersStringBuilder(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
    }

    public static void printRegressionNumbers(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = num; i > -1; i--) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
    }

    public static void printNumbersFromRange(int lowBorder, int highBorder, int stepRange) {
        for (int i = lowBorder; i < highBorder + 1; i += stepRange) {
            System.out.print(i + " ");
        }
    }

    public static void printRangeMultiplesNumbers(int lowBorder, int highBorder, int multipleNum) {
        for (int i = highBorder; i > lowBorder - 1; i--) {
            if (i % multipleNum == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printDoubleNumbersFromRange(double lowBorder, double highBorder, double stepRange) {
        for (double i = lowBorder; i <= highBorder; i += stepRange) {
            System.out.println(Math.round(i * 10) / 10.0);
        }
    }

    public static void printRangeNumbers(int lowBorder, int highBorder, int multiple) {
        StringBuilder sb = new StringBuilder();
        for (int i = lowBorder; i <= highBorder; i++) {
            if (i % multiple == 0) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }

    public static void printRangeMultiplesNumbersIncludingBorders(int lowBorder, int highBorder, int multiple) {
        for (int i = lowBorder + 1; i < highBorder; i++) {
            if (i % multiple == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNum(int lowBorder, int highBorder) {
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
        for (double i = start; i <= end; i += step) {
            System.out.print(Math.round(i * 100) / 100.0 + " || ");
        }
    }

    public static void printPowNumber(int num, int pow) {
        System.out.print("Все степени числа " + num + " до степени " + pow + " = ");
        for (int i = 0; i <= pow; i++) {
            System.out.print((int) Math.pow(num, i) + " ");
        }
    }


    //   Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.

    public static void printNumbers13() {
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < 10; i++){
//            sb.append(i);
//        }
//        for(int i = 0; i < 10; i++){
//            sb.append(i).append(i);
//        }
//        for(int i = 0; i < 10; i++){
//            sb.append(i).append(i).append(i);
//        }
//        for(int i = 0; i < 10; i++){
//            sb.append(i).append(i).append(i).append(i);
//        }
//
//        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < 10; j++) {
                stringBuilder.append(String.valueOf(j).repeat(Math.max(0, i)));
            }
        }
        System.out.println(stringBuilder);
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

    //Написать метод, который принимает параметры n, m, l,
    // и печатает последовательность нечетных чисел начиная с числа n, с шагом m,  длина последовательности  l.

     public static void printNumbers(int n, int m, int l) {
            StringBuilder sb = new StringBuilder();
            for (; n <= l * m * 2; n += m) {
                if (n % 2 != 0) {
                    sb.append(n + " ");
                }
            }
            System.out.println(sb);
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
        printNumbers(10);
        printNumbersStringBuilder(10);

        printLine(2);
        printRegressionNumbers(9);

        printLine(3);
        printNumbersFromRange(50, 55, 2);

        printLine(4);
        printRangeMultiplesNumbers(300, 327, 7);

        printLine(5);
        printDoubleNumbersFromRange(12, 13, 0.1);

        printLine(6);
        printRangeNumbers(215, 237, 2);

        printLine(7);
        printRangeMultiplesNumbersIncludingBorders(7, 14, 7);

        printLine(8); // вопрос по нулю !!
        printRangeNumbers(Short.MIN_VALUE, Short.MAX_VALUE, 15001);

        printLine(9);
        printNum(-10, 34);

        printLine(10);
        printDecNumbers(10, 100, 12);

        printLine(11);
        printRangeNumbers(10, 100, 2);

        printLine(12);
        printPowNumber(2, 3);

        printLine(13);
        printNumbers13();

        printLine(14);
        printNumbers14(5);

        printLine(15);
        printNumbers15(25);

        printLine(16);
        printNumbers(3, 3, 5);

        printLine(19);
        printNumbersTask19(10);

    }
}
