package homework.hw_1to7;

public class Bottles {

    public static void main(String[] args) {

        String bottles = " bottles of beer";
        String bottle = " bottle of beer ";
        String wall = " on the wall";
        String commaSpace = ", ";
        String dot = ".";
        String take = "Take one down and pass it around";
        String noMoreL = "no more";
        String noMoreC = "No more";
        String go = "Go to the store and buy some more";
        String ln = "\n";

        for(int i = 99; i > -1; i--){
            if(i == 2){
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
            } else if (i == 1){
                System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
                System.out.println(take + commaSpace + noMoreL + bottles + wall + dot + ln);
            }else if (i == 0){
                System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
                System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot + ln);
            }else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);
            }
        }



    }


}
