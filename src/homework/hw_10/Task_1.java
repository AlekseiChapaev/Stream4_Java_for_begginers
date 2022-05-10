package homework.hw_10;

public class Task_1 {

    public static void whiteSpaces(String str) {
        if (str.isEmpty()) {
            System.out.println("Строка пустая");
        } else if (str.trim().length() != str.length()) {
            System.out.println("Лишние пробелы удалены");
        } else {
            System.out.println("Пробелов не было");
        }
    }

    public static void main(String[] args) {
        whiteSpaces("    QA4Everyone   ");
        whiteSpaces("QA4Everyone");
        whiteSpaces("");
    }
}
