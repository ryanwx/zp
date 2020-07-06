package ryan.day3;

public class PracticeString {
    public static void main(String[] args) {
        String s1 = "Hello";

        String s2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});    // "Hello"
        String s3 = new String(new char[]{'H', 'E', 'L', 'L', 'O'});    // "HELLO"

        // 字符串不可变，（可看 String 类源码，使用 final 修饰属性）
        System.out.printf("s1 == s2 ? : %b\n", s1 == s2);
        System.out.printf("s1 equals s2 ? : %b\n", s1.equals(s2));
        System.out.printf("s3 equals s1 ? : %b\n", s1.equalsIgnoreCase(s3));

        System.out.printf("s2 contains ll ? : %b\n", s2.contains("l"));
    }
}
