package homework;

import java.util.Arrays;

public class Training {

    public static String plusLetter(){
        String str = "";
        for(int i = 0; i < 10; i++){
            str = str + i + String.valueOf(i);
        }
        return str;
    }




    public static void main(String[] args) {

       // System.out.println(printNumbers13());

        System.out.println(plusLetter());

    }
}
