package Learning;
        import java .util .Scanner;

public class UseScannerClass {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Are you young?");
        String name = scr.nextLine();//scanner's role is read the user input , nextLine will read the nextline

        System.out.println("How old are you?");
        int i = scr.nextInt();// we put int will use nextInt() , cause it will return int ,
        System.out.println("What are you learning?");
        scr.next();
        System.out.println(name);
        System.out.println(i);

    }
}
