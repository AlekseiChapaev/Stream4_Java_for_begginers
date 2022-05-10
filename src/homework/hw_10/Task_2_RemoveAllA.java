package homework.hw_10;

public class Task_2_RemoveAllA {

    public static void removeAllA(String str){
        if(str.isEmpty()){
            System.out.println("Строка пустая");
        } else{
            System.out.println(str.replace("a", "").trim());
        }
    }

    public static void main(String[] args) {
        removeAllA("    QA4Everyone   ");
        removeAllA("panda   ");
    }
}
