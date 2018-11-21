package Learning;

public class StringExample {
    public static void main(String[] args) {
        String st = "Hello";
        String st1 = st.substring(0,3);//this is like (int indexbegin , int indexend)
        String st2= st.substring(1);
        //this is like (int indexbegin) it means index begin from 1,
        String st3 = "Welcome";
        String st4 = st3.substring(2);
        String st5 = st3.concat(st);// this method will concat two String as a one String
        int age = 31;
        System.out.println(st + " " + age);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st4);
        System.out.println(st5);
        System.out.println("Welcome"+ " " + "Hello");
    }
}
