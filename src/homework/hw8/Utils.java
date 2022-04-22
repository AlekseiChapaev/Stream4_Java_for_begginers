package homework.hw8;

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

    public static int[] getArrayOddNumbers(int[] arr) {
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOdd++;
            }
        }
        if (countOdd > arr.length / 2) {
            int[] oddArray = new int[countOdd];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    oddArray[count] = arr[i];
                    count++;
                }
            }
            return oddArray;
        } else {
            int[] evenArray = new int[countOdd];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    evenArray[count] = arr[i];
                    count++;
                }
            }
            return evenArray;
        }
    }

    public static int[] getArrayFromLenght(int lenght) {
        int[] arr = new int[lenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int[] getArrayNumbers(int lenghtArray, int countNumbers) {
        int[] arr = new int[lenghtArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Math.pow(10, countNumbers));
        }
        return arr;
    }

    public static int[] getArrayTwoNumbers(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) {
                newArray[i] = arr[i] + 10;
            } else {
                newArray[i] = arr[i];
            }
        }
        return newArray;
    }

    public static int[] getArray21(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i] / 10 - arr[i] % 10;
        }
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
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                return null;
            } else {
                array[i] = (int) (Math.random() * 10);
                for (int j = 0; j < arr.length; j++) {
                    if (array[i] == arr[j]) {
                        array[i] = array[i] * (int) (Math.random() * 10);
                        j = 0;
                    }
                }

            }
        }
        return array;
    }

    public static int[] getArray24(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr[i]; i++) {
            if (arr[i] > 0) {
                newArray[i] = (int) (Math.random() * Integer.MAX_VALUE);
            }
        }
        return newArray;
    }

    public static int[] getArray25(int[] arr, int a, int b) {
        if (a > b) {
            int count = a - b;
            int[] newArray = new int[count];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arr[b + i];
            }
            return newArray;
        } else if(a < b) {
            int count = Math.abs(a - b);
            int[] newArray = new int[count];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = arr[a + i];
            }
            return newArray;
        } else{
            int[] newArray = new int[1];
            newArray[0] = arr[b - 1];
            return newArray;
        }
    }


}

