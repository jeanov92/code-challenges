package hackerrank.preparation.day3.caesarCipher;

public class CaesarCipher {

    public static String caesarCipher(String s, int k) {
        String encrypted = "";
        k = k > 26 ? k % 26 : k;

        for (char c : s.toCharArray()) {
            if (c < 65 || c > 122 || c > 90 && c < 97) {
                encrypted += c;
            } else if (c >= 65 && c <= 90 && c + k > 90 || c + k > 122) {
                encrypted += Character.valueOf((char) (c + k - 26));
            } else {
                encrypted += Character.valueOf((char) (c + k));
            }

        }

        return encrypted;
    }
}
