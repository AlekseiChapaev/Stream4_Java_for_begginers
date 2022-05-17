package homework.hw_10;

public class Task_10 {

    public static boolean task_10(String str){
        str = str.toLowerCase();
        //return String.valueOf(str.charAt(0)).equalsIgnoreCase(String.valueOf(str.charAt(str.length() - 1)).toLowerCase());
        return str.substring(0, 1).equals(str.substring(str.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(task_10("Abracadabra"));
        System.out.println(task_10("Whippersnapper"));
    }
}
