import java.util.Scanner;

class formulas{
    double a;
    double b;
    double x;
    formulas(double x){
        this.x=x;
    }
    formulas(double a, double b){
        this.a=a;
        this.b=b;
    }
    formulas(double a, double b,double x){
        this.a=a;
        this.b=b;
        this.x=x;
    }
    public void formulae1(){
        System.out.printf("1) y = %f \n", (3*this.x)+5);
    }
    public void formulae2(){
        if(this.a - this.b!=0) {
            System.out.printf("2) y = %f \n", (this.a + this.b) / (this.a - this.b));
        }
        else {
            System.out.println("2) В знаменателе получился 0");
        }
    }
    public void formulae3(){
        System.out.printf("3) y = %d \n", factorial((this.a*this.x)/this.b) );
    }
    public int factorial(double ans){
        int factorial = 1;

        for (int i = 1; i <= ans; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        formulas one=new formulas(scanner.nextDouble());
        System.out.println("Введите a и b:");
        formulas two=new formulas(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Введите a,b,x:");
        formulas three=new formulas(scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble());
        one.formulae1();
        two.formulae2();
        three.formulae3();
    }
}