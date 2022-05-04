package Lessons;

public class Repeating {
    // write method , that accept two parametrs
    // PRICE and TOTAL of item ( might be weight, of item,or quantity in pieces)
    // algoritm should return total of shoping in decimals
    public static double countTotalPrice(double price, double amount) {
        double totalPrice =0;
        totalPrice = price * amount;

        return totalPrice;
    }

    public static String countTotalPrice1(double price, double amount){
        double totalPrice = 0;
        totalPrice = price * amount;
        String totalPriceWithRubles = totalPrice + "rub";

        return  totalPriceWithRubles;
    }

    public static boolean countTotalPrice2 (double price, double amount) {
        double totalPrice =0;
        totalPrice = price * amount;
        boolean flag = false;
        String totalPriceWithRubles = totalPrice + "rub";
        if (totalPrice > 5){
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {

        System.out.println(countTotalPrice(0.35, 10)+"rub");
        System.out.println(countTotalPrice1(6, 2));

        System.out.println("____________________");
        countTotalPrice(0.35, 10);

        System.out.println("_____________");
        System.out.println(countTotalPrice2(0.35, 10));
        System.out.println(countTotalPrice2( 6, 2));

        System.out.println("--------------");
        System.out.println(countTotalPrice2(0.35, 10));
        System.out.println(countTotalPrice2(6,2));

    }
}

