import java.util.Arrays;

public class HW10 {
    public static void main(String[] args) {
        int[]a={1,2,3,4};
        int[]s={9,8,7};
        int[] x= new int[a.length];
        for (int i =0;i < a.length;i++){
            x[i]=a[i];
            if (i < s.length){
                x[i]+=s[i];
            }

        }
        System.out.println(Arrays.toString(x));
    }
}
