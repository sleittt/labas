import java.io.*;
import java.util.Scanner;

class Calculator implements Serializable{
    public double x;
    public double y;
    Calculator(double x){
        this.x=x;
        this.y=0;
    }
    public void calculate(){
        this.y=x-Math.sin(x);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator result=null;
        while (true) {
            try {
                System.out.println("Введите команду save/upload или значение x");
                String str = in.next();
                if(str.equalsIgnoreCase("exit")){
                    System.exit(0);
                }
                else if (str.equalsIgnoreCase("save")) {
                    if (result==null) {
                        System.out.println("Нет данных для сохранения");
                    }
                    else {
                        save(result);
                    }
                } else if (str.equalsIgnoreCase("upload")) {
                    if ("log.txt".length() == 0) {
                        System.out.println("Нет записей");
                    }
                    else {
                        System.out.println(upload().x);
                        System.out.println(upload().y);
                    }
                }
                else {
                    result = new Calculator(Double.parseDouble(str));
                    result.calculate();
                }
            } catch (NumberFormatException ex){
                System.out.println("Неверный ввод");
            }
        }
    }
        private static void save (Calculator res){
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("log.txt"))) {
                oos.writeObject(res);
                System.out.println("Данные сохранены.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static Calculator upload () {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("log.txt"))) {
                    return (Calculator) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
}

