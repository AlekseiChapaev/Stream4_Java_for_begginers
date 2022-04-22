package homework;

public class MainTraining {

    public static double getArraysAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = arr[i] + sum;
        }
        return 1.0 * sum / arr.length;
    }

    public static int minValueInArray(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 2;
        arr[2] = 10;


        Methods train = new Methods();

        train.getMinValue(5, 2, 10);
        train.getAverageValue(5, 2, 10);

        if(Math.abs(train.getMinValue(5,2,10) - train.getAverageValue( 5, 2, 10)) > 3.51){
            System.out.println("Большой разброс чисел");
        } else {
            System.out.println("Маленький разброс чисел");
        }


        if(Math.abs(minValueInArray(arr) - getArraysAverage(arr)) > 3.51){
            System.out.println("Большой разброс чисел");
        } else {
            System.out.println("Маленький разброс чисел");
        }



    }
}
