package homework;

public class HW3 {

    public static void main(String[] args) {

        String taskNumber = "**********************************\n\t\t\tTask # ";

        System.out.println(taskNumber + 2);
        byte a = 5;
        byte b = 10;
        System.out.println("byte a = " + a);
        System.out.println("byte b = " + b);

        System.out.println(taskNumber + 3);
        short sh1 = Short.MIN_VALUE;
        short sh2 = (short) (sh1 + 60000);
        System.out.println("short sh1 = " + sh1);
        System.out.println("short sh2 = " + sh2);

        System.out.println(taskNumber + 4);
        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;
        System.out.println("int min " + iMin);
        System.out.println("int max " + iMax);

        System.out.println(taskNumber + 5);
        long phoneNumber = 18009998877L;
        System.out.println("phoneNumber is " + phoneNumber);

        System.out.println(taskNumber + 6);
        float f = 100.101101F;
        double d = 100.101101;
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);

        System.out.println(taskNumber + 7);
        Double numb = 10.09999;
        Double numb2 = 20.09999;
        Double dd = Double.sum(numb, numb2);
        Float ff = Float.sum(numb.floatValue(), numb2.floatValue());
        System.out.println(dd);
        System.out.println(ff);

        System.out.println(taskNumber + 8);
        double result = 10 * 1.0 / 3;
        System.out.println(result);

        System.out.println(taskNumber + 9);
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        System.out.println(taskNumber + 10);
        System.out.println(".   .   .....   .       .          ..");
        System.out.println(".   .   .       .       .        .    .");
        System.out.println(".....   .....   .       .       .      .");
        System.out.println(".   .   .       .       .        .    .");
        System.out.println(".   .   .....   .....   .....      ..");

        System.out.println(taskNumber + 11);
        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = -120;
        Float t4 = -505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = -1000000.001;
        Short t9 = 1010;

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        System.out.println(taskNumber + 12);
        System.out.println("Type\t Size in bits \t min \t max");
        System.out.println(Byte.TYPE + "\t\t" + Byte.SIZE + "\t\t\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(taskNumber + 13);
        Integer num1 = 100;
        Integer num2 = 100;
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));
        if (num1.equals(num2)) {
            System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));
        } else {
            System.out.println("Если num1 != num2, то результат сравнения методом .equal = " + num1.equals(num2));
        }

        Integer num11 = 100;
        Integer num21 = 50;
        System.out.println("Если num1 != num2, то результат сравнения методом .equal = " + num11.equals(num21));

        System.out.println(taskNumber + 14);

        int q = 1586;
        int q2 = 2000;
        System.out.println(Integer.compare(q,q2));

        System.out.println(taskNumber + 15);
        Float fl = 234.9999F;
        System.out.println(fl.intValue());

        System.out.println(taskNumber + 16);
        double d1 = 1.2;
        double d2 = 1.5;
        System.out.println(Double.sum(d1, d2));

        System.out.println(taskNumber + 17);
        Float float1 = 1.5F;
        Float float2 = 1.6F;
        System.out.println(Integer.sum(float1.intValue(), float2.intValue()));

        System.out.println(taskNumber + 18);
        Short short1 = 12000;
        Short short2 = 12300;
        String phrase = short1 + " - " + short2 + " = ";
        System.out.println(phrase + Short.compare(short1, short2));
        short1 = 12500;
        System.out.println(phrase + Short.compare(short1, short2));

        System.out.println(taskNumber + 19);
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(doub1 - doub2);
        System.out.printf("%.2f\n", doub1 - doub2);
        System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));
        System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

        System.out.println(taskNumber + 20);

        double temp = 40;
        double avTemp = temp;
        temp = 20;

        System.out.println((avTemp + temp) / 2);


        System.out.println(taskNumber + 21);

        Number n = Long.MAX_VALUE;
        System.out.println("Переменная n может принимать значения: \nn = " + n);
        n = 10;
        System.out.println("n = " + n);
        n = 10.999999999;
        System.out.println("n = " + n + "\nЭто возможно, потому что класс Number является суперклассом и содержит в себе значения примитивных типов");

        System.out.println(taskNumber + 22);

        Integer numberInteger = 100;

        System.out.println("Если мы складываем два числовых значения " + numberInteger
                + " и " + numberInteger + ", мы получаем сумму этих значений: " + Integer.sum(numberInteger, numberInteger)
                + ", если мы складываем два строковых значения " + numberInteger + " и " + numberInteger
                + " то мы получаем конкатинацию этих значений " + numberInteger.toString() + numberInteger.toString());

        System.out.println(taskNumber + 23);

        String text1 = "36.6 градусов по Цельсию  = ";
        String text2 = " градусов по Фаренгейту";
        String text3 = " kilogram = ";
        String text4 = " lbs, ";
        String text5 = " lb = ";
        String text6 = " kg";

        double tempF = 25;
        System.out.printf(text1 + "%.2f", (tempF - 32) * 5 / 9);
        System.out.println(text2);

        double weightLbs = 50;
        double weightKg = 50;
        System.out.print(weightKg + text3 + weightKg * 2.205 + text4 + weightLbs + text5);
        System.out.printf("%.3f", weightLbs / 2.205);
        System.out.println(text6);
    }
}
