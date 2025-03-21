interface User{
    void password();
    void login();
}
abstract class People{
    String name;
    int age;
    String title;
    People(String name, int age, String title){
        this.name=name;
        this.age=age;
        this.title=title;
    }
}
class Teacher extends People{
    Teacher(String name, int age, String title){
        super(name,age,title);
    }
}
class Student extends People{
    Student(String name, int age, String title){
        super(name,age,title);
    }
}
public class Main {
    public static void main(String[] args) {
        Teacher A= new Teacher("Иванов А.А", 35, "Учитель");
        Teacher B= new Teacher("Бобров Б.Б", 42, "Учитель");
        Student C= new Student("Волобуев В.В", 19, "Студент");
        Student D= new Student("Георгиева Г.Г", 20, "Студент");
    }
}