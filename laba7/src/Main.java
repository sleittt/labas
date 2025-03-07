import java.util.ArrayList;
import java.util.Scanner;

class Product{
    String name;
    String manufacturer;
    double price;
    int shelfLife;
    int kol;
    Product(String name,String manufacturer,double price,int shelfLife,int kol){
        this.name=name;
        this.manufacturer=manufacturer;
        this.price=price;
        this.shelfLife=shelfLife;
        this.kol=kol;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Product[] products = new Product[5];
        products[0] = new Product("Помидор красный","ОООБП",44.9, 14 ,20000);
        products[1] = new Product("Бананы желтые","Африка",49.9,10,10000);
        products[2] = new Product("Коровы взрослые","ОООБП",100,7300,100000000);
        products[3] = new Product("Песок желтый","Африка",0.99,999999999,999999999);
        products[4] = new Product("Моржик важный","ПенОбл",1000000,10950,1);
        ArrayList<String> manufacturers= new ArrayList<String>();
        for (int i=0; i<products.length; i++){
            if (manufacturers.contains(products[i].manufacturer) == false){
                manufacturers.add(products[i].manufacturer);
            }
        }
        System.out.printf("Введите производителя: \n");
        System.out.println(manufacturers.toString());
        String manufacture=in.next();
        for (int i=0; i<products.length; i++){
            if (products[i].manufacturer.equals(manufacture)){
                System.out.println(products[i].name);
            }
        }
    }
}