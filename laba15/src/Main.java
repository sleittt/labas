import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File file = new File("notes.txt");
        System.out.println("Введите ip-aдрес");
        String ip=in.next();
        Pattern pattern = Pattern.compile("(((\\d?\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}\\3)");
        Matcher matcher = pattern.matcher(ip);
        try (FileWriter fw = new FileWriter("notes.txt")){
            if (matcher.find())
                fw.write("Корректный IP найден: " + matcher.group(1));
            else
                fw.write("Корректный IP не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}