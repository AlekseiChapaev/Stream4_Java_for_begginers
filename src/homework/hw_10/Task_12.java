package homework.hw_10;

import java.util.Arrays;

public class Task_12 {

    public static String[] task_12(String str){

        String[] param = {"Имя: ", "Отчество: ", "Фамилия: "};
        String[] arrStr = str.split(" ");
        String[] res = new String[arrStr.length];

        for (int i = 0; i < arrStr.length; i++) {
            res[i] = param[i].concat(arrStr[i]);
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(task_12("Александр Сергеевич Пушкин")));
    }
}
