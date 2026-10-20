package Strings;

public class StringCompression {
    public static String GetStringCompressed(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int count = 1;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {

                count++;

            } else {
                if (count > 1) {
                    sb.append(str.charAt(i));
                    sb.append(count);
                    count = 1;
                } else if (count == 1) {
                    sb.append(str.charAt(i));
                    count = 1;

                }
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abcdddd";
        System.out.println(GetStringCompressed(str));
    }
}
