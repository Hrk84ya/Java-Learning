import java.util.Stack;

import java.util.Scanner;
public class PGE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("Previous Greater Element: ");
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
