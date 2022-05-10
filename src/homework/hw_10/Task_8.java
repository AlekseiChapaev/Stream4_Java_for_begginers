package homework.hw_10;

public class Task_8 {
    public static void task_8(String str){
        String str2 = str.substring(1).toLowerCase();
        System.out.println(String.valueOf(str.charAt(0)).toUpperCase().concat(str2));
    }

    public static void main(String[] args) {
        task_8("ташкент");
        task_8("ЧикаГО");
    }
}
