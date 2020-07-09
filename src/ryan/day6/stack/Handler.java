package ryan.day6.stack;

import java.util.Stack;

public class Handler {
    public static void main(String[] args) throws Exception {
        String a = "3028";
        int b = Integer.parseInt(a);
        String hexString = toHex(b);

        System.out.printf("%s to hex is：%s\n", a, hexString);
    }

    static String toHex(int n) throws Exception{
        if (n == 0){
            return getHexString(n);
        }
        Stack<String> stack = new Stack<>();
        while (n > 0){
            int remainder = n % 16;
            stack.push(getHexString(remainder));
            n = n / 16;
        }

        StringBuilder hexString = new StringBuilder();

        while (!stack.empty()){
            hexString.append(stack.pop());
        }

        return hexString.toString();
    }

    static String getHexString(int n) throws Exception{
        if (n >= 16){
            throw new Exception("n cannot bigger then 16");
        }

        switch (n){
            case 10:
                return "a";
            case 11:
                return "b";
            case 12:
                return "c";
            case 13:
                return "d";
            case 14:
                return "e";
            case 15:
                return "f";
            default:
                return String.valueOf(n);
        }
    }
}
