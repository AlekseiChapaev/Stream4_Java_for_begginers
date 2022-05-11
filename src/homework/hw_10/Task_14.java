package homework.hw_10;

public class Task_14 {
    public static boolean task_14(String let1, String let2) {

        return let1.charAt(0) < let2.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(task_14("a", "m"));
        System.out.println(task_14("m", "l"));
    }
}