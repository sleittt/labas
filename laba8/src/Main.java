class Person{
    String firstname;
    String surname;
    String birthday;
    Person(String firstname, String surname, String birthday){
        this.firstname=firstname;
        this.surname=surname;
        this.birthday=birthday;
    }
    void getAll(){
        System.out.printf(this.firstname, this.surname, this.birthday);
    }
    void reading(Auto auto, Book book){
        System.out.printf("%s читает книгу %s про машину %s", this.firstname, book.name, auto.brand);
    }
}
class Auto{
    String brand;
    double engineCapacity;
    int releaseDate;
    Auto(String brand, double engineCapacity, int releaseDate){
        this.brand= brand;
        this.engineCapacity = engineCapacity;
        this.releaseDate = releaseDate;
    }
    void getAll(){
        System.out.printf(this.brand, this.engineCapacity, this.releaseDate);
    }
}
class Book {
    String name;
    String author;
    int releaseDate;
    Book(String name, String author, int releaseDate){
        this.name= name;
        this.author = author;
        this.releaseDate=releaseDate;
    }
    void getAll(){
        System.out.printf(this.name, this.author, this.releaseDate);
    }
}
public class Main {
    public static void main(String[] args) {
        Person P=new Person("Данил", "Калачев", "23.03.2008");
        Auto car=new Auto("Mercedes", 20000, 1999);
        Book book=new Book("Большой папа, бедный папа", "Лешенко К.В.", 999);
        P.reading(car,book);
    }
}