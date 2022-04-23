package homework.hw_8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        HW8 hw8 = new HW8();
        HW8_1 hw8_1 = new HW8_1();

        Utils.printTaskNumber(6);
        Utils.printTable("HW8", "HW8_1", "areEquals?", "Double d", "Double d_1", hw8.doub, hw8_1.d, Utils.isValuesEquals(hw8.doub, hw8_1.d));
        System.out.println();
        Utils.printTable("HW8", "HW8_1", "areEquals?", "Integer i", "Integer i_1", hw8.integer, hw8_1.i, Utils.isValuesEquals(hw8.integer, hw8_1.i));


        Utils.printTaskNumber(7);
        System.out.println(Arrays.toString(Utils.getFiveIntNumbersArray(1, 5, 6, 2, 3)));

        Utils.printTaskNumber(8);
        System.out.println(Arrays.toString(Utils.getFiveDoubleNumbersArray(1.5, 5.4, 6.3, 2.2, 3.1)));

        Utils.printTaskNumber(9);
        System.out.println(Arrays.toString(Utils.getFiveStringArray("Hi", "all", "lets", "study", "Java")));

        Utils.printTaskNumber(10);
        System.out.println(Arrays.toString(Utils.getMultArray(Utils.getFiveIntNumbersArray(2, 5, 6, 7, 10), 2.5)));

        Utils.printTaskNumber(11);
        System.out.println(Utils.getEvenNumbersInArray(new int[]{1, 5, 6, 2, 3}));

        Utils.printTaskNumber(12);
        System.out.println(Utils.getOddNumbersInArray(new int[]{1, 5, 6, 2, 3}));

        Utils.printTaskNumber(13);
        System.out.println(Arrays.toString(Utils.isNumbersOfArrayMore(new int[]{1, 5, 60, 2, 3, 14, 10, 3}, 10)));

        Utils.printTaskNumber(14);
        System.out.println(Utils.getRowFromArray(new String[]{"Hi", "all", "lets", "study", "Java"}));

        Utils.printTaskNumber(15);
        System.out.println(Utils.getSumOfPartArray(new int[]{1, 5, 60, 2, 3, 14, 3}));

        Utils.printTaskNumber(16);
        System.out.println(Arrays.toString(Utils.getMultNumber(9)));

        Utils.printTaskNumber(17);
        System.out.println(Arrays.toString(Utils.getTask17(new int[]{1, 5, 8, 4, 60, 2, 3, 3, 77, 4, 6})));

        Utils.printTaskNumber(18);
        System.out.println(Arrays.toString(Utils.getTask18(10)));

        Utils.printTaskNumber(19);
        System.out.println(Arrays.toString(Utils.task19(10, 3)));

        Utils.printTaskNumber(20);
        System.out.println(Arrays.toString(Utils.getTask20(Utils.getTask18(10))));

        Utils.printTaskNumber(21);
        System.out.println(Arrays.toString(Utils.getArray21(Utils.getTask20(Utils.getTask18(10)))));

        Utils.printTaskNumber(22);
        System.out.println(Arrays.toString(Utils.getPhone(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 8})));

        Utils.printTaskNumber(23);
        System.out.println(Arrays.toString(Utils.getArray23(new int[]{1, 1, 1, 2, 3, 4, 4})));

        Utils.printTaskNumber(24);
        System.out.println(Arrays.toString(Utils.getArray24(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 8})));

        Utils.printTaskNumber(25);
        System.out.println(Arrays.toString(Utils.getArray25(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 8}, 11, 11)));

        Utils.printTaskNumber(26);

        int[] arr = {5, 7, 9, 1, 5};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
