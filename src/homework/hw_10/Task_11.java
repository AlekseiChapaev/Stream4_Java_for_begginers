package homework.hw_10;

import java.util.Arrays;

public class Task_11 {

    public static String[] task_11(String str){

        return str.split(" ");
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(task_11("QA for Everyone")));
        System.out.println(Arrays.toString(task_11("Александр Сергеевич Пушкин")));
    }
}
