package Lessons;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {

        //Создать массив catsNames, заполнить его любыми значениями
        String[] catsName = new String[8];
        catsName[0] = "Sher";
        catsName[1] = "Tigr";// chernish
        catsName[2] = "Myata";
        catsName[3] = "Pirat";
        catsName[4] = "Murzik";// rijik
        catsName[5] = "Tin";
        catsName[6] = "Konfeta";
        catsName[7] = "Kadjit";

        //for (int i = 0; i < catsName.length; i++) {
        //   System.out.println(catsName[i]);

//В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
// а значение элемента с индексом 1 на “Черныш”.
        catsName[4] = "Rijik";
        catsName[1] = "Chernish";
        //  System.out.println(catsName[i]);
        //имя кота в коробке с номером 6
        // System.out.println(catsName[6]);

        // Создать массив catsAges и заполнить его любыми значениями.
        int[] catAges = {1, 2, 3, 4, 5, 6, 7, 8};
        //Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        int p;
        for (p = 0; p < catAges.length; p++){
            if (catAges[p]>2){
                System.out.println("Отнеси кота на прививку"+ catAges[p]);
            }
        }

       // System.out.println(Arrays.toString(catAges));

        //имена котов из коробок с четными индексами
        {
            for (int i =0; i < catsName.length; i+=2){
               // System.out.println(catsName[i]);

                //имена котов из коробок, чьи индексы кратны 4
                for (i = 0; i < catsName.length; i +=4);
               // System.out.println(catsName[i]);

                // цвет котов из коробок с нечетными индексами
                for (i= 0; i < catsName.length; i++){
                    if (i%2==1) {
                       // System.out.println(catsName[i]);


                        // Создать массив catsColors и заполнить его значениями.

                        String[] catsColors = new String[5];
                        catsColors[0] = "red";
                        catsColors[1] = "grey";
                        catsColors[2] = "green";
                        catsColors[3] = "blue";
                        catsColors[4] = "pink";
                        System.out.println(catsColors.length);
                        // Распечатать “Накорми кота!” для всех серых котов
                        for (int s =0; s < catsColors.length; s++){
                            if (catsColors[s].equals("grey")){
                                System.out.println("Feed a "+ catsColors[s]+"cat");
                            }

                            }
                        }

                    }}
        }
    }

    }