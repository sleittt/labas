import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int Length(String x, String y){
        if (x.length()>y.length()){
            return y.length();
        }
        else {
            return x.length();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        String result="";
        String ob="";
        char symbol = in.next().charAt(0);
        int code = Character.getNumericValue(symbol);
        String bin= Integer.toBinaryString(code);
        //String rand= Integer.toBinaryString(r.nextInt(0,36));
        String rand ="10001";
        int leng=Length(bin,rand);
        for (int i = 0; i < leng; i++) {
            if (rand.charAt(i)==bin.charAt(i))
            {
                result+=0;
            }
            else {
                result+=1;
            }
        }
        int len2=Length(result,rand);
        for (int i = 0; i < len2; i++) {
            if (result.charAt(i)==rand.charAt(i))
            {
                ob+=0;
            }
            else
            {
                ob+=1;
            }
        }
        System.out.println(code);
        System.out.println(bin);
        System.out.println(rand);
        System.out.println(result);
        System.out.println((char) Integer.parseInt(result, 2));
        System.out.println(ob);
    }
}