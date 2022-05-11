package homework.hw_10;

public class Task_10 {

    public static boolean task_10(String str){
        return String.valueOf(str.charAt(0)).equalsIgnoreCase(String.valueOf(str.charAt(str.length() - 1)).toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(task_10("Abracadabra"));
        System.out.println(task_10("Whippersnapper"));
    }
}
