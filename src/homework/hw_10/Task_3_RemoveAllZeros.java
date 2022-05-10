package homework.hw_10;

public class Task_3_RemoveAllZeros {

    public static void removeAllZeros(String str){
        if(str.isEmpty()){
            System.out.println("Строка пустая");
        } else{
            System.out.println(str.replace(" ", "").replace("0", ""));
        }
    }

    public static void main(String[] args) {
        removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ");
        removeAllZeros(" 0000000111");
    }
}
