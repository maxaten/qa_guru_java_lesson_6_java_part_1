package org.waineenterpraises;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;


        //математические операторы
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (a--));
        // Проверьте разницу в d++ и ++d
        System.out.println("d++   = " +  (d++));
        System.out.println("++d   = " +  (++d));



        boolean x = true;
        boolean y = false;
        boolean result = 5>=3;
        boolean result0 = 5<=3;

        boolean result1 = x && x && x;
        boolean result2 = x && x && y;
        boolean result3 = x || x || y;
        boolean result4 = y || y || x;

        //логические операторы и операторы сравнения
        System.out.println(result0);
        System.out.println(result);
        System.out.println("5==5 " + (5==5));
        System.out.println("5!=5 " + (5!=5));
        System.out.println("x && x && x " + result1);
        System.out.println("x && x && y " + result2);
        System.out.println("x || x || y " + result3);
        System.out.println("y || y || x " + result4);



        float f1 = 14.56f;
        double d1 = 15.7;
        long l1 = 18578454L;
        byte b1 = 127;
        byte b2 = 127;
        short s1 = 32767;
        short s2 = 32700;
        int i1 = 2147483647;
        int i2 = 2147483600;
        int i3 = 15892;


        //вычисление разных типов данных
        System.out.println(d1 + l1);
        System.out.println(d1 + i3);
        System.out.println(d1 + i3);
        System.out.println(b1+l1);
        System.out.println(s1+d1);
        System.out.println(f1+i1);

        //переполнение
        System.out.println((byte) (b1 + b2));
        System.out.println(i1 + i2);
        System.out.println((short) (s1 + s2));











    }
}