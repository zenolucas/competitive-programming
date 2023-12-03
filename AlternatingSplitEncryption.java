public class AlternatingSplitEncryption {
    public static void main(String[] args) {

        System.out.println(encrypt("012345", 3));
    }


    public static String encrypt(final String text, final int n) {
        String answer = "";
        String temp = text;
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
        // Your code here
        return null;
    }
}
