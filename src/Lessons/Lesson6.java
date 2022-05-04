package Lessons;

public class Lesson6 {
    public static void main(String[] args) {

        /*Print 99 times

        String bottles = " bottles of beer";
        String bottle = " bottle of beer";
        String wall = " on the wall";
        String take = "Take one down and pass it around";
        String commaSpace = ", ";
        String dot = ".";
        String go = "Go to the store and buy some more";
        String noMoreC = "No more";
        String noMoreL = "no more";
        String ln = "\n";

          for (int i = 99; i > -1; i--) {
            if (i == 2) {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottle + wall + dot + ln);
            } else if (i == 1) {
                System.out.println(i + bottle + wall + commaSpace + i + bottle + dot);
                System.out.println(take + commaSpace + noMoreL + bottles + wall + dot + ln);
            } else if (i == 0) {
                System.out.println(noMoreC + bottles + wall + commaSpace + noMoreL + bottles + dot);
                System.out.println(go + commaSpace + (i + 99) + bottles + wall + dot);
            } else {
                System.out.println(i + bottles + wall + commaSpace + i + bottles + dot);
                System.out.println(take + commaSpace + (i - 1) + bottles + wall + dot + ln);*/


        //Печатаем "Java for beginners" для всех чисел от 1 до 5 включительно
        for (int i = 1; i < 6; i++) {
           System.out.println("Java for beginners"+ i);
        }

        //Распечатать последовательность чисел от 0 до 9 включительно.
        for( int i = 0;i <10;i++){
            System.out.println(i);
        }
        //Распечатать последовательность чисел от 10 исключительно до 0 включительно.
        for (int i =10;i>0;i--){
            System.out.println(i);
        }
        //Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
        for (int i=7; i<15;i+=7){
            System.out.println(i);
        }
        //Распечатать последовательность которая начинается с минимального значения типа данных short
        // и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.


        /*for (short i = Short.MIN_VALUE;i < Short.MAX_VALUE; i++){
            if(i%15001 ==0){
                System.out.println(i);
            }*/
            //Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
            // Числа, кратные 11, должны быть распечатаны синим цветом.
            // Числа, кратные 12, должны быть распечатаны красным цветом.
            // А ноль необходимо распечатать словом ZERO.
            for (int i = -10; i<35; i++) {
                if (i == 0) {
                    System.out.println("ZERO");
                } else if (i % 11 == 0) {
                    System.out.println("\u001b[34m" + i);
                } else if (i % 12 == 0) {
                    System.out.println("\u001b[31m" + i);
                }
            double start = 1;
                double end = 50;
                double step = 2.4;
                startEndStep(start, end, step);
                System.out.println();
                }
                }

    private static void startEndStep(double start, double end, double step) {
    }
}




