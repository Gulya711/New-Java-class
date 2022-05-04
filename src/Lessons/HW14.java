package Lessons;

import java.util.Locale;

public class HW14 {
    // vernut     "happy bithday" bez probela vperedi slova
    // vernut slovo s bolshoy bukvoy "HAPPY BIRTHDAY"
    public static  String capitalizedWords(String sentence) {
      //  String = "";
        if (sentence != null && sentence.length()!= 0){
            sentence= sentence.trim();}
            System.out.println(sentence);
            //Character.toString(sentence.charAt(0)).toUpperCase();
        System.out.println(sentence.toUpperCase());

        return "";
    }

    public static void main(String[] args) {
        capitalizedWords("happy birthday");

    }
}
