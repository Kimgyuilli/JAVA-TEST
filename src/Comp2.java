public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = "hello".equals("문자열1");
        boolean result3 = "hello".equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
