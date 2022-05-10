package homework.hw_10;

public class Task_7_AddCharacters {

    public static void addCharacters(String str){
        str = str.trim();
        String p = "\"";
        String dot = ".";
        System.out.println(p.concat(str).concat(dot).concat(p));
    }

    public static void main(String[] args) {
        addCharacters("One");
        addCharacters("    TWO  ");
    }
}
