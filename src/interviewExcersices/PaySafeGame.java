package interviewExcersices;

public class PaySafeGame {
    public static void main(String[] args) {
        String s1 = new String("a").intern();
        String s2 = new String("a").intern();

        Integer a;
        Integer b;

        if (s1 == s2) {
            a = s1.length() + 126;
            b = s2.length() + 126;
        } else {
            a = s1.length() + 127;
            b = s2.length() + 127;
        }

        if (a == b) {
            System.out.println(a + b + ((s1 == s2) ? 284 : 184));
        } else {
            System.out.println(a = b+((s1 != s2) ? 184 : 284));
        }

        int j=12;
        for (int i=0; i<8; i++){
            j=j++;
            System.out.println(j);
        }

        hello(null);
    }

    public static void hello(String s){
        System.out.println("Skrill Money");
    }

    public static void hello(Object s){
        System.out.println("SMT");
    }

}
