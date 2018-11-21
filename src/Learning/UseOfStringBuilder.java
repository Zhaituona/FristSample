package Learning;

public class UseOfStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello StringBuilder");
        String st1= "Hello world ";
        StringBuilder str3 = new StringBuilder("Welcome");
        str.toString();
        str.insert(3,5);//StringBuilder will can change the String , it will change the String
        System.out.println(str);
        System.out.println(str.insert(2,'c'));
        System.out.println(str.insert(1,1.2));
        System.out.println(str.indexOf(st1));
        System.out.println(str3.indexOf(st1));//don't understand

    }
}
