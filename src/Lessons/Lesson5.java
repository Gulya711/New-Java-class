package Lessons;

import java.sql.SQLOutput;

public class Lesson5 {
    //Написать метод, который принимает на вход десятичное число
    // (например, 10.75), и возвращает строку “10 руб 75 коп”
    //SOLVE#1
   /* public static String seperateMoney(double a) {
        String ofMoney = Double.toString(a);
        String rub = ofMoney.substring(0, ofMoney.indexOf("."));
        String kop = ofMoney.substring(ofMoney.indexOf(".") + 1);
       // System.out.println(rub + "rub" + kop + "kop");
        String res = rub + "rub" + kop + "kop";
        return res;*/
    //SOLVE#2
    public static double printRubleAndKop (double price){
        int rubles =(int) price;
        double kop = price * 100 - rubles * 100;
       int kop1 = (int)kop;
        System.out.println( rubles + "rub" + kop1 +"kop");
        return kop;
    }
//Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.
public static double printKiloAndGramm (double weight){
        int kilo = (int)weight;
        double gram = weight - kilo;
        double gram1 = gram * 1000;
        int gram2 =(int)gram1;
    System.out.println(kilo + "kg" + gram2+"gr. ");
    return gram;
}


    public static void main(String[] args) {
        System.out.println(printRubleAndKop(10.75));
        System.out.println(printKiloAndGramm(34.09));


    }
}

