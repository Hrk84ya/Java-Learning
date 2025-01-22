import java.util.LinkedList;
import java.util.Scanner;

public class Queue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> q = new LinkedList<>();
        System.out.println("Enter the size of the queue: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the queue: ");
        for(int i=0;i<n;i++){
            q.add(sc.nextInt());
        }
        System.out.println("Queue: ");
        for(int i=0;i<n;i++){
            System.out.print(q.poll()+" ");
        }
        sc.close();
    }
}
