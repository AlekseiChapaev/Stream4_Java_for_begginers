public class Student {
    public static void main(String[] args) {

        int age1 = 10;
        String firstName1 = "Вова ";
        String lastName1 = "Сидоров ";
        int grade1 = 5;

        int age2 = 14;
        String firstName2 = "Маша ";
        String lastName2 = "Семенова ";
        int grade2 = 9;

        String line = "****************************************";
        String clas = "-го класса ";

        System.out.println(line);
        System.out.println("Ученик " + grade1 + clas + firstName1 + lastName1 + age1 + " лет");
        System.out.println(line);
        System.out.println("Ученица " + grade2 + clas + firstName2 + lastName2 + age2 + " лет");
        System.out.println(line);



    }
}
