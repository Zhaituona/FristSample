package Learning;

public class StringMoreMethod {


    public static void main(String[] args) {
        String st = "Hello";
        String st1 = "hello";
        String st3 = "Hillo";
        boolean i =st1.equals(st);// like equals(object anobject)
        boolean b = st.equals(st3);// this method will return boolean type , it means true or false
        boolean c = st.equalsIgnoreCase(st1);// equalesIgnoreCase(String str)
       // System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        String st4 = "Welcome";
        String st5 = "Good Morning";
        String st6 = "Hello Java";
        st5.charAt(5);
        int x = st5.length();
        int h =st4.length();// it will return the length of the String , int type

        char a =st4.charAt(3);// it will return the char in that index , type is char
        System.out.println(h);
        System.out.println(a);
        System.out.println(x);

        System.out.println(st5.charAt(5));
        System.out.println(st6.length());
        System.out.println(st6.charAt(3));
        System.out.println(st4.codePointAt(3));// it will return Unico code , return type is int
        System.out.println(st5.compareTo(st4));// don't understand
        System.out.println(st5.indexOf(3));// don't understand
        System.out.println(st4.replace('l','c'));
        System.out.println(st.replace('H','c'));//  have to write same as the character , if capital the capital
        System.out.println(st.toUpperCase());// it will return the String changed to the Upper case all letter .
        System.out.println(st.toLowerCase());
    }
}
