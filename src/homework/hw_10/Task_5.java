package homework.hw_10;

public class Task_5 {

    public static int task5(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).toLowerCase().contains("a")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(task5("Abracadabra"));
        System.out.println(task5("Homenum Revelio"));
    }
}
