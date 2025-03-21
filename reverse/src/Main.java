import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите А");
        double a=in.nextInt();
        System.out.println("Введите mod");
        double mod=in.nextInt();
        for (int i = 2; i <= a; i++) {
            if (a%i==0 && mod%i==0){
                System.out.println("Числа не взаимнопростые");
            }
        }
        for (int i = 1; i < mod; i++) {
            if ((a * i)%mod == 1) {
                System.out.println("Искомое число= " + i );
            }
        }
    }
}