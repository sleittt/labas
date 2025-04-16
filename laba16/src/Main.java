import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("code.txt");
        try(FileWriter fw = new FileWriter("code.txt"); BufferedReader br = new BufferedReader(new FileReader("codncom.txt"))){
            String line = br.readLine();
            while (line != null) {
                //System.out.println(line);
                line = br.readLine();
                if (line.contains("//") && (line.charAt(0) != '/') ){
                    fw.write(line.substring(0,line.indexOf("//")) + "\n");
                    System.out.println(line.substring(0,line.indexOf("//")) + "\n");
                } else if ((line.contains("//") && (line.charAt(0) == '/') || line.contains("/*"))) {
                }
                else {
                    fw.write(line + "\n");
                    System.out.println(line);
                }

                if(line.contains("/*")){
                    while(!line.contains("*/")){
                        line=br.readLine();
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (NullPointerException ex){

        }
    }
}