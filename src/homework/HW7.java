package homework;

import java.util.Arrays;

public class HW7 {

    public static void printTaskNumber(int num) {
        System.out.println("\n****************************************************\n\t\t\t\t\tTask# " + num + "\n");
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static boolean isCatColor(String[] arr, String color) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(color)) {
                return true;
            }
        }
        return false;
    }

    public static void isCatColor2(String[] arr, String color) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(color)) {
                System.out.print("true ");
            } else {
                System.out.print("false ");
            }
        }
    }

    public static void findColorCat(String[] arr, String color) {
        String message = "Накорми кота!";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(color)) {
                System.out.println(message);
            }
        }
    }

    public static void messageForAge(int[] arr, int age) {
        String message = "Отнеси кота на прививку!";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < age) {
                System.out.println(message);
            }
        }
    }

    public static String getStringDates(String[] arr, int num) {
        String dates = "";
        for (int i = 0; i < arr.length; i++) {
            dates = arr[num];
        }
        return dates;
    }

    public static int getIntDates(int[] arr, int num) {
        int data = 0;
        for (int i = 0; i < arr.length; i++) {
            data = arr[num];
        }
        return data;
    }

    public static void printCatsDates(String[] names, String[] colors, int[] age, int number) {
        System.out.println(getStringDates(names, number) + " " + getStringDates(colors, number) + " " + getIntDates(age, number));
    }

    public static void printAges(String[] names, int[] age, int catsAge) {
        for (int i = 0; i < age.length; i++) {
            if (age[i] > catsAge) {
                System.out.print(names[i] + " ");
            }
        }
    }

    public static void printMassage(String[] names, String[] colors, String name, String color) {
        String message = "Накорми кота!";
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name) && isCatColor(colors, color)) {
                System.out.println(message);
            }
        }
    }

    public static void printCatName(String[] name, int[] ages, int age) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] <= age && i % 2 == 0) {
                System.out.print(name[i] + " ");
            }
        }
    }

    public static void getAvaregeInArray(int[] arr) {
        double temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        System.out.println(temp / arr.length);
    }

    public static int[] getRandomArray(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int[] getRandomOddArray(int arrayLenght) {
        int[] arr = new int[arrayLenght];
        for (int i = 0; i < arr.length; i++) {
            int odd = (int) (Math.random() * 100);
            if (odd % 2 != 0) {
                arr[i] = odd;
            } else {
                arr[i] = odd + 1;
            }
        }
        return arr;
    }

    public static int[] getRandomEvenArray(int arrayLenght) {
        int[] arr = new int[arrayLenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 100)) * 2;
        }
        return arr;
    }

    public static int findMaxValueInArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMinValueInArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findAverageValueInArray(int[] arr) {
        int average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        return average / arr.length;
    }

    public static void commonMethod(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr));

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max = " + max);

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        System.out.println("Average = " + temp / arr.length);
    }

    public static int[][] getDoubleArray(int lenghtArray, int lenghtElementOfArray){
        int[][] array = new int[lenghtArray][lenghtElementOfArray];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random() * 10);
            }
        }
        return array;
    }

    public static int createAndGetSumElementsDoubleArray(int lenghtArray, int lenghtElementOfArray){
        int[][] arr = new int[lenghtArray][lenghtElementOfArray];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 10);
                count += arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        return count;
    }

    public static void main(String[] args) {

        printTaskNumber(1);
        String[] catsNames = {"Мурзик", "Пыжик", "Мурка", "Васька", "Чернып", "Дымка", "Патрик", "Зорро"};
        printArray(catsNames);

        printTaskNumber(2);
        catsNames[1] = "Рыжик";
        catsNames[4] = "Черныш";
        printArray(catsNames);

        printTaskNumber(3);
        String[] catsColors = {"Black", "Grey", "Brown", "Red", "Grey", "Red", "Grey", "Brown"};
        printArray(catsColors);

        printTaskNumber(4);
        int[] catsAges = {2, 1, 2, 5, 3, 7, 3, 3};
        printIntArray(catsAges);


        printTaskNumber(5);
        System.out.println(isCatColor(catsColors, "Red"));

        printTaskNumber(5_2);
        isCatColor2(catsColors, "Red");

        printTaskNumber(6_1);
        System.out.println(catsNames[6]);

        printTaskNumber(6_1);
        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }

        printTaskNumber(6_2);
        for (int i = 1; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.print(catsNames[i] + " ");
            }
        }

        printTaskNumber(6_3);
        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0) {
                System.out.print(catsColors[i] + " ");
            }
        }

        printTaskNumber(6_4);
        for (int i = 1; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.print(catsColors[i] + " ");
            }
        }

        printTaskNumber(7);
        findColorCat(catsColors, "Grey");

        printTaskNumber(8);
        messageForAge(catsAges, 2);

        printTaskNumber(9);
        System.out.println(catsNames[7] + " " + catsColors[7] + " " + catsAges[7]);
        printCatsDates(catsNames, catsColors, catsAges, 7);

        printTaskNumber(10);
        printAges(catsNames, catsAges, 2);

        printTaskNumber(11);
        printMassage(catsNames, catsColors, "Рыжик", "Red");

        printTaskNumber(12);
        double temp = 0;
        for (int i = 0; i < catsAges.length; i++) {
            temp += catsAges[i];
        }
        System.out.println(temp / catsAges.length);

        printTaskNumber(13);
        int min = 100;
        for (int i = 0; i < catsAges.length; i++) {
            if (min > catsAges[i]) {
                min = catsAges[i];
            }
        }
        System.out.println(min);

        printTaskNumber(14);
        int max = 0;
        for (int i = 0; i < catsAges.length; i++) {
            if (max < catsAges[i]) {
                max = catsAges[i];
            }
        }
        System.out.println(max);

        printTaskNumber(15);
        int count = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("Grey")) {
                count++;
            }
        }
        System.out.println(count);

        printTaskNumber(16);
        printCatName(catsNames, catsAges, 3);

        printTaskNumber(17);
        int num = 0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + num;
            num++;
        }
        System.out.println(Arrays.toString(arr));


        printTaskNumber(17_1);

        int[] arr17 = new int[10];
        for (int i = 0; i < arr17.length; i++) {
            int random = (int)(Math.random() * 10);
            if(random % 2 == 0) {
                arr17[i] = random;
            } else{
                arr17[i] = random + 1;
            }
        }
        System.out.println(Arrays.toString(arr17));


        printTaskNumber(18);
        getAvaregeInArray(catsAges);

        printTaskNumber(19);
        int first = -1000;
        int num19 = 1;
        int[] array19 = new int[50];
        for (int i = 0; i < array19.length; i++) {
            array19[i] = i + first + num19;
            num19++;

        }
        System.out.println(Arrays.toString(array19));



        printTaskNumber(20);
        System.out.println(Arrays.toString(getRandomArray(10)));


        printTaskNumber(21);
        System.out.println(Arrays.toString(getRandomArray(10)));
        System.out.println(findMaxValueInArray(getRandomArray(10)));
        System.out.println(findMinValueInArray(getRandomArray(10)));
        System.out.println(findAverageValueInArray(getRandomArray(10)));
        commonMethod(10);

        printTaskNumber(22);
        System.out.println(Arrays.toString(getRandomOddArray(10)));
        System.out.println(Arrays.toString(getRandomEvenArray(10)));

        printTaskNumber(23);



        String[][] catsString = {
                {"Мурзик", "2", "Grey"},
                {"Черныш", "3", "Black"},
                {"Мурка", "4", "Grey"},
                {"Васька", "1", "Brown"},
                {"Рыжик", "5", "Red"},
                {"Дымка", "6", "Grey"},
                {"Патрик", "9", "Red"},
                {"Зорро", "10", "Grey"},
        };

        for (int i = 0; i < catsString.length; i++) {
            if (i % 2 != 0) {
                for (int k = 0; k < catsString[i].length; k++) {
                System.out.print(catsString[i][k] + " ");
                }
                System.out.println();
            }
        }

        printTaskNumber(24);
        System.out.println(Arrays.deepToString(getDoubleArray(4, 8)));

        printTaskNumber(25);
        System.out.println(createAndGetSumElementsDoubleArray(4, 8));


    }

}
