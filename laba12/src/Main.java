interface User{
    void password(String password);
    void login(String login);
}
abstract class People implements User{
    String name;
    int age;
    String title;
    String login;
    String password;
    People(String name, int age, String title, String login, String password){
        this.name=name;
        this.age=age;
        this.title=title;
        this.login=login;
        this.password=password;
    }

    @Override
    public void login(String login) {
        this.login=login;
    }

    @Override
    public void password(String password) {
        this.password=password;
    }
}
class Teacher extends People{
    Teacher (String name, int age, String title, String login, String password){
        super(name, age, title, login, password);
    }

}
class Student extends People{
    Student (String name, int age, String title, String login, String password){
        super(name, age, title, login, password);
    }
}
public class Main {
    public static void main(String[] args) {
        Teacher A= new Teacher("Иванов А.А", 35, "Учитель", "ivanOv1283787123","1234567890");
        Teacher B= new Teacher("Бобров Б.Б", 42, "Учитель", "SidimSBobromZaStolom","vdv03m");
        Student C= new Student("Волобуев В.В", 19, "Студент", "sdjfohj123", "123456789");
        Student D= new Student("Георгиева Г.Г", 20, "Студент", "123456", "654321");
    }
}