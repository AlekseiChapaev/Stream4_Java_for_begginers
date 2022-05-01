package homework.hw_8;

import java.util.Arrays;

public class Utils {

    public static String line() {
        return "\n-----------------------------------------------------------\n";
    }

    public static String taskNumber(int tuskNumber) {
        return "\t\t\t\t\tTask# " + tuskNumber + "\n";
    }

    public static void printTaskNumber(int num) {
        System.out.println(line().concat(taskNumber(num)));
    }

    public static boolean isStringsEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    public static boolean isValuesEquals(double num1, double num2) {
        return num1 == num2;
    }

    public static void printTable(String nameClass1, String nameClass2, String result, String nameValue1, String nameValue2, double val1, double val2, boolean equals) {
        String space5t = "\t\t\t\t\t|";
        String space2t = "\t\t|";
        String equal = " = ";
        System.out.println(nameClass1 + space5t + nameClass2 + space5t + result +
                Utils.line() +
                nameValue1 + equal + val1 + space2t + nameValue2 + equal + val2 + space2t + equals);
    }

    public static int[] getFiveIntNumbersArray(int a, int b, int c, int d, int e) {

        return new int[]{a, b, c, d, e};
    }

    public static double[] getFiveDoubleNumbersArray(double a, double b, double c, double d, double e) {

        return new double[]{a, b, c, d, e};
    }

    public static String[] getFiveStringArray(String a, String b, String c, String d, String e) {
        return new String[]{a, b, c, d, e};
    }

    public static double[] getMultArray(int[] arr, double mult) {

        double[] array = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i] * mult;
        }
        return array;
    }

    public static int getEvenNumbersInArray(int[] arr) {
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    public static int getOddNumbersInArray(int[] arr) {
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }

    public static Boolean[] isNumbersOfArrayMore(int[] arr, int value) {
        Boolean[] newArr = new Boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] > value;
        }
        return newArr;
    }

    public static String getRowFromArray(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    public static int getSumOfPartArray(int[] arr) {
        int sum = 0;
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] getMultNumber(int num) {
        if (num < 10 && num >= 1) {
            int[] arr = new int[11];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * num;
            }
            return arr;
        }
        return null;
    }

    public static int[] getTask17(int[] arr) {
        int countOdd = getOddNumbersInArray(arr);
        int countEven = arr.length - countOdd;

        if (countOdd == countEven) {
            return new int[0];
        } else if (countOdd > countEven) {
            int[] arrTask17 = new int[countOdd];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    arrTask17[index++] = arr[i];
                }
            }
            return arrTask17;
        } else {
            int index = 0;
            int[] arrTask17 = new int[countEven];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arrTask17[index++] = arr[i];
                }
            }
            return arrTask17;
        }
    }

    public static int[] getTask18(int lenght) {
        int[] arr = new int[lenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + (int) (Math.random() * 99);
        }
        return arr;
    }

    public static int[] task19(int l, int c) {
        int[] arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ((Math.pow(10, c) - 1 - Math.pow(10, c - 1)) + Math.pow(10, c - 1)));
        }
        return arr;
    }

    public static int[] getTask20(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                count++;
            }
        }
        int[] newArray = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10 && arr[i] < 100) {
                newArray[index++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        return newArray;
    }

    public static int[] getArray21(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i] / 10 - arr[i] % 10;
        }
        System.out.println(Arrays.toString(arr));
        return newArray;
    }

    public static String[] getPhone(int[] arr) {
        String[] StringArr = new String[arr.length];
        String[] newArray = new String[2];
        if (arr.length != 11) {
            return null;
        } else {
            for (int i = 0; i < arr.length; i++) {
                StringArr[i] = String.valueOf(arr[i]);
            }
        }
        newArray[0] = arr[0] + "(" + arr[1] + arr[2] + arr[3] + ")" + arr[4] + arr[5] + arr[6] + "-" + arr[7] + arr[8] + "-" + arr[9] + arr[10];
        newArray[1] = "USA";
        return newArray;
    }

    public static int[] getArray23(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = Integer.MIN_VALUE;
                    count++;
                }
            }
        }
        int[] newArr = new int[arr.length - count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

    public static String getArray24(int[] arr) {
        Arrays.sort(arr);
        int countNotUnic = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                countNotUnic++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return "countNotUnic = " + countNotUnic + " countUnic = " + (arr.length - countNotUnic);
    }

    public static String getArray24_1(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = Integer.MIN_VALUE;
                    count++;
                }
            }
        }
        return "countNotUnic = " + count + " countUnic = " + (arr.length - count);
    }


    public static int[] getArray25(int[] arr, int a, int b) {
        System.out.println(Arrays.toString(arr));
        if (a > b) {
            int count = a - b + 1;
            int[] newArray = new int[count];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arr[b + i];
            }
            return newArray;
        } else if (a < b) {
            int count = Math.abs(a - b) + 1;
            int[] newArray = new int[count];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arr[a + i];
            }
            return newArray;
        } else {
            int[] newArray = new int[1];
            newArray[0] = arr[b - 1];
            return newArray;
        }
    }

    public static int[] getTask26(int[] arr1, int[] arr2) {

        int[] newArr1 = getArray23(arr1);
        int[] newArr2 = getArray23(arr2);
        int[] newArr = new int[newArr1.length + newArr2.length];
        for (int i = 0; i < newArr1.length; i++) {
            newArr[i] = newArr1[i];
        }
        int count = newArr1.length;
        for (int i = 0; i < newArr2.length; i++) {
            newArr[count++] = newArr2[i];
        }
        return getArray23(newArr);
    }
}

