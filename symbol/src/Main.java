import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if(str.matches("[A-Я]{2}[a-я]{2}[0-9]{2}[!,@.#,$,%,^,&,*,(,),!,\",№,;,%,:,?,*]{2}")){
            System.out.println("Строка удовлетворяет условию" );
        }
    }
}