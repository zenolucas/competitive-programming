import java.util.ArrayList;
import java.util.Objects;

public class MexicanWave {
    public static void main(String[] args) {
            String[] stringArray = wave("a     b    ");

            for (String word : stringArray)
            {
                System.out.println(word);
            }
    }

    public static String[] wave(String str) {
        ArrayList<String> arrayList = new ArrayList<>();

        if (Objects.equals(str, ""))
        {
            return new String[]{};
        }

        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++)
        {
            // if character is a not a space
            if (!Character.toString(charArray[i]).equals(" ")) {
                // make the current 'wave' character uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
                // add string sequence w/ 1 uppercase char to arraylist
                arrayList.add(String.valueOf(charArray));
                // then revert charArray back to lowercase
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }

        // transfer contents of arrayList<string> to string array
        String[] stringArray = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++)
        {
            stringArray[i] = arrayList.get(i);
        }

        return stringArray;
    }
}