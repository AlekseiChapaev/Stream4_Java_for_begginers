package homework;


public class HW {

    static int largest(int a, int b, int c){

        return Math.max(Math.max(a, b), c);
    }

    static int getMinArray(int a, int b, int c){

        int min = Integer.MAX_VALUE;
        int[] arr = {a, b, c};
        for(int i = 0; i < arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }



    public static void main(String[] args) {

        System.out.println(largest(4, 5, 8));

        System.out.println(getMinArray(4, -8, -56));
    }
}
