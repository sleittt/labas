import java.util.Scanner;
class Person{
    private int age;
    public String names;
    public String telephone;
    Person(int age, String names, String telephone){
        this.age=age;
        this.names=names;
        this.telephone=telephone;
    }

    public int getAge() {
        return age;
    }
}
class Student extends Person{
    public int course;
    public String faculty;
    private int yearOfReceipt;
    public Student(int age, String names, String telephone, int course, String faculty,int yearOfReceipt){
        super(age, names, telephone);
        this.course=course;
        this.faculty=faculty;
        this.yearOfReceipt=yearOfReceipt;
    }
    public void getNamesAge(){
        System.out.printf("%s %s \n", this.names,getAge());
    }
    public void searchFaculty(String search){
        if (search.equals(this.faculty)){
            System.out.println(this.names);
        }
    }
    public void searchYear(int year){
        if (year < this.yearOfReceipt) {
            System.out.println(this.names);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student[] stud=new Student[3];
        stud[0]= new Student(16,"Кальгин Н.Г.", "89042653125", 1, "Отчислен",2024);
        stud[1]= new Student(18,"Лещенко К.В.", "НафигФон CMF1", 3, "Экономический",2021);
        stud[2]= new Student(40,"Божанов А.Д.", "89870768160", 2, "Экономический",2023);
        for (int i = 0; i < stud.length; i++) {
            stud[i].getNamesAge();
        }
        System.out.println("Введите факультет:");
        String forSearch=in.next();
        for (int i = 0; i < stud.length; i++) {
            stud[i].searchFaculty(forSearch);
        }
        System.out.println("Введите год:");
        int year=in.nextInt();
        for (int i = 0; i < stud.length; i++) {
            stud[i].searchYear(year);
        }
    }
}