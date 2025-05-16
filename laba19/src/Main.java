enum Sizes{
    XXS(32){
        @Override
        String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),S(36),M(38),L(40);
    int euroSize;
    Sizes(int euroSize){
        this.euroSize=euroSize;
    }
    String getDescription(){
        return"Взрослый размер";
    }
}
interface manCloth{
    void manDress();
}
interface womanCloth{
    void womenDress();
}
abstract class Cloth{
    Sizes size;
    int price;
    String color;
    Cloth(Sizes size,int price,String color){
        this.size=size;
        this.price=price;
        this.color=color;
    }
}
class Tshirt extends Cloth implements manCloth, womanCloth{
    Tshirt(Sizes size,int price,String color){
        super(size, price, color);
    }

    @Override
    public void manDress() {
        System.out.println("Мужская футболка");
    }

    @Override
    public void womenDress() {
        System.out.println("Женская футболка");
    }
}
class Pants extends Cloth implements manCloth, womanCloth{
    Pants(Sizes size, int price, String color){
        super(size, price, color);
    }

    @Override
    public void manDress() {
        System.out.println("Мужские штаны");
    }

    @Override
    public void womenDress() {
        System.out.println("Женские штаны");
    }
}
class Skirt extends Cloth implements womanCloth{
    Skirt(Sizes size, int price, String color){
        super(size, price, color);
    }

    @Override
    public void womenDress() {
        System.out.println("Юбка");
    }
}
class Tie extends Cloth implements manCloth{
    Tie(Sizes size, int price, String color){
        super(size, price, color);
    }

    @Override
    public void manDress() {
        System.out.println("Галстук");
    }

}
class Atelier {

    public void manDress(Cloth[] clothes) {
        System.out.println("\nМужская одежда:");
        for (Cloth item : clothes) {
            if (item instanceof manCloth) {
                ((manCloth) item).manDress();
            }
        }
    }
    public void womenDress(Cloth[] clothes) {
        System.out.println("Женская одежда:");
        for (Cloth item : clothes) {
            if (item instanceof womanCloth) {
                ((womanCloth) item).womenDress();
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Cloth[] clothes = {
                new Tshirt(Sizes.S, 350, "Красный"),
                new Pants(Sizes.M, 500, "Синий"),
                new Skirt(Sizes.XS, 200, "Черный"),
                new Tie(Sizes.L, 100, "Серый")
        };

        Atelier atelier = new Atelier();
        atelier.womenDress(clothes);
        atelier.manDress(clothes);
    }
}