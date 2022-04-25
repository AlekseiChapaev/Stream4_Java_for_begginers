package school;

public class Person {

    public static void main(String[] args){

        int yob = 1981;
        int age = 2020 - yob;
        String phraseStart = "Если человек родился в ";
        String phraseMiddle = " году, то его возраст - ";
        String phraseEnd = " (разница между 2020 и ";

        System.out.println(phraseStart + yob + phraseMiddle + age + phraseEnd + yob + ")");




    }
}
