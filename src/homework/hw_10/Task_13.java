package homework.hw_10;

public class Task_13 {

    public static int task_14(String str){

        char[] arr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 48 && arr[i] <= 57) {
                return 0;
            } else {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(task_14("abc"));
        System.out.println(task_14("ABC"));
        System.out.println(task_14("123"));
    }
}
