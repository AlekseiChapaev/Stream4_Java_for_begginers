package homework;

public class HW5 {

    public static void printTaskNumber(int num) {
        String line = "*********************************\n\t\t\tTask#";
        System.out.println(line + num);
    }

    public static void verifyEquals(String expectedResult, String actualResult) {

        if (actualResult.equals(expectedResult)) {
            System.out.println("\u001B[32mTest Passed\u001B[0m");
        } else {
            System.out.println("\u001B[31mTest Failed\u001B[0m");
        }
    }

    public static String getDayInWeek(int dayNumber) {
        String[] week = {"", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        if (dayNumber < 1 || dayNumber > 7) {

            return "Number of day is incorrect";
        } else {

            return week[dayNumber];
        }
    }

    public static int findMaxValue(int x, int y, int z) {
        int largest;
        System.out.println(largest = Math.max(Math.max(x, y), z));

        return largest;
    }

    public static int findMinValue(int a, int b, int c) {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    public static double catAverageTemp(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum / numbers.length;
    }

    public static double catTemp(double t1, double t2, double t3, double t4, double t5) {

        return (t1 + t2 + t3 + t4 + t5) / 5;
    }

    public static String convertingDoubleToCost(double num) {

        return (int) (num) + " руб " + Math.round((num % 1) * 100) + " коп";
    }

    public static void returnPrice(double num) {
        String str = Double.toString(num);
        String[] array = str.split("\\.");
        System.out.println(array[0] + " руб " + array[1] + " коп");
    }

    public static String showWeight(double num) {

        String kg = " кг ";
        String gr = " гр";
        String[] arr = Double.toString(num).split("\\.");
        String weightInKg = arr[0];
        String weightInGr = arr[1];

        return weightInKg + kg + weightInGr + gr;

    }

    public static String showWeight2(double num) {

        return (int) (num) + " кг " + (int) ((num % 1) * 100) + " гр";
    }

    public static String showWeight3(double num) {

        return (int) (num) + " кг " + (int) ((num % 1) * 1000) + " гр";
    }

    public static double sumOfPurchase(double price, double quantity) {

        return price * quantity;
    }

    public static String roundedSumPurchase(double price, double quantity) {
        double mult = price * quantity;
        return (int) mult + " руб " + (Math.round((mult % 1) * 100)) + " коп";
    }

    public static void createBillKg(String goods, double price, double quantity) {
        String line = "-";
        String line2 = "*";
        System.out.println(line2.repeat(30));
        System.out.println("\t\t" + goods);
        System.out.println("Cost per 1 kg\t " + convertingDoubleToCost(price));
        System.out.println("Quantity\t\t " + showWeight3(quantity));
        System.out.println(line.repeat(30));
        System.out.print("Сумма к оплате\t ");
        System.out.println(roundedSumPurchase(price, quantity));
    }

    public static void createBillPieces(String goods, double price, int quantity) {
        String line = "-";
        String line2 = "*";

        System.out.println(line2.repeat(30));
        System.out.println("\t\t\t" + goods);
        System.out.println("Cost per 1 kg\t" + convertingDoubleToCost(price));
        System.out.println("Quantity\t\t" + quantity + " шт");
        System.out.println(line.repeat(30));
        System.out.println("Сумма к оплате\t" + roundedSumPurchase(price, quantity));
    }

    public static String getSalary(int hours, double hoursCost) {

        int countMonthWorkDays = 20;
        return convertingDoubleToCost(countMonthWorkDays * hours * hoursCost);
    }

    public static void salaryOfDivision(String employee, String salary) {
        System.out.print(employee);
        System.out.print(salary);
    }

    public static void showScheme(double x) {

        if (x < 0) {
            System.out.println(x + " is negative");
        } else if (x > 0) {
            System.out.println(x + " is positive");
        } else {
            System.out.println(x + " is zero");
        }
    }

    public static int[] transformIntToArray(int yob) {

        int[] array = new int[String.valueOf(yob).length()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = yob % 10;
            yob /= 10;
        }

        return array;
    }

    public static int returnSumArraysIntNumbers(int[] array) {
        int sum = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }

        return sum;
    }

    public static double returnSumArraysDoubleNumbers(double[] array) {
        int sum = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }

        return sum;
    }

    public static void luckyNumber(int yob) {

        int sum = returnSumArraysIntNumbers(transformIntToArray(yob));
        while (sum > 9) {
            sum = returnSumArraysIntNumbers(transformIntToArray(sum));
        }
        System.out.println("Your lucky number is " + sum);
    }

    public static double getAverageOfThreeNumbers(double a, double b, double c) {
        double[] array = {a, b, c};

        return returnSumArraysDoubleNumbers(array) / array.length;
    }

