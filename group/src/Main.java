import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите А");
        double a=in.nextInt();
        System.out.println("Введите B");
        double b=in.nextInt();
        System.out.println("Введите mod");
        double mod=in.nextInt();
        System.out.println("Введите действие");
        String deistv=in.next();
        double res=-1;
        switch (deistv){
            case "*":
                res = (a*b)%mod;
                break;
            case "+":
                res = (a+b)%mod;
                break;
            case "^":
                res = (Math.pow(a,b))%mod;
                break;
            default:
                System.out.println("Неправильный ввод");
        }
        System.out.println(res);
    }
}