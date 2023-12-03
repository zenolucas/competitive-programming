import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if(isAnagram(a, b))
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }


    }

    static boolean isAnagram(String a, String b) {

        a = a.toLowerCase();
        b = b.toLowerCase();

        // Complete the function
        ArrayList<Character> arrayList = new ArrayList<>();

        // populate distinct let1ters in arrayList
        for (int i = 0; i < a.length(); i++)
        {
            char letter = a.charAt(i);
            if (!arrayList.contains(letter))
            {
                arrayList.add(letter);
            }
        }

        int count;
        Map<Character, Integer> map_stringA = new HashMap<>();
        // count distinct letter occurrence in String a, put in Map <distinctLetter, count>
        for (char letter : arrayList)
        {
            count = 0;
            for (int i = 0; i < a.length(); i++)
            {
                if (a.charAt(i) == letter)
                {
                    count ++;
                }
            }
            // put in map
            map_stringA.put(letter, count);
        }

        // then do the same for String b

        arrayList.clear();


        // populate distinct letters in arrayList
        for (int i = 0; i < b.length(); i++)
        {
            char letter = b.charAt(i);
            if (!arrayList.contains(letter))
            {
                arrayList.add(letter);
            }
        }

        Map<Character, Integer> map_stringB = new HashMap<>();
        // count distinct letter occurrence in String b, put in Map <distinctLetter, count>
        for (char letter : arrayList)
        {
            count = 0;
            for (int i = 0; i < b.length(); i++)
            {
                if (b.charAt(i) == letter)
                {
                    count ++;
                }
            }
            // put in map
            map_stringB.put(letter, count);
        }

        // to check
        for (char letter : arrayList)
        {
            if (!Objects.equals(map_stringA.get(letter), map_stringB.get(letter)))
            {
                return false;
            }
        }

        return true;
    }
}
