package homework.hw_10;

public class Task_4_RemoveAllSpaces {

    public static void removeAllSpaces(String str){
        if(str.isEmpty()){
            System.out.println("Строка пустая");
        } else{
            System.out.println(str.replace(" ", ""));
        }
    }

    public static void main(String[] args) {
        removeAllSpaces("    QA   4  Everyone   ");
        removeAllSpaces("p a     n d a   ");
    }
}
