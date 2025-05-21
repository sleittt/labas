import java.util.Scanner;
class Singleton{
    private double x;
    private double y;
    private static Singleton obj=new Singleton();
    public void setХ(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }

public static Singleton getInstance(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите х");
        obj.x=in.nextDouble();
        System.out.println("Введите y");
        obj.y=in.nextDouble();
        return  obj;
}
    private Singleton(){
        this.x=0;
        this.y=1;
    }

    public void result(){
    if(y!=0)
        System.out.println("2*х+3/y = " + (2* this.x + 3/ this.y));
    else System.out.println("error");
    }

}
public class Main {
    public static void main(String[] args) {
        Singleton res =Singleton.getInstance();
        res.result();
    }
}