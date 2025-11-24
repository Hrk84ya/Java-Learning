import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the hashtable");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the key");
            String key = sc.next();
            System.out.println("Enter the value");
            int value = sc.nextInt();
            ht.put(key, value);
        }
        System.out.println("The hashtable is: ");
        Set<String> keys = ht.keySet();
        TreeSet<String> sortedKeys = new TreeSet<String>(keys);
        for (String key : sortedKeys) {
            System.out.println(key + " : " + ht.get(key));
        }
        sc.close();
    }
}
