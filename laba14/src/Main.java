import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ip-aдрес");
        String ip=in.next();
        Pattern pattern = Pattern.compile("(((\\d?\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}\\3)");
        Matcher matcher = pattern.matcher(ip);
        if (matcher.find()) System.out.println("Корректный IP найден: " + matcher.group(1));
        else System.out.println("Корректный IP не найден");
    }
}