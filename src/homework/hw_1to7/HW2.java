package homework.hw_1to7;

public class HW2 {

    public static void main(String[] args) {
        int k = 5;
        int l = 10;
        int m = 15;
        String line = "*************************";

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.print(k);
        System.out.print(l);
        System.out.println(m);
        System.out.println(line);
        System.out.println(k + "," + l + "," + m);
        System.out.println("k = " + k + ", l = " + l + ", m = " + m);
        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + (k * m));
        System.out.println("Разность переменных l и m = " + (l - m));
        System.out.println(line);
        System.out.println("Результат деления k на l = " + (k / l) + ", а остаток от деления  = " + (k % l));
        System.out.println("Результат деления k на m = " + (k / m) + ", а остаток от деления  = " + (k % m));
        System.out.println("Результат деления l на m = " + (l / m) + ", а остаток от деления  = " + (l % m));
        System.out.println("Результат деления l на m = " + (l / k) + ", а остаток от деления  = " + (l % k));
        System.out.println("Результат деления m на k = " + (m / k) + ", а остаток от деления  = " + (m % k));
        System.out.println("Результат деления m на k = " + (m / l) + ", а остаток от деления  = " + (m % l));
        System.out.println(line);

        int apple = 100;
        int student = 21;
        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по " +
                +apple / student + " яблок, и " + apple % student + " яблок(а) останется учителю.");
        System.out.println(line);

        int sumKLM = k + l + m;
        sumKLM++;

        System.out.println(sumKLM);
        System.out.println
                ("Сумма чисел " + k + " " + l + " " + m + "++ и " + k + " "+ l + " " + m + "-- = " + ((k + l + m + 1) + (k + l + m - 1))
                        + " , а разность " + k + " " + l + " " + m + "++ и " + k + " " + l + " " + m + "-- = " + ((k + l + m + 1) - (k + l + m - 1)));

        int number = 48;
        int number2 = 8;

        if (number % 2 == 0) {
            System.out.print("число " + number + " четное");
        }   if (number % number2 == 0) {
            System.out.println(" и оно кратно " + number2);
        }   else {
            System.out.println(number + " не четное");
        }
        System.out.println(line);

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        int result21 = (x + 3) * (x + 3);
        double result22 = ((3.0 + 4 * x) / 5) - (10 * (y - 5) * (a + b + c)) / x + 9 * ((4 / x ) + (9 + x) / y);
        double result23 = (5.0 * x + 7 * y) / (8 * x + 10 * y) / (3 * x - y) / (x + y) / (a + b + c / d + ((a + b)/ (c + d)) + a * b) ;

        System.out.println(line);

        System.out.println(
                "-----------------\n"+
                "| task\t| result|\n"+
                "-----------------\n"+
                "| 21\t|" + result21 + "\t\t|\n"+
                "-----------------\n"+
                "| 22\t|" + result22 + "\t|\n"+
                "-----------------\n"+
                "| 23\t|" + result23 + "\t\t|\n"+
                "-----------------\n");

//                "task\n" +
//                "result\n" +
//                "21\n" +
//                "result21\n" +
//                "22\n" +
//                "result22\n" +
//                "23\n" +
//                "result23\n" +
//                "\n");




    }
}
