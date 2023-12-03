import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // inputs
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> mainArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int j = scanner.nextInt();

            for (int k = 0; k < j; k++)
            {
                arrayList.add(scanner.nextInt());
            }
            mainArrayList.add(arrayList);
        }

        // queries
        int q = scanner.nextInt();

        int x;
        int y;

        for (int i = 0; i < q; i++)
        {
            x = scanner.nextInt();
            y = scanner.nextInt();
            try
            {
                System.out.println(mainArrayList.get(x - 1).get(y - 1));
            }
            catch (Exception e)
            {
                System.out.println("ERROR!");
            }
        }

    }
}