    public static double getMedianOfThreeNumbers(double a, double b, double c) {

        double median = 0;
        double[] arr = {a, b, c};
        double maxValue = Math.max(Math.max(a, b), c);
        double minValue = Math.min(Math.min(a, b), c);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != maxValue && arr[i] != minValue) {
                median = arr[i];
            }
        }
        return median;
    }

    public static void roundingFloor(double a) {

        String num = String.valueOf(Math.floor(a));

        System.out.println("Your purchase is " + num.replaceAll("\\.", " руб ") + "0 коп");
    }

    public static double getDifferentAverageMedian(double a, double b, double c) {

        return Math.abs(getAverageOfThreeNumbers(a, b, c) - getMedianOfThreeNumbers(a, b, c));
    }

    public static void toTask17_1(double a) {
        if (a > 0) {
            System.out.println("x = 1");
        }
    }

    public static void toTask17_2(double a) {
        if (a > 80 || a < 90) {
            a += 5;
        }
        System.out.println(a);
    }

    public static boolean toTask17_4(double x) {
        if (x % 2 != 0 && x > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void toTask17_4_1(double x) {
        System.out.println(x % 2 != 0 && x > 0);
    }

    public static void toTask17_5(double x , double y) {
        System.out.println(x > 0 && y > 0);
    }

    public static void toTask17_6(double x , double y) {
        System.out.println((x > 0 && y > 0) || (x < 0 && y < 0));
    }

    public static void poweredNumber(int pow){

        int num = (int)Math.ceil(Math.random() * 100);
        System.out.println("Число " + num + " в степени " + pow + " = " + (int)Math.pow(num, pow));

    }

    public static int getRandomNumber(){
        return (int)(Math.random() * 100);
    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static double getPow(int pow){

        if(pow >= 0 && pow <= 10){
            return Math.pow(Math.random(), pow);
        } else {
            System.out.println("Err");
            return Double.MIN_VALUE;
        }
    }

    public static void main(String[] args) {

        printTaskNumber(2);
        System.out.println(getDayInWeek(3));
        verifyEquals("wednesday", getDayInWeek(3));

        printTaskNumber(3);
        verifyEquals(String.valueOf(6), String.valueOf(findMaxValue(5, 3, 6)));

        printTaskNumber(4);
        System.out.println(findMinValue(100, 30, 50));
        verifyEquals(String.valueOf(30), String.valueOf(findMinValue(100, 30, 50)));

        printTaskNumber(5);
        System.out.printf("cat average temp is - %.2f.", catAverageTemp(new double[]{35, 36, 38.9, 50, 45}));
        System.out.println();
        System.out.printf("%.2f", catTemp(35, 36, 38.9, 50, 45));
        System.out.println();

        verifyEquals("40.98", String.format("%.2f", catTemp(35, 36, 38.9, 50, 45)).replace(',', '.'));

        printTaskNumber(6);
        System.out.println(convertingDoubleToCost(10.75));
        verifyEquals("10 руб 75 коп", convertingDoubleToCost(10.75));

        returnPrice(10.75);

        printTaskNumber(7);
        System.out.println(showWeight(10.75));
        verifyEquals("10 кг 75 гр", showWeight(10.75));

        System.out.println(showWeight2(10.75));
        verifyEquals("10 кг 75 гр", showWeight2(10.75));

        printTaskNumber(8);
        System.out.printf("%.2f\n", 8.32 * 0.56246);
        verifyEquals("4.68", (String.format("%.2f", sumOfPurchase(8.32, 0.56246))).replace(',', '.'));

        printTaskNumber(9);
        createBillKg("Apples", 1.55, 1.56);
        createBillPieces("Bread", 2.55, 3);

        verifyEquals("7 руб 65 коп", roundedSumPurchase(2.55, 3));

        printTaskNumber(10);
        System.out.println(getSalary(8, 10.457));

        verifyEquals("1673 руб 12 коп", getSalary(8, 10.457));

        printTaskNumber(11);
        String period = "Март 2022";
        System.out.println(period);

        salaryOfDivision("Смирнова Мария Ивановна\t\t", getSalary(8, 437.50) + "\n");
        salaryOfDivision("Серебряков Иван Петрович\t", getSalary(8, 800.35) + "\n");

        printTaskNumber(12);
        showScheme(0);

        printTaskNumber(13);
        luckyNumber(1981);

        printTaskNumber(14);
        int a = 1;
        int b = 30;
        int c = 20;

        if (getDifferentAverageMedian(a, b, c) > 2) {
            System.out.println("Среднее значение " + getAverageOfThreeNumbers(a, b, c)
                    + " отличается от медианы " + getMedianOfThreeNumbers(a, b, c)
                    + " на " + getDifferentAverageMedian(a, b, c));
        } else {
            System.out.println("Среднее значение = " + getAverageOfThreeNumbers(a, b, c)
                    + ", медиана = " + getMedianOfThreeNumbers(a, b, c));
        }

        printTaskNumber(15);
        roundingFloor(10.80);

        printTaskNumber(16);
        int x = 3;
        int y = 4;
        int z = 20;

        System.out.println(Math.ceil(Math.sqrt(Math.fma(x, y, z) * Math.pow(x, y)) / Math.PI));

        printTaskNumber(17);
        toTask17_1(10);
        toTask17_2(85);
        System.out.println(toTask17_4(2));
        toTask17_4_1(2);
        toTask17_5(5, -6);
        toTask17_6(5, 85);

        printTaskNumber(18);
        poweredNumber(3);

        printTaskNumber(19);
        System.out.println(getRandomNumber());

        printTaskNumber(20);
        System.out.println(isLeapYear(2018));
    }
}
