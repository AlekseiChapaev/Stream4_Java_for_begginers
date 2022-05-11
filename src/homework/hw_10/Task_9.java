package homework.hw_10;

public class Task_9 {
    public static void task_9(String str, String param){

        System.out.println(str.substring(str.indexOf(param), str.lastIndexOf(param) + 1));
    }

    public static void main(String[] args) {
        task_9("Abracadabra", "b");
        task_9("Whippersnapper", "p");
    }
}