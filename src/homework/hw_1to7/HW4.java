package homework.hw_1to7;

public class HW4 {

    public static void printLine(String line, int index) {
        System.out.println(line + index);
    }

    public static void findOst(int num1, int num2) {
        int result = num1 / num2;
        int ost = num1 % num2;
        System.out.println("Result = " + result + " ostatok = " + ost);
    }

    public static void findApples(int apples, int students) {
        int res = apples / students;
        int ost = apples % students;

        System.out.println("Если " + apples + " яблок(а) поделить на " + students + " учеников, то каждый ученик получит по "
                + res + " яблок(a), и " + ost + " яблок(а) останется учителю.");
    }

    public static void printApples(int apples, int students) {

        int res = apples / students;
        int ostatok = apples % students;

        String apple = "яблок";
        if (apples == 1 || apples % 11 != 0 && apples % 10 == 1) {
            apple = apple.concat("о");
        } else if(apples >= 2 && apples <= 4 || apples % 10 == 2 || apples % 10 == 3 || apples % 10 == 4) {
            apple = apple.concat("а");
        }
        System.out.println("Если " + apples + " " + apple + " поделить на " + students + " учеников, то каждый ученик получит по "
                     + res + " " + apple + " , и " + ostatok + " " + apple + " останется учителю.");

//        if (apples == 1 || apples % 11 != 0 && apples % 10 == 1) {
//            System.out.println("Если " + apples + " яблоко + поделить на " + students + " учеников, то каждый ученик получит по "
//                    + res + " яблоко, и " + ostatok + " яблоко останется учителю.");
//        } else if (apples == 2 || apples <= 4 || apples % 10 == 2 || apples % 10 == 3 || apples % 10 == 4) {
//            System.out.println("Если " + apples + " яблока + поделить на " + students + " учеников, то каждый ученик получит по "
//                    + res + " яблока, и " + ostatok + " яблока останется учителю.");
//        } else {
//            System.out.println("Если " + apples + " яблок + поделить на " + students + " учеников, то каждый ученик получит по "
//                    + res + " яблок, и " + ostatok + " яблок останется учителю.");
//        }
    }

    public static void getTemperature(double tempC){
        double tempF = tempC * 1.8 + 32;
        System.out.println(tempC + " degrees in Celsii = " + tempF + " degrees in Foringeit");
    }

    public static void main(String[] args) {

        String line = "\n\u001B[35m******************************************\u001B[0m\n\t\t\t\u001B[36mTask # \u001B[0m";

        printLine(line, 3);
        String сосна = "Сосна";
        String дуб = "Дуб";
        String вишня = "Вишня";
        String клён = "Клён";


        System.out.println((2 == 2) && (7 == 7));
        System.out.println(!(15 < 3));
        System.out.println((сосна.equals(дуб)) || (вишня.equals(клён)));
        System.out.println(!сосна.equals(дуб));
        System.out.println((!(15 < 3)) && (10 > 20));
        System.out.println(("Глаза даны, чтобы видеть") + (" Под третьим этажом находится второй этаж"));

        printLine(line, 2);

        String earth = "сухая";
        if (earth.equals("сухая")) {
            System.out.println("нет дождя");
        } else if (earth.equals("мокрая")) {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет снег");
        }

        String day = "пятница";
        if (day.equals("суббота")) {
            System.out.println("завтра воскресенье");
        } else if (day.equals("пятница")) {
            System.out.println("вчера был четверг");
        } else {
            System.out.println("вчера был не четверг, а завтра - не воскресенье");
        }

        printLine(line, 10);

        int num = 3;
        if (num % 2 == 0) {
            System.out.println(num * 2);
        } else {
            System.out.println(num * num);
        }

        printLine(line, 11);

        String hlas = "Голосовать можно с 18 лет";
        String car = "Машину можно водить с 16 лет";
        String schoool = "В школу можно идти с 5 лет";

        int age = 19;

        if (age >= 5) {
            System.out.println(schoool);
        } if (age > 18) {
            System.out.println(hlas);
        }
        if (age > 16) {
            System.out.println(car);
        }


        printLine(line, 13);

        int num1 = 15;
        int num2 = 15;

        if (num1 % 3 == 0 && num2 % 3 == 0) {
            System.out.println("num1 + num2 = " + (num1 + num2));
        } else if (num1 % 5 == 0 && num2 % 5 == 0) {
            System.out.println("num1 - num2 = " + (num1 - num2));
        } else if (num1 % 2 == 0 && num2 % 2 == 0 && num1 >= 0 && num2 >= 0) {
            System.out.println("num1 * num2 = " + num1 * num2);
        } else if (num1 % 2 == 0 && num2 % 2 == 0 && num1 < 0 && num2 < 0) {
            System.out.println("-1 * num1 * num2 = " + num1 * num2 * -1);
        } else {
            System.out.println("Error");
        }

        printLine(line, 14);

        int k = 5;
        int l = 10;
        int m = 15;

        findOst(k, l);
        findOst(k, m);
        findOst(l, m);
        findOst(l, k);
        findOst(m, k);
        findOst(m, l);
        findOst(k, k);
        findOst(l, l);
        findOst(m, m);

        printLine(line, 15);
        findApples(36, 6);

        printLine(line, 16);
        printApples(42, 42);
        printApples(55, 5);
        printApples(1, 2);

        printLine(line, 17);
        getTemperature(11.5);

        printLine(line, 19);
        int inputValue = 0;
        int expectedResult = 0;
        int actualResult;
        if (inputValue % 2 == 0) {
            actualResult = inputValue * 2;
        } else {
            actualResult = inputValue * inputValue;
        }
        if(actualResult == expectedResult){
            System.out.println("\u001B[32mTest Passed\u001B[0m");
        } else {
            System.out.println("\u001B[31mTest Fail\u001B[0m");
        }

        printLine(line, 21);

        Short s = 18;
        int count = 0;
        String newS = s.toString();
        for(int i = 0; i < newS.length(); i++) {
            count++;
        }
        System.out.println("\u001B[31mIt’s a " + count + "\u001B[33m-digit number");

    }

}
