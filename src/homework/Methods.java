package homework;


import org.w3c.dom.ls.LSOutput;

public class Methods {

    public int getMinValue (int a, int b, int c){
        if(a < b && a < c){
            return a;
        } else if (b < a && b < c){
            return b;
        } else{
            return c;
        }
    }

    public double getAverageValue(int a, int b, int c){

        return (a + b + c) / 3.0;
    }

//    public static void main(String[] args) {
//
//        int min = getMinValue(5, 2, 10);
//        double avarege = getAvaregeValue(5, 2, 10);
//
//        if(Math.abs(min - avarege) > 3.51){
//            System.out.println("Большой разброс чисел");
//        } else {
//            System.out.println("Маленький разброс чисел");
//        }
//
//    }

}
