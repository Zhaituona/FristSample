package Learning;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\Elzat\\eclipse-workspace\\FirstSample\\src\\Learning\\me.txt"));
        in.nextLine();

       PrintWriter out = new PrintWriter("me.txt");
        System.out.println(in);
    }
}
