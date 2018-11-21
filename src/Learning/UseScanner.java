package Learning;

import java.util.Scanner;//we have to import java util package ,
public class UseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first name?");

        String name = scanner.nextLine();// it will read the scanner input return String
        System.out.println("What is your last name?");

        String  lastname = scanner.nextLine();
        System.out.println(lastname);
        int age = scanner.nextInt();
        System.out.println(age);
    }


}
