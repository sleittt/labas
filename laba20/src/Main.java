class Singleton{
    private double х;
    private double y;
    private static Singleton obj=new Singleton();

public static Singleton getInstance(){
    return  obj;
}
    private Singleton(){
        this.х=4.0;
        this.y=6;
    }
    public void result(){
        System.out.println("2*х+3/y = " + (2* this.х + 3/ this.y));
    }

}
public class Main {
    public static void main(String[] args) {
        Singleton res =Singleton.getInstance();
        res.result();
    }
}