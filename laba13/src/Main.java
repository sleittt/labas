interface Product{
    String getName();
    void priceEdit();
    void ratingEdit();
}
interface User{
    void editPassword();
    String getLogin();
}
class Pen implements Product{
    String name;
    double price;
    double rating;
    Pen(String name, double price, double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void priceEdit() {
        this.price=price;
    }
    @Override
    public void ratingEdit() {
        this.rating=rating;
    }
}
class Pencil implements Product{
    String name;
    double price;
    double rating;
    Pencil(String name, double price, double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void priceEdit() {
        this.price=price;
    }

    @Override
    public void ratingEdit() {
        this.rating=rating;
    }
}
class PencilCase implements Product{
    String name;
    double price;
    double rating;
    PencilCase  (String name, double price, double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void priceEdit() {
        this.price=price;
    }

    @Override
    public void ratingEdit() {
        this.rating=rating;
    }
}

class Admin implements User{
    String login;
    String password;
    Admin(String login, String password){
        this.login=login;
        this.password=password;
    }
    @Override
    public void editPassword() {
    }
    @Override
    public String getLogin() {return this.login;}
}
class VIP implements User{
    String login;
    String password;
    VIP(String login, String password){
        this.login=login;
        this.password=password;
    }
    @Override
    public void editPassword() {
    }
    @Override
    public String getLogin() {return this.login;}
}
class Mod implements User{
    String login;
    String password;
    Mod(String login, String password){
        this.login=login;
        this.password=password;
    }
    @Override
    public void editPassword() {
    }
    @Override
    public String getLogin() {return this.login;}
}

class General implements User,Product{
    String name;
    double price;
    double rating;
    String login;
    String password;
    General(String name, double price, double rating, String login, String password){
        this.name=name;
        this.price=price;
        this.rating=rating;
        this.login=login;
        this.password=password;
    }
    @Override
    public void editPassword() {
    }
    @Override
    public String getLogin() {return this.login;}
    @Override
    public String getName() {return this.name;}
    @Override
    public void priceEdit() {
    }
    @Override
    public void ratingEdit() {
    }
    public void message(){
        System.out.printf("%s купил %s", getLogin(),getName());
    }
}
public class Main {
    public static void main(String[] args) {
    Pen A = new Pen("Ручка синяя", 19.99, 4.7);
    Pencil B = new Pencil("Карандаш простой", 9.99, 4.5);
    PencilCase C = new PencilCase("Пенял", 19.99, 4.2);

    Admin adm=new Admin("1234topp","123");
    VIP vip=new VIP("zaydi_f", "1234");
    Mod moderator=new Mod("Div111","arxt0p");

    General gen = new General("Ручка синяя", 19.99, 4.7,"1234topp","123");
    }
}