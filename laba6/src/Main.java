import java.util.Scanner;
class Reader{
    String name;
    static int id=1;
    String facultet;
    String DoB;
    String p_number;
    Reader(String name, String facultet, String DoB, String p_number){
        this.name = name;
        this.facultet= facultet;
        this.DoB=DoB;
        this.p_number=p_number;
    }
    public void takeBook(int kol){
        System.out.printf("%s взял %d книг/и \n", this.name, kol);
    }
    public void takeBook(String books){
        System.out.printf("%s взял книги: %s \n", this.name, books);
    }
    public void returnBook(int kol){
        System.out.printf("%s вернул %d книг/и \n", this.name, kol);
    }
    public void returnBook(String books){
        System.out.printf("%s вернул книги: %s \n", this.name, books);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            Reader P = new Reader("Петров В.В", "Информатика", "10.03.2006", "892798765432");
            Reader A = new Reader("Антонов А.А", "Архитектура", "16.06.2008", "892731165432");
            Reader B = new Reader("Баранов Б.Б", "Педагогика", "20.05.2007", "892791945432");
            Reader C = new Reader("Сидоров С.С", "Пожарная безопасность", "19.01.2007", "892798645932");
            Reader D = new Reader("Маркарян А.Г", "Кассир", "30.02.1798", "8912345698765");
            Reader[] readers= new Reader[]{P,A,B,C,D};
        System.out.println("Сколько книг взял читатель? ");
        int kol=in.nextInt();
        P.takeBook(kol);
        String books = "";
        if (kol > 0){
            for(int i = 0; i < kol; i++){
                System.out.println("Название книги: ");
                books += in.next()+", ";
            }
            P.takeBook(books.substring(0,books.length()-3));
        }
        System.out.println("Cколько книг вернул читатель? ");
        kol = in.nextInt();
        P.returnBook(books);
        books="";
        if(kol > 0){
            for(int i = 0; i < kol; i++){
                System.out.println("Название книги: ");
                books += in.next()+", ";
            }
           P.returnBook(books.substring(0,books.length()-3));
        }
        }
}

