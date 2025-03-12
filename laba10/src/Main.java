class Animal{
    String food;
    String location;
    Animal(String food, String location){
        this.food=food;
        this.location=location;
    }
    public void makeNoise(){
        System.out.println("Животное издает звук");
    }
    public void eat(){
        System.out.printf("Животное ест %s", this.food);
    }
    public void sleep(){
        System.out.println("Животное спит");
    }
}

class Dog extends Animal{
    boolean noseIsWet;
    public Dog(String food,String location){
        super(food,location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака гавкает");
    }
    @Override
    public void eat() {
        System.out.printf("Собака ест %s", this.food);
    }
}

class Horse extends Animal{
    int hooves;
    public Horse(String food,String location){
        super(food,location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь игогокает");
    }
    @Override
    public void eat() {
        System.out.printf("Лошадь ест %s", this.food);
    }
}
class Cat extends Animal{
    boolean isBald;
    public Cat(String food,String location){
        super(food,location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мяукает");
    }
    @Override
    public void eat() {
        System.out.printf("Кот ест %s", this.food);
    }
}
class Veterinar{
    void treatAnimal(Animal animal){
        System.out.println(animal.food+ " " +" "+ animal.location);
    }
}
public class Main {
    public static void main(String[] args) {

    }
}