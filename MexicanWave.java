import java.util.Arrays;
import java.util.Objects;

public class MexicanWave {
    public static void main(String[] args) {
            String[] stringArray = wave("a       b    ");

            for (String word : stringArray)
            {
                System.out.println(word);
            }
    }

    public static String[] wave(String str) {
        String[] stringArray = new String[str.length()];


        if (Objects.equals(str, ""))
        {
            return stringArray;
        }

        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
        {
            charArray[i] = Character.toUpperCase(charArray[i]);
            stringArray[i] = String.valueOf(charArray);
            // then revert charArray back to lowercase
            charArray[i] = Character.toLowerCase(charArray[i]);
        }

        return stringArray;
    }

}