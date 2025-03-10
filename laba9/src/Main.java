import java.util.Scanner;
class Student{
    private String names;
    private int dateOfReceipt;
    private String address;
    private String telephone;
    private int course;
    private String faculty;
    Student (String names, int dateOfReceipt, String address, String telephone, int course, String faculty) {
        this.names=names;
        this.dateOfReceipt=dateOfReceipt;
        this.address=address;
        this.telephone=telephone;
        this.course=course;
        this.faculty=faculty;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setDateOfReceipt(int dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }
    public void searchFaculty(String faculty){
        if (faculty.equals(this.faculty)) {
            System.out.println(this.names);
        }
    }
    public void searchYear(int year){
        if (year < this.dateOfReceipt) {
            System.out.println(this.names);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Student[] students= new Student[3];
        students[0] =new Student("Китанькин Д.А.", 2023, "Рахманинова 4", "POCO X3", 2, "Информационные системы и программирование");
        students[1]=new Student("Божанов А.Д.", 2023, "Тепличная 41", "89870768160", 2, "Отчислен");
        students[2]=new Student("Очечкин И.В.", 2022, "Избушка", "Iphone", 3, "Информационные системы и программирование");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getNames());
        }
        System.out.println("Введите факультет:");
        String fac=in.next();
        for (int i = 0; i < students.length; i++) {
            students[i].searchFaculty(fac);
        }
        System.out.println("Введите год поступления:");
        int year=in.nextInt();
        for (int i = 0; i < students.length; i++) {
            students[i].searchYear(year);
        }
    }
}