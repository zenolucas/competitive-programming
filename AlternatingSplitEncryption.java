import java.util.ArrayList;
import java.util.Objects;

public class AlternatingSplitEncryption {
    public static void main(String[] args) {
        String input = "hskt svr neetn!Ti aai eyitrsig";
        System.out.println(input.length());

        System.out.println(decrypt(input, 1));
    }


    public static String encrypt(final String text, final int n) {
        String answer = "";
        String temp = text;

        if (text == null)
        {
            return null;
        }

        if (n <= 0 || Objects.equals(text, ""))
        {
            return text;
        }

        for (int i = 0; i < n; i++)
        {
            answer = "";

            // concatenate odd;
            for (int j = 0; j < temp.length(); j++)
            {
                if (j % 2 != 0)
                {
                    answer += temp.charAt(j);
                }
            }

            // concatenate even
            for (int j = 0; j < temp.length(); j++)
            {
                if (j % 2 == 0)
                {
                    answer += temp.charAt(j);
                }
            }

            temp = answer;
        }
        return answer;
    }

    public static String decrypt(final String encryptedText, final int n) {
        String decryptedText = "";
        String temp = encryptedText;

        if (encryptedText == null)
        {
            return null;
        }

        if (n <= 0 || Objects.equals(encryptedText, ""))
        {
            return encryptedText;
        }

        for (int a = 0; a < n; a++)
        {
            decryptedText = "";

            if (encryptedText.length() % 2 == 0)
            {
                // I want to split the encryptedText into two, then alternate between them
                String firstHalf = temp.substring(0, temp.length()/2);
                String secondHalf = temp.substring(temp.length()/2);

                char[] charArrayOdd = firstHalf.toCharArray();
                char[] charArrayEven = secondHalf.toCharArray();

                // construct decryptedText
                for (int i = 0; i < temp.length() / 2; i++)
                {
                    decryptedText += charArrayEven[i];
                    decryptedText += charArrayOdd[i];
                }
                temp = decryptedText;
            }
            else
            {
                String firstHalf = temp.substring(0, temp.length()/2);
                String secondHalf = temp.substring(temp.length()/2);

                char[] charArrayEven = firstHalf.toCharArray();
                char[] charArrayOdd = secondHalf.toCharArray();

                // construct decryptedText
                for (int i = 0; i < temp.length() / 2; i++)
                {
                    decryptedText += charArrayOdd[i];
                    decryptedText += charArrayEven[i];
                }

                // then add the last odd character
                decryptedText += charArrayOdd[charArrayOdd.length - 1];
                temp = decryptedText;
            }
        }

        return decryptedText;
    }
}
