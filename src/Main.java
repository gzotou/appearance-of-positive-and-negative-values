public class Main {
    public static void main(String[] args) {
        int iPos = 123, iNegVal = -456;

        String s1 = String.format("%d", iPos);
        String s2 = String.format("%d", iNegVal);

        System.out.println(s1);
        System.out.println(s2);

        String s3 = String.format("% d", iPos);
        String s4 = String.format("% d", iNegVal);

        System.out.println(s3);
        System.out.println(s4);

        String s5 = String.format("%+d", iPos);
        String s6 = String.format("%+d", iNegVal);

        System.out.println(s5);
        System.out.println(s6);

        String s7 = String.format("% (d", iPos);
        String s8 = String.format("%(d", iNegVal);

        System.out.println(s7);
        System.out.println(s8);
    }
}
